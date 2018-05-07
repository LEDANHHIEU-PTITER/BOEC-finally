$('#btnThoat').off('click').on('click', function () {
    var sessionValue = '<%=Session["currentSessionUser"]%>';
    alert(sessionValue);
    $.ajax({
        type: "GET",
        url: "LogoutServlet",
        data: {},
        dataType: 'json',
        success: function (data) {
            if (data.OK == 1) {
                alert("Thoát thành công");
                debugger;
                $(location).attr('href', 'http://localhost:8080/BOEC-finally-war/Home.jsp');
            } else {
                alert("Thoát thất bại");
            }
        },
        error: function (data) {
            console.log(data);
            alert("Không có dữ liệu trả về");
        }
    });
});