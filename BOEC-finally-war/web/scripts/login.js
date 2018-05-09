//function kiemtradangnhap() {
//    $.ajax({
//        type: 'GET',
//        url: 'GetInfoUserServlet',
//        data: {},
//        dataType: 'json',
//        success: function (result) {
//            var html = '';
//            if (result.Logined == 0) {
//                html = html + '<li><a href="" id="btnDangnhap" onclick="DangNhap()">Đăng nhập</a></li>';
//            } else {
//                html = html + '<li>';
//                html = html + '<span class="alert alert-info"> Wellcome ' + result.FullName.firstName + '</span>';
//                html = html + '</li>|';
//                html = html + '<li><a href="" id="btnThoat">Thoát</a></li>';
//            }
//            $('#menu').append(html);
//        },
//        error: function (result) {
//            alert("Không có dữ liệu trả về");
//        }
//    });
//}

$('#btnDangnhap').off('click').on('click', DangNhap);
function DangNhap() {
//    $('#loginModal').modal({backdrop: 'static', show: true});
    $(location).attr('href', 'http://localhost:8080/BOEC-finally-war/Login.jsp');
}
$('#btnLogin').off('click').on('click', login);
function login() {
    var un = $('#userName').val();
    var pw = $('#password').val();
    if (un == '' || un == 'undefined' || un == null) {
        alert("Bạn chưa nhập UserName");
        $('#userName').focus();
        return;
    }
    if (pw == '' || pw == 'undefined' || pw == null) {
        alert("Bạn chưa nhập Password");
        $('#password').focus();
        return;
    }
    $.ajax({
        type: 'POST',
        url: 'LoginServlet',
        data: {un: un, pw: pw},
        dataType: 'html',
        success: function (result) {
            if (result == "ok") {
//                $('#loginModal').modal('hide');
                $(location).attr('href', 'http://localhost:8080/BOEC-finally-war/Home.jsp');
                alert("Đăng nhập thành công");
            } else {
                alert("Tên hoặc mật khẩu không đúng");
                $('#userName').focus();
            }
        },
        error: function (result) {
            alert("Không có dữ liệu trả về");
        }
    });
}
