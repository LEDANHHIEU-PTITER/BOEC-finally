<%-- 
    Document   : DetailBook
    Created on : Oct 27, 2017, 2:43:29 PM
    Author     : HieuLe
--%>
<%@page import="java.util.List"%>
<%@page import="entities.Itemdetail"%>
<%@page import="entities.Cart"%>
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
        <title>Cart Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="content-wrapper" >
            <% Cart cart = (Cart) session.getAttribute("currentSessionCart");
                List<Itemdetail> listItemDetails = cart.getItemdetailList();
                if (listItemDetails == null || listItemDetails.size() == 0) {%>
            <script>
                alert("Giỏ hàng trống");
            </script>
            <%} else {
                double amount = 0;
            %>
            <div class="row" style="margin-top: 100px" >
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>STT</th>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Loại mặt hàng</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (int i = 0; i < listItemDetails.size(); i++) {%>
                        <tr>
                            <td> <%=listItemDetails.get(i).getItemID().getId()%></td>
                            <td> <%=listItemDetails.get(i).getItemID().getName()%></td>
                            <td> <%=listItemDetails.get(i).getItemID().getPrice()%></td>
                            <td> <%=listItemDetails.get(i).getQuantity()%></td>
                            <td> <%=listItemDetails.get(i).getItemID().getCategoryID().getNameCategory()%></td>
                            <td>Edit</td>
                            <td> <button onclick="XoaItemInCart(<%=i%>);">Delete</button></td>
                            <!--<td> <a href="http://localhost:8080/BOEC-finally-war/DeleteToCartServlet?STT=<%=i%>">Delete</a></td>-->
                        </tr>
                        <% amount += listItemDetails.get(i).getItemID().getPrice() * listItemDetails.get(i).getQuantity();
                            }%>
                    </tbody>
                </table>
            </div>
            <div class="row">
                <div class="col-lg-offset-6 col-lg-2">
                    <h2>Tổng tiền:</h2>
                </div>
                <div class="col-lg-3">
                    <h2><span style="color: red"><%=amount%></span> </h2>
                </div>
                <div class="col-lg-1">
                    <h2>VNĐ </h2>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-offset-11">
                    <a class="btn btn-primary"> Thanh toán</a>
                </div>
            </div>
            <%}%>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>    
    </body>
</html>
