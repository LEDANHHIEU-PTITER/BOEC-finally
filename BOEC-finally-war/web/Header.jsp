<%-- 
    Document   : Header
    Created on : Oct 10, 2017, 9:38:52 AM
    Author     : HieuLe
--%>
<%@page import="entities.customer.Customer"%>
<%@page import="entities.cart.Cart"%>
<%@page import="GenerateID.GenerateSequenceID"%>
<%@page import="entities.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session.getAttribute("currentSessionCart") == null) {
        Cart cart = new Cart();     //Set Session giỏ hàng.
        GenerateSequenceID generateSequenceID = new GenerateSequenceID();
        long idGioHang = generateSequenceID.creatIDbyDateTime();
        cart.setId(idGioHang + "");
        session.setAttribute("currentSessionCart", cart);
    }
%>
<header>
    <div class="content-wrapper">
        <div class="float-left">
            <a class="site-title" href="http://localhost:8080/BOEC-finally-war/HomeServlet">Hieu Store</a>
        </div>
        <div class="float-right">
            <nav>
                <ul id="menu">
<!--                    <li><a href="http://localhost:8080/BOEC-finally-war/Cart.jsp" id ="btnGioHang" onclick="xemgiohang()">Giỏ hàng</a></li>-->
                    <li><a href="http://localhost:8080/BOEC-finally-war/Cart.jsp">Giỏ hàng</a></li>
                    |
                    <li><a href="#Register" id ="btnDangKy">Đăng ký</a></li>
                    |
                    <%
                        Customer customer = null;
                        if (session.getAttribute("currentSessionUser") != null) {
                            customer = (Customer) session.getAttribute("currentSessionUser");
                    %>
                    <li>
                        <span class="alert alert-info"> Wellcome <%=customer.getPerson().getName()%></span>
                    </li>
                    |
                    <li><a href="" id="btnThoat">Thoát</a></li>
                        <%} else {%>
                    <li><a href="#Login" id="btnDangnhap">Đăng nhập</a></li>
                        <%}%>

                </ul>
            </nav>
        </div>
    </div>
</header>
