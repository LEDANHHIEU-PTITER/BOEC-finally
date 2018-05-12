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
        <style>.fb-livechat,.fb-widget{display:none}.ctrlq.fb-button,.ctrlq.fb-close{position:fixed;right:24px;cursor:pointer}.ctrlq.fb-button{z-index:1;background:url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/PjwhRE9DVFlQRSBzdmcgIFBVQkxJQyAnLS8vVzNDLy9EVEQgU1ZHIDEuMS8vRU4nICAnaHR0cDovL3d3dy53My5vcmcvR3JhcGhpY3MvU1ZHLzEuMS9EVEQvc3ZnMTEuZHRkJz48c3ZnIGVuYWJsZS1iYWNrZ3JvdW5kPSJuZXcgMCAwIDEyOCAxMjgiIGhlaWdodD0iMTI4cHgiIGlkPSJMYXllcl8xIiB2ZXJzaW9uPSIxLjEiIHZpZXdCb3g9IjAgMCAxMjggMTI4IiB3aWR0aD0iMTI4cHgiIHhtbDpzcGFjZT0icHJlc2VydmUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgeG1sbnM6eGxpbms9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsiPjxnPjxyZWN0IGZpbGw9IiMwMDg0RkYiIGhlaWdodD0iMTI4IiB3aWR0aD0iMTI4Ii8+PC9nPjxwYXRoIGQ9Ik02NCwxNy41MzFjLTI1LjQwNSwwLTQ2LDE5LjI1OS00Niw0My4wMTVjMCwxMy41MTUsNi42NjUsMjUuNTc0LDE3LjA4OSwzMy40NnYxNi40NjIgIGwxNS42OTgtOC43MDdjNC4xODYsMS4xNzEsOC42MjEsMS44LDEzLjIxMywxLjhjMjUuNDA1LDAsNDYtMTkuMjU4LDQ2LTQzLjAxNUMxMTAsMzYuNzksODkuNDA1LDE3LjUzMSw2NCwxNy41MzF6IE02OC44NDUsNzUuMjE0ICBMNTYuOTQ3LDYyLjg1NUwzNC4wMzUsNzUuNTI0bDI1LjEyLTI2LjY1N2wxMS44OTgsMTIuMzU5bDIyLjkxLTEyLjY3TDY4Ljg0NSw3NS4yMTR6IiBmaWxsPSIjRkZGRkZGIiBpZD0iQnViYmxlX1NoYXBlIi8+PC9zdmc+) center no-repeat #0084ff;width:60px;height:60px;text-align:center;bottom:24px;border:0;outline:0;border-radius:60px;-webkit-border-radius:60px;-moz-border-radius:60px;-ms-border-radius:60px;-o-border-radius:60px;box-shadow:0 1px 6px rgba(0,0,0,.06),0 2px 32px rgba(0,0,0,.16);-webkit-transition:box-shadow .2s ease;background-size:80%;transition:all .2s ease-in-out}.ctrlq.fb-button:focus,.ctrlq.fb-button:hover{transform:scale(1.1);box-shadow:0 2px 8px rgba(0,0,0,.09),0 4px 40px rgba(0,0,0,.24)}.fb-widget{background:#fff;z-index:2;position:fixed;width:360px;height:435px;overflow:hidden;opacity:0;bottom:0;right:24px;border-radius:6px;-o-border-radius:6px;-webkit-border-radius:6px;box-shadow:0 5px 40px rgba(0,0,0,.16);-webkit-box-shadow:0 5px 40px rgba(0,0,0,.16);-moz-box-shadow:0 5px 40px rgba(0,0,0,.16);-o-box-shadow:0 5px 40px rgba(0,0,0,.16)}.fb-credit{text-align:center;margin-top:8px}.fb-credit a{transition:none;color:#bec2c9;font-family:Helvetica,Arial,sans-serif;font-size:12px;text-decoration:none;border:0;font-weight:400}.ctrlq.fb-overlay{z-index:0;position:fixed;height:100vh;width:100vw;-webkit-transition:opacity .4s,visibility .4s;transition:opacity .4s,visibility .4s;top:0;left:0;background:rgba(0,0,0,.05);display:none}.ctrlq.fb-close{z-index:4;padding:0 6px;background:#365899;font-weight:700;font-size:11px;color:#fff;margin:8px;border-radius:3px}.ctrlq.fb-close::after{content:'x';font-family:sans-serif}</style>
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
        <div class="row">
            <div id="fb-root" class="col-lg-offset-5"></div>
            <script>
                (function (d, s, id) {
                    var js, fjs = d.getElementsByTagName(s)[0];
                    if (d.getElementById(id))
                        return;
                    js = d.createElement(s);
                    js.id = id;
                    js.src = 'https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v3.0';
                    fjs.parentNode.insertBefore(js, fjs);
                }(document, 'script', 'facebook-jssdk'));
            </script>
            <div class="fb-comments" data-href="http://localhost:8080/BOEC-finally-war/DetailElectronic.jsp?STT_ITEM=<%=i%>" data-numposts="5"></div>
            <%}%>
        </div>

        <jsp:include page="Footer.jsp"></jsp:include>    
    </body>
</html>
