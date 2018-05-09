<%-- 
    Document   : DetailItem
    Created on : May 1, 2018, 2:38:08 PM
    Author     : HieuLe
--%>

<%@page import="entities.item.electronic.Smartphone"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="javax.jms.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Thư viện Css--> 
        <link href="css/Site.css" rel="stylesheet" type="text/css"/>
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" />-->
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <!--Thư viện JS-->
        <script src="scripts/jquery.min.js" type="text/javascript"></script>
        <script src="scripts/bootstrap.min.js" type="text/javascript"></script>
        <title>Detail Electronic Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>

        <%
            int i = Integer.parseInt(request.getParameter("STT_ITEM"));
            if (request.getParameter("STT_ITEM") != null) {
                List<Smartphone> listSmartPhone = (ArrayList<Smartphone>) session.getAttribute("listSmartPhone");
                Smartphone smart = listSmartPhone.get(i);
        %>
        <div class="row" style="margin-top: 150px"></div>
        <div class="container" >
            <div class="row">
                <div class="col-md-3 col-md-offset-2">
                    <!--Div Chứa ảnh detail-->
                    <img class="" src="images/pic3.jpg" alt="">
                </div>
                <div class="col-md-6">                     
                    <!--Chứa thông tin mô tả-->
                    <div class="row">
                        <input id="DetailElectronicID" type="hidden" value="<%=smart.getItemID()%>">
                        <h4 class="card-title" style="color: blue" id="DetailElectronicName">Tên điện thoại: <%=smart.getItem().getName()%></h4>
                        <p class="card-text" style="color: red" id="DetailElectronicPrice">Giá bán: <%=smart.getItem().getPrice()%></p>
                        <p class="card-text" id="DetailElectronicOS">Hệ điều hành: <%=smart.getItem().getElectronic().getOperaSystem()%></p>
                        <p class="card-text" id="DetailElectronicScreenSize">Kích thước màn hình: <%=smart.getItem().getElectronic().getScreenSize()%> Inc</p>
                        <p class="card-text" id="DetailElectronicBattery">Dung Lượng Pin: <%=smart.getItem().getSmartphone().getBattery()%> </p>
                        <p class="card-text" id="DetailElectronicPublish">Hãng sãn xuất: <%=smart.getItem().getElectronic().getCompanyID().getName()%></p>
                        <div class="input-group">
                            <label class="control-label" style="width: 50%">Số lượng: </label>
                            <input class="input-sm" type="text" id="DetailElectronicCount" value="1" style="width: 100%" placeholder="Nhập số lượng">
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md-offset-5">
                    <button onclick="themvaogiohang()" class="btn btn-success" type="button" id="btnThemGioHang">Thêm vào giỏ hàng</button>
                    <button  class="btn btn-success" type="button" id="btnMuaNgay">Mua ngay</button>
                </div>
            </div>
        </div>
        <%}%>
        <jsp:include page="Footer.jsp"></jsp:include>    
    </body>
</html>
