$('#btnTimKiemSach').off('click').on('click', function () {
    var category_id = $('#category_id').val();
    var txtTimKiemSach = $('#txtTimKiemSach').val();
//    if (txtTimKiemSach == '' || txtTimKiemSach == 'undefined' || txtTimKiemSach == null) {
//        alert("Bạn chưa nhập Tên sách");
//        $('#txtTimKiemSach').focus();
//        return;
//    }
    loadlistBook(category_id, txtTimKiemSach);
});
function loadlistBook(category_id, txtTimKiemSach) {
    $.ajax({
        type: 'GET',
        url: 'LoadListBook',
        data: {category_id: category_id, txtTimKiemSach: txtTimKiemSach},
        dataType: 'json',
        success: function (data) {
            if (data != '' && data != 'undefined' && data != null) {
                var html = '';
                var count = 0;
                $.each(data, function () {
                    count++;
                    html = html + '<div class="col-lg-3">';
                    html = html + '<div class="card" style="background-color:#ccffff">';
                    html = html + '<img class="card-img-top" src="images/pic3.jpg" alt="">';
                    html = html + '<div class="card-body">';
                    html = html + '<h4 class="card-title" style="color: blue">' + this.name + '</h4>';
                    html = html + '<p class="card-text" style="color: red">' + this.price + ' đ</p>';
                    html = html + '</div>';
                    html = html + '<div class="card-footer">';
//                    html = html + '<a href="http://localhost:8080/QuanLyBanSach/DetailBookServlet?bookId=' + this.id + '"' + ' class="btn btn-primary">Xem chi tiết</a>';
                    html = html + '<button onclick="xemchitietbook(' + this.id + ')"' + ' class="btn btn-primary">Xem chi tiết</button>';
                    html = html + '</div>';
                    html = html + '</div>';
                    html = html + '</div>';
                    html = html + '</div>';
//                    if (count % 4 == 0)
//                    {
//                        html = html + '<br>';
//                    }
                });
                $('#displayListBook').html(html);
            } else {
                alert("Dữ liệu rỗng");
            }
        },
        error: function (data) {
            alert("Xử lý tại Server Lỗi");
        }
    });
}
function xemchitietbook(bookId) {
    $.ajax({
        type: 'GET',
        url: 'DetailBookServlet',
        data: {bookId: bookId},
        dataType: 'json',
        success: function (data) {
            if (data != '' && data != 'undefined' && data != null) {
                $('#DetailBookModal').modal({backdrop: 'static', show: true});
                $('#DetailBookID').val(data.id);
                $('#DetailBookTitle').text('Tên sách: ' + data.name);
                $('#DetailBookPrice').text('Giá bán: ' + data.price+'đ');
                $('#DetailBookAuthor').text('Tác giả: ' + data.author.name.firstName);
                $('#DetailBookPublisher').text('Nhà xuất bản: ' + data.publisher.name);
                $('#DetailBookYear').text('Năm xuất bản: ' + data.year);
                $('#DetailBookDesription').text('Mô tả: ' + data.description);
                $('#DetailBookCount').val(1);
            } else {
                alert("Dữ liệu rỗng");
            }
        },
        error: function (data) {
            alert("Xử lý tại Server Lỗi");
        }
    });
}