/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Cart;
import entities.Item;
import entities.Itemdetail;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.CartFacadeLocal;

/**
 *
 * @author HieuLe
 */
public class DeleteToCartServlet extends HttpServlet {

    @EJB
    private CartFacadeLocal cartFacade;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet DeleteToCartServlet</title>");
//            out.println("</head>");
//            out.println("<body>");
            out.write("<script> alert('Xóa thành công')</script>");
//            out.println("</body>");
//            out.println("</html>");
        }
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        try {
            int stt = Integer.parseInt(request.getParameter("STT"));
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("currentSessionCart");
            if (cart == null) {
                processRequest(request, response);
                writer.write("fail");
            } else {
                List<Itemdetail> itemdetailList = cart.getItemdetailList();
                cartFacade.setCart(itemdetailList);            // Set List<ItemDetail> vào trong Cart
                Itemdetail itemdetail = itemdetailList.get(stt);
                Item item = itemdetail.getItemID();
                cartFacade.removeItemInCart(stt);           //Remove Stt trong List<ItemDetail>
                writer.write("ok");
            }
        } catch (Exception e) {
            e.printStackTrace();
            writer.write("fail");
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
