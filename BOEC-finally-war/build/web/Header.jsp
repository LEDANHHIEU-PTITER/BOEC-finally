<%-- 
    Document   : Header
    Created on : Oct 10, 2017, 9:38:52 AM
    Author     : HieuLe
--%>
<%@page import="entities.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<header>
    <div class="content-wrapper">
        <div class="float-left">
            <a class="site-title" href="http://localhost:8080/BOEC-finally-war/HomeServlet">Hieu Store</a>
        </div>
        <div class="float-right">
            <nav>
                <ul id="menu">
                    <li><a href="#Cart" id ="btnGioHang" onclick="xemgiohang()">Giỏ hàng</a></li>
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
<jsp:include page="Cart.jsp"></jsp:include>        

