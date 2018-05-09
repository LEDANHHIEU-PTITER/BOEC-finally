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
public interface AccountDAO {

    // Thêm Account vào DB
    public boolean addAccount(Account account);

    //Lấy ra Account by ID
    public Account getAccountByID(int account_id);

    // Lấy ra Account by UserName
    public Account getAccountByUserName(String username);

    // return True nếu userName đã đăng ký - false nếu chưa
    public boolean checkUserName(String userName);

    // Nếu Login thành công thì sẽ trả về Account mới có ID và từ AccountID tìm ra Person
    public Account login(Account account);
}
