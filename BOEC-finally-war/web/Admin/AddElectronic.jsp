<%-- 
    Document   : AddElectronic
    Created on : May 5, 2018, 5:04:32 PM
    Author     : HieuLe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <jsp:include page="Header.jsp"></jsp:include>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-6">
                        <h1 class="page-header">Add Electronic</h1>
                    </div>
                </div
                <div class="row">
                    <form class="form-horizontal" action="AddElectronic" id="formAddElectronic" method="POST" name="AddElectronic">
                        <div class="row">
                            <div class="col-sm-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-adn"></i>
                                    </span>
                                    <select class="form-control" id="eType" name="eType"" >
                                        <option value=""> Select Type Electronic</option>
                                        <option value="SmartPhone">SmartPhone</option>
                                        <option value="LapTop">LapTop</option>
                                        <option value="Tablet">Tablet</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-user"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="Name Electronic" id="eName" name="eName"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-lock"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="Price Electronic " id="ePrice" name="ePrice"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-lock"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="Quantity Electronic" id="eQuantity" name="eQuantity"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-mail-forward"></i>
                                    </span>
                                    <input class="form-control" type="file" accept="image/*" onchange="readURL(this);"  id="eImage" name="eImage"/>
                                    <img class=" form-control img-rounded" id="image" src="#" alt="image Electronic" />
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-adn"></i>
                                    </span>
                                    <select class="form-control" id="eCompanyID" name="eCompanyID">
                                        <option value=""> Select Company Electronic</option>
                                        <option value="1">Apple</option>
                                        <option value="2">Samsung</option>
                                        <option value="3">Sony</option>
                                        <option value="4">Nokia</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-adn"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="SreenSize Electronic" id="eScreenSize" name="eScreenSize"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-credit-card"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="OperaSystem Electronic" id="eOperaSystem" name="eOperaSystem"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-10 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-calendar"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="WarrantyPeriod" id="eWarrantyPeriod" name="eWarrantyPeriod"/>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-4 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-calendar"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="Battery Electronic" id="eBattery" name="eBattery" disabled="true"/>
                                </div>
                            </div>
                            <div class="col-sm-4 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-calendar"></i>
                                    </span>
                                    <input class="form-control" type="text"  placeholder="CameraAfter Electronic" id="eCameraAfter" name="CameraAfter" disabled="true"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-4 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-adn"></i>
                                    </span>
                                    <select class="form-control" id="eIsDVD" name="eIsDVD" disabled="true">
                                        <option value=""> IsDVD Electronic</option>
                                        <option value="1">Yes</option>
                                        <option value="0">No</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-sm-4 col-md-offset-1">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">
                                        <i class="fa fa-adn"></i>
                                    </span>
                                    <select class="form-control" id="eIsKeyBoardLight" name="eIsKeyBoardLight" disabled="true">
                                        <option value=""> IsKeyBoardLight Electronic</option>
                                        <option value="1">Yes</option>
                                        <option value="0">No</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-offset-5">
                                <button class="btn btn-success" type="button" id="btnThem">Thêm</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <!-- /#page-wrapper -->
        <jsp:include page="Footer.jsp"></jsp:include>
        <script src="../AdminCssJs/js/addElectronic.js" type="text/javascript"></script>
    </body>
</html>
