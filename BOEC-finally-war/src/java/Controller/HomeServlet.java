/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Electronic;
import entities.cart.Category;
import entities.cart.Item;
import entities.item.electronic.Smartphone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.cart.ItemFacadeLocal;
import session.cart.CategoryFacadeLocal;
import session.item.electronic.ElectronicFacadeLocal;
import session.item.electronic.SmartphoneFacadeLocal;
//import session.AccountFacadeLocal;

/**
 *
 * @author HieuLe
 */
public class HomeServlet extends HttpServlet {

    @EJB
    private ItemFacadeLocal itemFacade;
    @EJB
    private ElectronicFacadeLocal electronicFacade;
    @EJB
    private SmartphoneFacadeLocal smartphoneFacade;
    @EJB
    private CategoryFacadeLocal categoryFacade;

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
        response.sendRedirect("Home.jsp");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Smartphone> listSmartPhone = new ArrayList<>();
            Category CategoryID = categoryFacade.find("ELE");                   // Lấy ra danh mục đồ điện tử
            List<Item> listEle = itemFacade.findByCategoryID(CategoryID);       // Lấy ra danh sách đồ điện tử theo danh mục
            for (Item item : listEle) {
                Electronic elec = electronicFacade.find(item.getId());          // Lấy ra danh sách đồ
                elec.setItem(item);
                Smartphone smartphone = smartphoneFacade.find(item.getId());
                smartphone.setItem(item);
                listSmartPhone.add(smartphone);                 // Thêm SmartPhone vào List SmartPhone
            }
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("listSmartPhone", listSmartPhone);
            response.sendRedirect("Home.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("Home.jsp");
        }
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
        processRequest(request, response);
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
