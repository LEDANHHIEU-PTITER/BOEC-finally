# BOEC-finally
Project bài tập lớn kiến trúc và thiết kế phần mềm
Note: Config Server Glassfish 4.0 (Not run 4.1, 4.1.1, 4.1.2....)

Cần chạy file tạo Database vào MySql trước khi chạy Project


Setup:
1. Tạo Database với tên QuanLyBanHangOnline rồi Run file QuanLyBanHangOnline.sql trong Database vừa tạo
2. Run Server Glassfish 4.0 

2.1. Tạo Pool Connection Pools trên địa chỉ http://localhost:4848 (4848 là cổng mặc định của Server Glassfish nếu bạn chỉnh cổng khác thì điền số cổng tương ứng)
2.1.1 Resources ->  JDBC -> JDBC Connection Pools để Pool tới MySql( Có thể là Server khác như SQL Server, Oracle,...) 
	  Sau khi tạo Pool xong bạn cần chọn Ping xem Glassfish đã kết nối được với MySql chưa, nếu hiện Ping Susscess là ok
2.1.2 Tạo  JDBC Resources với tên "jdbc/boec-finaly" JDBC Connection Pools vừa tạo.

2.2 Vào file glassfish-resources.xml và persistence.xml xem lại tên jndi-name đã đúng là "jdbc/boec-finaly" 
	(2 file bên trên và JDBC Resources trên Glassfish phải trùng nhau)


