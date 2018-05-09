/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DataAccess.ConnectDB;
import Model.Account;

/**
 *
 * @author HieuLe
 */
public class AccountDAOImplement extends ConnectDB implements AccountDAO {

    private static AccountDAOImplement instance;

    public AccountDAOImplement() {
        ConnectDB intance = ConnectDB.getIntance();
    }

    public AccountDAOImplement getIntanceAccountDAOImplement() {
        if (instance == null) {
            instance = new AccountDAOImplement();
        }
        return instance;
    }

    public boolean addAccount(Account account) {
        String query = "INSERT INTO Account (id,userName, passWord) VALUES (?,?,?)";
        try {
            connect = openConnect();
            ps = connect.prepareStatement(query);
            ps.setString(1, account.getId());
            ps.setString(2, account.getUserName());
            ps.setString(3, account.getPassWord());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Account getAccountByID(int account_id) {
        String query = "SELECT * FROM Account WHERE id = ?";
        try {
            connect = openConnect();
            ps = connect.prepareStatement(query);
            ps.setInt(1, account_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getString(1));
                a.setUserName(rs.getString(2));
                a.setPassWord(rs.getString(3));
                return a;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Account getAccountByUserName(String username) {
        String query = "SELECT * FROM Account WHERE USERNAME = ?";
        try {
            connect = openConnect();
            ps = connect.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getString(1));
                a.setUserName(rs.getString(2));
                a.setPassWord(rs.getString(3));
                return a;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // return True nếu userName đã đăng ký - false nếu chưa
    public boolean checkUserName(String userName) {
        String query = "SELECT * FROM Account WHERE USERNAME = ?";
        try {
            connect = openConnect();
            ps = connect.prepareStatement(query);
            ps.setString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Nếu Login thành công thì sẽ trả về Account mới có ID và từ AccountID tìm ra Person
    public Account login(Account account) {
        String query = "SELECT * FROM Account WHERE USERNAME = ? AND PASSWORD = ?";
        try {
            connect = openConnect();
            ps = connect.prepareStatement(query);
            ps.setString(1, account.getUserName());
            ps.setString(2, account.getPassWord());
            rs = ps.executeQuery();
            while (rs.next()) {
                account = new Account();
                account.setId(rs.getString(1));
                account.setUserName(rs.getString(2));
                account.setPassWord(rs.getString(3));
            }
            return account;
        } catch (Exception e) {
            e.printStackTrace();
            return account;
        }
    }
}
