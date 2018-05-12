/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Controller;


import entities.Laptop;
import entities.cart.Category;
import entities.cart.Item;
import entities.item.electronic.Smartphone;
import entities.item.electronic.Tablet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.cart.CategoryFacadeLocal;
import session.cart.ItemFacadeLocal;
import session.item.electronic.ElectronicFacadeLocal;
import session.item.electronic.LaptopFacadeLocal;
import session.item.electronic.SmartphoneFacadeLocal;
import session.item.electronic.TabletFacadeLocal;


/**
 *
 * @author HieuLe
 */
public class AddElectronic extends HttpServlet {
    
    @EJB
    private ItemFacadeLocal itemFacade;
    
    @EJB
    private ElectronicFacadeLocal electronicFacade;
    @EJB
    private SmartphoneFacadeLocal smartphoneFacade;
    @EJB
    private TabletFacadeLocal tabletFacade;
    @EJB
    private LaptopFacadeLocal laptopFacade;
    @EJB
    private CategoryFacadeLocal categoryFacade;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddElectronic</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddElectronic at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        try {
            float eBattery = 0;
            String eCameraAfter = "";
            int eIsDVD;
            int eIsKeyBoardLight;
            String eType = request.getParameter("eType");
            String eName = request.getParameter("eName");
            int ePrice = Integer.parseInt(request.getParameter("ePrice"));
            int eQuantity = Integer.parseInt(request.getParameter("eQuantity"));
            String eCompanyID = request.getParameter("eCompanyID");
            float eScreenSize = Float.parseFloat(request.getParameter("eScreenSize"));
            String eOperaSystem = request.getParameter("eOperaSystem");
            float eWarrantyPeriod = Float.parseFloat(request.getParameter("eWarrantyPeriod"));
            
            Category category = categoryFacade.find("ELE"); // Danh mục ELectronic
            Item item = new Item("ITEM" + (1 + itemFacade.count()));
            item.setName(eName);
            item.setPrice(ePrice);
            item.setQuantity(eQuantity);
            item.setCategoryID(category);
//            item.setWarehouseEmployeePersonID(warehouseEmployeePersonID);
//            switch (){
//                case "SmartPhone": break;
//                case "Tablet": break;
//                case "LapTop": break;
//            }
            if (eType.equalsIgnoreCase("SmartPhone") || eType.equalsIgnoreCase("Tablet")) {       // Kiểm tra eType (Kiểu Electronic)
                eBattery = Float.parseFloat(request.getParameter("eBattery"));
                eCameraAfter = request.getParameter("eCameraAfter");
                if (eType.equalsIgnoreCase("SmartPhone")) {
                    Smartphone smartphone = new Smartphone();
                    smartphone.setItemID(item.getId());
                    smartphone.setItem(item);
                    smartphone.setBattery(eBattery);
                    smartphone.setCameraAfter(eCameraAfter);
                    smartphoneFacade.create(smartphone);
                } else if (eType.equalsIgnoreCase("Tablet")) {
                    Tablet tablet = new Tablet();
                    tablet.setItemID(item.getId());
                    tablet.setItem(item);
                    tablet.setBattery(eBattery);
                    tablet.setCameraAfter(eCameraAfter);
                    tabletFacade.create(tablet);
                }
            } else if (eType.equalsIgnoreCase("LapTop")) {
                eIsDVD = Integer.parseInt(request.getParameter("eIsDVD"));
                eIsKeyBoardLight = Integer.parseInt(request.getParameter("eIsKeyBoardLight"));
                Laptop laptop = new Laptop();
                laptop.setItemID(item.getId());
                laptop.setItem(item);
                laptop.setIsDVD(eIsDVD);
                laptop.setIsKeyBoardLight(eIsKeyBoardLight);
                laptopFacade.create(laptop);
            }
            // add Electronic
            writer.write("ok");
        } catch (Exception e) {
            e.printStackTrace();
            writer.write("fail");
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
