/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$('#eType').on('change', function () {
    resetAttr();
    var eType = $('#eType').val();
    if (eType === 'SmartPhone' || eType === 'Tablet') {
        $('#eBattery').attr('disabled', false);
        $('#eCameraAfter').attr('disabled', false);
        $('#eIsDVD').attr('disabled', true);
        $('#eIsKeyBoardLight').attr('disabled', true);
    } else if (eType === 'Laptop') {
        $('#eBattery').attr('disabled', true);
        $('#eCameraAfter').attr('disabled', true);
        $('#eIsDVD').attr('disabled', false);
        $('#eIsKeyBoardLight').attr('disabled', false);
    }
});
function resetAttr() {
    $('#eBattery').val('');
    $('#eCameraAfter').val('');
    $('#eIsDVD').val('');
    $('#eIsKeyBoardLight').val('');
}
function readURL(input) {
//                debugger;
    console.log(input.files);
    console.log(input.files[0]);
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#image')
                    .attr('src', e.target.result)
                    .width(50)
                    .height(50);
        };
        reader.readAsDataURL(input.files[0]);
    }
}

$('#btnThem').off('click').on('click', function () {
    var eType = $('#eType').val();
    var eName = $('#eName').val();
    var ePrice = $('#ePrice').val();
    var eQuantity = $('#eQuantity').val();
//    var eImage = $('#eImage').val();
//    var image = $('#image').val();
    var eCompanyID = $('#eCompanyID').val();
    var eScreenSize = $('#eScreenSize').val();
    var eOperaSystem = $('#eOperaSystem').val();
    var eWarrantyPeriod = $('#eWarrantyPeriod').val();
    var eBattery = $('#eBattery').val();
    var eCameraAfter = $('#eCameraAfter').val();
    var eIsDVD = $('#eIsDVD').val();
    var eIsKeyBoardLight = $('#eIsKeyBoardLight').val();
    if (eType == '' || eType == 'undefined' || eType == null) {
        alert("Bạn chưa chọn kiểu Electronic");
        $('#eType').focus();
        return;
    }
    if (eName == '' || eName == 'undefined' || eName == null) {
        alert("Bạn chưa tên Electronic");
        $('#eName').focus();
        return;
    }
    if (ePrice == '' || ePrice == 'undefined' || ePrice == null) {
        alert("Bạn chưa nhập giá");
        $('#ePrice').focus();
        return;
    }

//    if (eImage == '' || eImage == 'undefined' || eImage == null) {
//        alert("Bạn chưa chọn hình ảnh");
//        $('#eImage').focus();
//        return;
//    }
    if (eQuantity == '' || eQuantity == 'undefined' || eQuantity == null) {
        alert("Bạn chưa nhập số lượng");
        $('#eQuantity').focus();
        return;
    }
    if (eCompanyID == '' || eCompanyID == 'undefined' || eCompanyID == null) {
        alert("Vui lòng chọn hãng sản xuất");
        $('#eCompanyID').focus();
        return;
    }
    if (eScreenSize == '' || eScreenSize == 'undefined' || eScreenSize == null) {
        alert("Vui lòng chọn kích thước màn hình");
        $('#eScreenSize').focus();
        return;
    }
    if (eOperaSystem == '' || eOperaSystem == 'undefined' || eOperaSystem == null) {
        alert("Vui lòng nhập hệ điều hành");
        $('#eOperaSystem').focus();
        return;
    }
    if (eWarrantyPeriod == '' || eWarrantyPeriod == 'undefined' || eWarrantyPeriod == null) {
        alert("Vui lòng nhập số năm bảo hành");
        $('#eWarrantyPeriod').focus();
        return;
    }

    if (eType === 'SmartPhone' || eType === 'Tablet') {     // Kiểm tra Type Electronic
        if (eBattery == '' || eBattery == 'undefined' || eBattery == null) {
            alert("Bạn chưa nhập dung lượng pin");
            $('#eBattery').focus();
            return;
        }
        if (eCameraAfter == '' || eCameraAfter == 'undefined' || eCameraAfter == null) {
            alert("Bạn chưa nhập số chấm camera sau");
            $('#eCameraAfter').focus();
            return;
        }
    } else if (eType === 'LapTop') {
        if (eIsDVD == '' || eIsDVD == 'undefined' || eIsDVD == null) {
            alert("Laptop có DVD không ?");
            $('#eIsDVD').focus();
            return;
        }
        if (eIsKeyBoardLight == '' || eIsKeyBoardLight == 'undefined' || eIsKeyBoardLight == null) {
            alert("Laptop có đèn bàn phím không");
            $('#eIsKeyBoardLight').focus();
            return;
        }
    }

    var electronic = {eType: eType, eName: eName, ePrice: ePrice, eQuantity: eQuantity,
        eCompanyID: eCompanyID, eScreenSize: eScreenSize, eOperaSystem: eOperaSystem, eWarrantyPeriod: eWarrantyPeriod
        , eBattery: eBattery, eCameraAfter: eCameraAfter, eIsDVD: eIsDVD, eIsKeyBoardLight: eIsKeyBoardLight
    }
    $.ajax({
        type: 'POST',
        url: '../AddElectronic',
        data: {eType: eType, eName: eName, ePrice: ePrice, eQuantity: eQuantity,
            eCompanyID: eCompanyID, eScreenSize: eScreenSize, eOperaSystem: eOperaSystem, eWarrantyPeriod: eWarrantyPeriod
            , eBattery: eBattery, eCameraAfter: eCameraAfter, eIsDVD: eIsDVD, eIsKeyBoardLight: eIsKeyBoardLight},
        dataType: 'html',
        success: function (result) {
            if (result == "ok") {
                alert("Thêm mới thành công");
                resetFormAddElectronic();
            } else {
                alert("Thêm mới thất bại");
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