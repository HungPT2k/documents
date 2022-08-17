Chương II: Thiết kế
2.1 Tổng quan hệ thống
2.1.1 Phạm vi phần mềm
	+ Hỗ trợ quản lý quy mô một rạp chiếu phim
	+ Các nhân viên quản lý có tài khoản được phép thao tác với dữ liệu trong phần mêm
	+ Các người dùng có tài khoản được phép sử dụng một số chức năng của phần mềm.
2.1.2 Những người được sử dụng phần mềm và làm các chức năng:
		- Nhân viên quản lý:
			+ Quản lý phim (thêm sửa xóa)
			+ Quản lý phòng(thêm sửa xóa)
			+ Lên lịch chiếu phim
			+ Thống kê
		-Người dùng:
			+ Sửa thông tin cá nhân
			+ Xem thông tin phim
			+ Đặt vé
			+ Phản hồi thông tin
2.1.3 Thông tin đối tượng cần sử lý
		+ Rạp : tên , địa chỉ
		+ Người dùng: tên , email,mật khẩu,ngày sinh ..
		+ Phim : tên , poster ảnh, trailer, thể loại, ngày phát hành ...
		+ Phòng : tên phòng
		+ Ghế ngồi: thứ tự ghế
		+ Vé đặt: Trạng thái ghế, thông tin người dùng,giá ..
		+ Lịch chiếu phim: Thời gian,địa điểm,thông tin phim
2.1.4 Quan hệ giữa các đối tượng:
		+ Một rạp chiếu phim có nhiều phòng chiếu
		+ Một phòng  thì có nhiều ghế ngồi
		+ Một phòng chiếu nhiều phim trong một ngày
		+ Trong 1 khung giờ trong ngày một phòng chỉ chiếu 1 phim
		+ Một người dùng có thể đặt nhiều vé
2.2 Sơ dồ Use Case 
2.2.1 Tổng quan hệ thống

 	
2.2.2 Xem thông tin phim
a, Mô tả
Người dùng (User) sau khi đăng nhập thành công chọn menu Phim trên thanh menu ngang -> Danh sách phim hiện ra theo từng trang. User chọn một trang bất kỳ -> Danh sách các phim trong trang đó hiện ra. User click vào một phim bất kì -> Thông tin chi tiết của phim đó hiện ra (tên, ngày sản xuất, thể loại ...)
b, Use Case

2.2.3. Lên lịch chiếu phim
a, Mô tả 
Nhân viên (Nv) sau khi đăng nhập thành công chọn menu CalendarMovie trên thanh menu dọc -> Trang lên lịch chiếu phim hiện ra. Nv chọn ngày bắt đầu, ngày kết thúc trên 2 thẻ input, Nv tiếp tục chọn tên phòng trong danh sách sổ xuống của thẻ input (drop list), Nv tiếp tục chọn khung giờ chiếu phim trong danh sách sổ xuống của thẻ input (drop list), Nv tiếp tục chọn phim muốn công chiếu trong table chứa danh sách phim. Cuối cùng Nv nhấn nút OK để xác nhận lịch chiếu phim.
b, Use Case
 
2.2.4. Đặt vé xem phim
a, Mô Tả
Người dùng (User) sau khi đăng nhập thành công chọn menu Đặt vé trên thanh menu ngang -> Giao diện đặt vé hiện ra. User nhấn chọn phòng -> Danh sách phim chiếu của phòng đó hiện ra, Danh sách ghế ngồi của phòng đó hiện ra. User nhấn chọn phim muốn xem cùng với số ghế muốn ngồi. User nhấn nút Đặt vé để xác nhận thông tin vé đặt.
b,. Use Case 
 
2.3. Thiết kế CSDL
2.3.1 Các bảng
•	ZOOM
STT	Thuộc tính 	Kiểu	Ràng buộc	Khóa	Mô tả
1	zoomId	int	NOT NULL	PK	Mã Phòng
2	zoomName	nvarchar	NOT NULL		Tên phòng
•	cinemas
STT	Thuộc tính 	Kiểu	Ràng buộc	Khóa	Mô tả
1	cinemaID	int	NOT NULL	PK	Mã Phòng
2	cinemaName	nvarchar	NOT NULL		Tên rạp
3	cinemaAddress	Nvarchar	NOT NULL		Địa chỉ rạp

•	Schedule
STT	Thuộc tính 	Kiểu	Ràng buộc	Khóa	Mô tả
1	scheduleId	int	NOT NULL	PK	Mã lịch chiếu phim
2	movieId	int	NOT NULL	FK	Mã phim
3	zoomId	int	NOT NULL	FK	Mã phòng
4	scheduleStart	
time	NOT NULL		Thời gian bắt đầu chiếu
5	scheduleEnd	time	NOT NULL		Thời gian kết thúc chiếu
6	dateShow	date	NOT NULL		Ngày công chiếu
•	BOOKING
STT	Thuộc tính 	Kiểu	Ràng buộc	Khóa	Mô tả
1	bookingId	varchar	NOT NULL	PK	Mã đặt vé
2	scheduleId	varchar	NOT NULL	FK	Mã lịch chiếu phim
3	userId	varchar	NOT NULL	FK	Mã khách hàng
4	seatId	varchar	NOT NULL	FK	Mã ghế
5	price	float			Giá
6	statuss	varchar			Trạng thái
•	
•	
•	Seat
STT	Thuộc tính 	Kiểu	Ràng buộc	Khóa	Mô tả
1	seatId	int	NOT NULL	PK	Mã ghế
2	zoomId	int	NOT NULL	FK	Mã Phòng
3	NumberSeat	int	NOT NULL		Số ghế


•	Users
STT	Thuộc tính 	Kiểu	Ràng buộc	Khóa	Mô tả
1	userId	int	NOT NULL	PK	Mã khách hàng
2	userName	varchar	NOT NULL		Tên khách hàng
3	passWordUser	varchar	NOT NULL		Mật khẩu
4	fullName	nvarchar	NOT NULL		Tên đầy đủ
5	email	varchar	NOT NULL		email
6	birthDay	date	NOT NULL		Ngày sinh
7	addressUser	nvarchar	NOT NULL		Địa chỉ

 
2.3.2 Quan hệ giữa các bảng
 





 
![image](https://user-images.githubusercontent.com/91839672/185172532-4999aa54-9682-4f2f-9c12-4a44b2c11ce3.png)
