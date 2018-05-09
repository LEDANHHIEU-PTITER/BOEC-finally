<%-- 
    Document   : Login
    Created on : Apr 30, 2018, 6:10:47 PM
    Author     : HieuLe
--%>

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
        <title>Login Page</title>
    </head>

    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="row" style="margin-top: 250px"></div>
            <div class="row" style="margin-bottom: 250px">
                <div class="col-md-4 col-md-offset-4">
                    <form role="form" action="" method="" name="Login">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="Username" name="un" type="text" id ="userName" autofocus="">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name="pw" type="password" id="password">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                </label>
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <button class="btn btn-block btn-success " type="button" id ="btnLogin">Login</button>
                        </fieldset>
                    </form>
                </div>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
