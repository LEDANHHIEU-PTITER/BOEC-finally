<%-- 
    Document   : Electronic
    Created on : May 5, 2018, 4:13:53 PM
    Author     : HieuLe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Hiếu">

        <title>Electronic Page</title>

        <!-- Bootstrap Core CSS -->
        <link href="../AdminCssJs/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- MetisMenu CSS -->
        <link href="../AdminCssJs/vendor/metisMenu/metisMenu.min.css" rel="stylesheet" type="text/css"/>
        <!-- Custom CSS -->
        <link href="../AdminCssJs/dist/css/sb-admin-2.css" rel="stylesheet" type="text/css">

        <!-- Morris Charts CSS -->
        <link href="../AdminCssJs/vendor/morrisjs/morris.css" rel="stylesheet" type="text/css">

        <!-- Custom Fonts -->
        <link href="../AdminCssJs/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="wrapper">
            <jsp:include page="Header.jsp"></jsp:include>
                <div id="page-wrapper">
                    <div class="row">
                        <div class="col-lg-6">
                            <h1 class="page-header">Electronic</h1>
                        </div>
                        <div class="col-lg-offset-4 col-lg-2">
                            <a class="btn btn-success page-header" href="http://localhost:8080/BOEC-finally-war/Admin/AddElectronic.jsp">Add Electronic</a>
                        </div>
                        <!-- /.col-lg-6 -->
                    </div
                    <!--Div Tìm kiếm điện thoại-->
                    <div class="row searchDienThoai">
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
                    <!-- /.row  -->
                    <div class="row">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Price</th>
                                    <th>Quantity</th>
                                    <th>ImageSrc</th>
                                    <th>Company</th>
                                    <th>ScreenSize</th>
                                    <th>OperaSystem</th>
                                    <th>WarrantyPeriod</th>
                                    <th>Edit</th>
                                    <th>Delete</th>

                                </tr>
                            </thead>
                            <tbody>
                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- /#page-wrapper -->
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
