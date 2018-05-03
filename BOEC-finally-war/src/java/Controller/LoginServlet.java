/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Account;
import entities.Customer;
import entities.Person;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.AccountFacadeLocal;
import session.CustomerFacadeLocal;
import session.PersonFacadeLocal;

/**
 *
 * @author HieuLe
 */
public class LoginServlet extends HttpServlet {

    @EJB
    AccountFacadeLocal accountFacade;
    @EJB
    PersonFacadeLocal personFacade;
    @EJB
    CustomerFacadeLocal customerFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/text");
        response.setCharacterEncoding("UTF-8");
        try {
            String userName = request.getParameter("un");
            String passWord = request.getParameter("pw");

            Account account = accountFacade.login(userName, passWord);
            if (account != null) {        // Nếu đăng nhập thành công
                Person person = personFacade.findByAccountID(account);      // Lấy ra Person dựa vào khóa ngoại AccountID
                person.setAccountID(account);
                Customer customer = customerFacade.find(person.getId()); // Lấy ra Customer dựa vào khóa chính
                customer.setPerson(person);
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", customer);
                response.getWriter().write("ok");
//                response.sendRedirect("Home.jsp"); //logged-in page  
            } else {
                response.getWriter().write("fail");
//                response.sendRedirect("Home.jsp"); //error page 
            }
        } catch (Throwable theException) {
            System.out.println(theException);
            response.getWriter().write("fail");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
