<%-- 
    Document   : Register
    Created on : Apr 29, 2018, 3:22:50 PM
    Author     : HieuLe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Thư viện Css -->
        <link href="css/Site.css" rel="stylesheet" type="text/css"/>
        <!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" />-->
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <!-- Thư viện JS-->
        <script src="scripts/jquery.min.js" type="text/javascript"></script>
        <script src="scripts/bootstrap.min.js" type="text/javascript"></script>
        <title>Register Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>

<!--            <div class="row col-lg-offset-5">
                <h1 class="center-block">Màn hình đăng ký</h1>
            </div>-->
            <div class="container">
                <div class="row col-lg-offset-4"><h1 class="center-block">Màn hình đăng ký</h1></div>
                <form class="form-horizontal" action="RegisterServlet" id="formRegister" method="POST" name="registration">
                    <div class="row">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-user"></i>
                                </span>
                                <input class="form-control" type="text"  placeholder="Nhập tên tài khoản" id="userName" name="userName"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-lock"></i>
                                </span>
                                <input class="form-control" type="password"  placeholder="Nhập password" id="password" name="password"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-lock"></i>
                                </span>
                                <input class="form-control" type="password"  placeholder="Nhập lại password" id="repassword" name="repassword"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-mail-forward"></i>
                                </span>
                                <input class="form-control" type="email"  placeholder="Nhập email" id="email" name="email"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-user"></i>
                                </span>
                                <input class="form-control" type="text"  placeholder="Nhập họ tên" id="name" name="name"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-adn"></i>
                                </span>
                                <input class="form-control" type="text"  placeholder="Nhập địa chỉ" id="address" name="address"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-credit-card"></i>
                                </span>
                                <input class="form-control" type="text"  placeholder="Nhập chứng minh thư" id="identifier" name="identifier"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-calendar"></i>
                                </span>
                                <input class="form-control" type="text"  placeholder="yyyy/MM/dd" id="birthDay" name="birthDay"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-adn"></i>
                                </span>
                                <select class="form-control" id="gender" name="gender">
                                    <option value="">Vui lòng chọn giới tính</option>
                                    <option value="1">Nam</option>
                                    <option value="0">Nữ</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-10 col-md-offset-1">
                            <div class="form-group input-group">
                                <span class="input-group-addon">
                                    <i class="fa fa-phone"></i>
                                </span>
                                <input class="form-control" type="text"  placeholder="Nhập số điện thoại" id="number" name="number"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-offset-5">
                            <button class="btn btn-success" type="button" id="btnRegister">Đăng ký</button>
                        </div>
                    </div>
                </form>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>    

    </body>
</html>
<script src="scripts/register.js" type="text/javascript"></script>
