/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$('#btnLogin').off('click').on('click', function () {
    var UserName = $('#UserName').val();
    var Password = $('#Password').val();

    if (UserName == '' || UserName == 'undefined' || UserName == null) {
        alert("Bạn chưa chọn kiểu Electronic");
        $('#UserName').focus();
        return;
    }
    if (Password == '' || Password == 'undefined' || Password == null) {
        alert("Bạn chưa tên Electronic");
        $('#Password').focus();
        return;
    }

    var electronic = {UserName: UserName, Password: Password}
    $.ajax({
        type: 'POST',
        url: '../AddElectronic',
        data: {UserName: UserName, Password: Password},
        dataType: 'html',
        success: function (result) {
            if (result == "ok") {
                alert("Đăng nhập thành công");
                resetFormAddElectronic();
            } else if (result == "fails") {
                alert("User không có quyền Admin");
//                $('#userName').focus();
            }
        },
        error: function (result) {
            alert("Lỗi Server");
        }
    });
});

function resetFormAddElectronic() {
    $('#eType').val('');
    $('#eName').val('');
    $('#ePrice').val('');
    $('#eQuantity').val('');
    $('#eCompanyID').val('');
    $('#eScreenSize').val('');
    $('#eOperaSystem').val('');
    $('#eWarrantyPeriod').val('');
    $('#gender').val('');
    $('#number').val('');
    resetAttr();
}