/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import entities.customer.Customer;
import entities.person.Account;
import entities.person.Person;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.customer.CustomerFacadeLocal;
import session.person.AccountFacadeLocal;
import session.person.PersonFacadeLocal;

/**
 *
 * @author HieuLe
 */
public class RegisterServlet extends HttpServlet {

    @EJB
    private PersonFacadeLocal personFacade;

    @EJB
    private AccountFacadeLocal accountFacade;

    @EJB
    private CustomerFacadeLocal customerFacade;

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
//   
//        }
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
//        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String identifier = request.getParameter("identifier");
        String birthDay = request.getParameter("birthDay");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String number = request.getParameter("number");
        String email = request.getParameter("email");
        try {

//        Account account = new Account();
            Account account = accountFacade.findByUserName(userName);
            if (account == null) {
                account = new Account("ACC" + (100 + accountFacade.count())); // Set ID cho ACCOUNT trước khi thêm vào CSDL
                account.setUserName(userName);
                account.setPassWord(password);
                accountFacade.create(account);
                Person person = new Person();
                person.setAccountID(account);
                person.setId("CUSTOMER" + (100 + personFacade.count()));
                person.setName(name);
                person.setAddress(address);
                person.setNumber(number);
                person.setEmail(email);
                person.setGender(gender);

                SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
                Date parsed = format.parse(birthDay);
                java.sql.Date birth = new java.sql.Date(parsed.getTime());
                person.setBirthDay(birth);              //Set BirthDay
                person.setIdentifier(identifier);
                personFacade.create(person);  // Thêm Person vào CSDL
                
                Customer customer = new Customer();
                customer.setIsVip(0);  // Set khách hàng không phải VIP
                customer.setPerson(person);
                customer.setPersonID(person.getId());
                customerFacade.create(customer);    // Thêm Customer vào CSDL
                response.getWriter().write("ok");
            } else {
                response.getWriter().write("fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
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
