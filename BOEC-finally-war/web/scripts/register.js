$('#btnDangKy').off('click').on('click', function () {
//    resetFormRegister();
//    $('#RegisterModal').modal({backdrop: 'static', show: true});
    $(location).attr('href', 'http://localhost:8080/BOEC-finally-war/Register.jsp');
});
$('#btnRegister').off('click').on('click', function () {
    var userName = $('#userName').val();
    var password = $('#password').val();
    var repassword = $('#repassword').val();
    var email = $('#email').val();
    var name = $('#name').val();
    var address = $('#address').val();
    var identifier = $('#identifier').val();
    var birthDay = $('#birthDay').val();
    var gender = $('#gender').val();
    var number = $('#number').val();
    if (userName == '' || userName == 'undefined' || userName == null) {
        alert("Bạn chưa nhập UserName");
        $('#userName').focus();
        return;
    }
    if (password == '' || password == 'undefined' || password == null) {
        alert("Bạn chưa nhập Password");
        $('#password').focus();
        return;
    }
    if (repassword == '' || repassword == 'undefined' || repassword == null) {
        alert("Bạn chưa nhập lại Password");
        $('#repassword').focus();
        return;
    }
    if (password != repassword) {
        alert("Mật khẩu không khớp vui lòng nhập lại");
        $('#repassword').focus();
        return;
    }
    if (name == '' || name == 'undefined' || name == null) {
        alert("Bạn chưa nhập Họ Tên");
        $('#name').focus();
        return;
    }
    if (birthDay == '' || birthDay == 'undefined' || birthDay == null) {
        alert("Bạn chưa nhập ngày sinh");
        $('#birthDay').focus();
        return;
    }
    if (gender == '' || gender == 'undefined' || gender == null) {
        alert("Vui lòng chọn giới tính");
        $('#gender').focus();
        return;
    }

    var customer = {userName: userName, password: password, repassword: repassword, email: email,
        name: name, address: address, identifier: identifier, birthDay: birthDay, gender: gender, number: number
    }
    $.ajax({
        type: 'POST',
        url: 'RegisterServlet',
        data: {userName: userName, password: password, repassword: repassword, email: email,
            name: name, address: address, identifier: identifier, birthDay: birthDay, gender: gender, number: number},
        dataType: 'html',
        success: function (result) {
            if (result == "ok") {
//                $('#RegisterModal').modal('hide');
                alert("Đăng ký thành công");
                resetFormRegister();
            } else {
                alert("Username đã có người đăng ký");
                $('#userName').focus();
            }
        },
        error: function (result) {
            alert("Không có dữ liệu trả về");
        }
    });
});
function resetFormRegister() {
    $('#userName').val('');
    $('#password').val('');
    $('#repassword').val('');
    $('#email').val('');
    $('#name').val('');
    $('#address').val('');
    $('#identifier').val('');
    $('#birthDay').val('');
    $('#gender').val('');
    $('#number').val('');
}
