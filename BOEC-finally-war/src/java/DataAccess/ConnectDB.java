/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HieuLe
 */
public class ConnectDB {

    protected Connection connect = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;
    private static ConnectDB connectDB;

    public ConnectDB() {
    }

    public static ConnectDB getIntance() {
        if (connectDB == null) {
            connectDB = new ConnectDB();
        }
        return connectDB;
    }

    /**
     * Check Driver connect to MySQL
     */
    protected void hasDriver() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            throw new Exception("Invalid Driver!!Please check this drver....");
        }
    }

    protected Connection openConnect() throws Exception {
        if (connect == null) {
            hasDriver();
            String url = "jdbc:mysql://localhost:3306/QuanLyBanHangOnline";
//            String url = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databasename=laptrinhmang";

            try {
                connect = DriverManager.getConnection(url, "root", "ledanhhieu");
//                this.connect = DriverManager.getConnection(url, "sa", "12345678");
            } catch (SQLException e) {
                throw new Exception(e.getMessage() + "Connect failed to database .... ");
            }
        }
        return connect;
    }

    public void closeConnet() throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (connect != null) {
            connect.close();
        }
    }

    public static void main(String[] args) throws Exception {
        ConnectDB connectDB = ConnectDB.getIntance();
        connectDB.openConnect();
    }
}
