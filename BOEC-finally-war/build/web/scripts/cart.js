function themvaogiohang() {
    var electronicId = $('#DetailElectronicID').val();
    var soLuong = $('#DetailElectronicCount').val();
    if (soLuong == '' || soLuong == 'undefined' || soLuong == null) {
        alert("Bạn chưa nhập số lượng sách");
        $('#DetailElectronicCount').focus();
        return;
    }
    if (isNaN(soLuong)) {
        alert("Không hợp lệ vui lòng nhập số nguyên");
        $('#DetailElectronicCount').focus();
        return;
    }
    $.ajax({
        type: 'GET',
        url: 'AddToCartServlet',
        data: {electronicId: electronicId, soLuong: soLuong},
        dataType: 'json',
        success: function (data) {
            if (data != '' && data != 'undefined' && data != null) {
                if (data.OK == 1) {
//                    $('#DetailBookModal').modal('hide');
                    alert("Thêm vào giỏ hàng thành công");
                } else {
                    alert("Thêm vào giỏ hàng thất bại");
                }
            } else {
                alert("Dữ liệu rỗng");
            }
        },
        error: function (data) {
            alert("Xử lý tại Server Lỗi");
        }
    });
}
$('#btnMuaNgay').off('click').on('click', function () {
    themvaogiohang();
    xemgiohang();
})
function xemgiohang() {
//    $('#div_giohang').load('Cart.jsp');
    $('#cartModal').modal({backdrop: 'static', show: true});
    loadgiohang();
}
function loadgiohang() {
    $('#myModalLabelCart').text("Giỏ hàng");
    $.ajax({
        type: "GET",
        url: "LoadCartServlet",
        data: {},
        dataType: 'json',
        success: function (data) {
            if (data.cartBook != '' && data.cartBook != 'undefined' && data.cartBook != null) {
                var html = '';
                var count = 0;
                html = html + '<div class="container-fluid">';
                html = html + '<table class="table table-responsive ">';
                html = html + '<thead>';
                html = html + '<tr>';
                html = html + '<th>STT</th>';
                html = html + '<th>Tên sách</th>';
                html = html + '<th>Giá bán</th>';
                html = html + '<th>Số lượng</th>';
                html = html + '<th>Thành tiền</th>';
//                html = html + '<th>#</th>';
                html = html + '</tr>';
                html = html + '</thead>';
                html = html + '<tbody>';
                $.each(data.cartBook, function () {      // Dữ liệu trong  bảng
                    count++;
                    html = html + '<tr>';
                    html = html + '<td>' + count + '</td>';
                    html = html + '<td>' + this.book.name + '</td>';
                    html = html + '<td>' + this.book.price + '</td>';
                    html = html + '<td>' + this.quantity + '</td>';
                    html = html + '<td style="color: red">' + this.book.price * this.quantity + ' đ</td>';
                    html = html + '<td>' + '</td>';
                    html = html + '<td>' + '</td>';
                    html = html + '</tr>';
                });
                html = html + '</tbody>';
                html = html + '</table>';
                html = html + '</div>';
                html = html + '<div class="row text-right">Tổng tiền:        <span style="color: red; margin:auto 21% auto 10%">' + data.amount + ' đ</span></div>'
                html = html + '<div class="modal-footer">';
                html = html + '<div>';
                html = html + '<button class="btn btn-info" onclick="donggiohang()">Tiếp tục mua hàng</button>';
                html = html + '<button class="btn btn-info" onclick="dathang()">Đặt hàng</button>';
                html = html + '</div>';
                html = html + '</div>';

            } else {
                var html = '';
                html = html + '<div class="panel">';
                html = html + '<div class="row">';
                html = html + '<p class="text-center">Giỏ hàng của bạn đang trống</p>';
                html = html + '<button class="btn btn-info center-block" onclick="donggiohang()">Tiếp tục mua hàng</button>';
                html = html + '</div>';
                html = html + '</div>';
            }
            $('#dataGioHang').html(html);
        },
        error: function (data) {
            alert("Lỗi server");
        }
    });
}
function donggiohang() {
    $('#cartModal').modal('hide');
}
function dathang() {
    $.ajax({
        type: 'POST',
        url: 'CheckLoginedServlet',
        data: {},
        dataType: 'json',
        success: function (result) {
            switch (result.ok) {
                case 1:
//                    alert("Đã đăng nhập");
                    xylydathang();
                    break;
                case 0:
                    alert("Bạn chưa đăng nhập, vui lòng đăng nhập để đặt hàng");
                    donggiohang();
                    DangNhap();
                    break;
                case - 1:
                    alert("Lỗi xử lý bên Server");
                    break;
            }
        },
        error: function (result) {
            alert("Không có dữ liệu trả về");
        }
    });
}
function xylydathang() {
    $.ajax({
        type: 'GET',
        url: 'GetInfoUserServlet',
        data: {},
        dataType: 'json',
        success: function (result) {
            if (result == null || result == 'undefined' || result == '') {
                alert("Hết phiên làm việc vui lòng đăng nhập lại");
                return;
            }
            $('#myModalLabelCart').text("Phương thức thanh toán và địa chỉ");
            var html = '';
            html = html + '<div class="container-fluid">';
            html = html + '<div class="row">';
            html = html + '<div class="form-group">';
            html = html + '<label for="address">Địa chỉ nhận hàng:</label>';
            html = html + '<textarea class="form-control" rows="5" id="myModalCartAddress" ></textarea>'; //value=\"' + result.address.city + '\"
            html = html + '</div>';
            html = html + '</div>';
            html = html + '<div class="row">';
            html = html + '<label class="radio-inline">';
            html = html + '<input type="radio" name="typepayradio" value="1">Thẻ ngân hàng';
            html = html + '</label>';
            html = html + '<label class="radio-inline">';
            html = html + '<input type="radio" name="typepayradio" value="2">Trực tiếp';
            html = html + '</label>';
//            html = html + '<label class="radio-inline">';
//            html = html + '<input type="radio" name="optradio">Option 3';
//            html = html + '</label>';
            html = html + '</div>';
            html = html + '<div class="modal-footer">';
            html = html + '<button class="btn btn-info" onclick="loadgiohang()">Trở lại</button>';
            html = html + '<button class="btn btn-info" onclick="xylythanhtoan()">Tiếp theo</button>';
            html = html + '</div>';
            html = html + '</div>';
            $('#dataGioHang').html(html);
            $('#myModalCartAddress').val(result.address.city);
        },
        error: function (result) {
            alert("Không có dữ liệu trả về");
        }
    });
}
function xylythanhtoan() {
    var diaChi = $('#myModalCartAddress').val();
    if (diaChi == '' || diaChi == 'undefined' || diaChi == null) {
        alert("Bạn chưa nhập địa chỉ");
        $('#myModalCartAddress').focus();
        return;
    }
    var kieuthanhtoan = $("input[type='radio'][name='typepayradio']:checked").val();
    if (kieuthanhtoan == '' || kieuthanhtoan == 'undefined' || kieuthanhtoan == null) {
        alert("Bạn chưa chọn kiểu thanh toán");
        return;
    }
    console.log(diaChi);
    console.log(kieuthanhtoan);
    $.ajax({
        type: 'GET',
        url: 'OrderServlet',
        data: {diachi: diaChi, kieuthanhtoan: kieuthanhtoan},
        dataType: 'html',
        success: function (result) {
            if (result == "OK") {
                alert("Đặt hàng thành công");
                donggiohang();
            } else {
                alert("Đặt hàng thất bại");
            }
        },
        error: function (result) {
            alert("Không có dữ liệu trả về");
        }
    });
}