<%-- 
    Document   : Content
    Created on : Oct 10, 2017, 9:49:53 AM
    Author     : HieuLe
--%>

<%@page import="java.util.AbstractList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entities.Smartphone"%>
<%@page import="entities.Account"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="body">
    <!--Div Ảnh Hero-->
    <div class="bg-2">
        <div class="container text-center">
            <img src="images/BackgroupHero.jpg" alt="" width="100%" height="100%"/>
        </div>
    </div>
    <!--Div Tìm kiếm điện thoại-->
    <div class="searchDienThoai row">
        <div class="col-md-4">
            <div class="form-group input-group">
                <span class="input-group-addon">
                    <i class="fa fa-adn"></i>
                </span>
                <select class="form-control" id="category_id" name="category_id">
                    <option value="0">Tất cả</option>
                    <option value="1">Apple</option>
                    <option value="2">Samsung</option>
                    <option value="3">Xiaomi</option>
                    <option value="4">Sony</option>
                    <option value="5">Nokia</option>
                </select>
            </div>
        </div>
        <div class="col-md-8">
            <div class="form-group input-group">
                <input type="text" class="form-control" id ="txtTimKiemDienThoai" placeholder="Nhập tên điện thoại hoặc hãng sản xuất">
                <span class="input-group-btn">
                    <button class="btn btn-default" id="btnTimKiemDienThoai" type="button"><i class="fa fa-search"></i>
                    </button>
                </span>
            </div>
        </div>
    </div>

    <!-- Div danh sách điện thoại-->
    <div class="panel panel-default" style="margin-top: 5px">
        <div class="row">
            <div class="col-md-offset-4 col-md-4 text-center">
                <h4>
                    Danh sách điện thoại
                </h4>
            </div>
        </div>
    </div>
    <div class="row text-center" id="displayListDienThoai">

        <%
//            if (session.getAttribute("listSmartPhone") == null) {
//                
////                String site =  "http://localhost:8080/BOEC-finally-war/HomeServlet";
////                response.setHeader("Location", site); 
//////                response.sendRedirect();
//            }
            List<Smartphone> listSmartPhone = (ArrayList<Smartphone>) session.getAttribute("listSmartPhone");
            if (listSmartPhone == null) {
                listSmartPhone = new ArrayList<Smartphone>();
                String site = "http://localhost:8080/BOEC-finally-war/HomeServlet";
//                response.setHeader("Location", site); 
            }
            for (int i = 0; i < listSmartPhone.size(); i++) {
        %>
        <div class="col-lg-3">
            <div class="card">
                <img class="card-img-top" src="images/pic3.jpg" alt="">
                <div class="card-body">
                    <h4 class="card-title" style="color: blue"><%=listSmartPhone.get(i).getItem().getName()%></h4>
                    <p class="card-text" style="color: red"><%=listSmartPhone.get(i).getItem().getPrice()%></p>
                </div>
                <div class="card-footer">
                    <a href="http://localhost:8080/BOEC-finally-war/DetailElectronic.jsp?STT_ITEM=<%=i%>" class="btn btn-primary">Xem chi tiết</a>
                </div>
            </div>
        </div>
        <%}%>
    </div>
</div>