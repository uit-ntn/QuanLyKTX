<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Register Room</title>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet">
        <style>
        /* Custom CSS here */
    </style>
    </head>
    <body>
        <!-- Header -->
        <header class="bg-dark py-3">
            <div class="container">
                <div class="text-center text-light">
                    <h1>Header</h1>
                </div>
            </div>
        </header>

        <!-- Content -->
        <div class="container my-5">
            <div class="row justify-content-center">
                <div class="col-md-8">
                    <div class="card mx-auto">
                        <div class="card-header bg-primary text-white">
                            <h2 class="card-title mb-0">Register Room
                                ${room.roomId}</h2>
                        </div>
                        <div class="card-body bg-light">
                            <form action="/booking/register" method="post">
                                <div class="row mb-3">
                                    <div class="col">
                                        <label for="fullName"
                                            class="form-label">Full
                                            Name:</label>
                                        <input type="text" id="fullName"
                                            name="fullName" class="form-control"
                                            required>
                                    </div>
                                    <div class="col">
                                        <label for="gender"
                                            class="form-label">Gender:</label>
                                        <input type="text" id="gender"
                                            name="gender" class="form-control"
                                            required>
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col">
                                        <label for="dateOfBirth"
                                            class="form-label">Date of
                                            Birth:</label>
                                        <input type="date" id="dateOfBirth"
                                            name="dateOfBirth"
                                            class="form-control" required>
                                    </div>
                                    <div class="col">
                                        <label for="address"
                                            class="form-label">Address:</label>
                                        <input type="text" id="address"
                                            name="address" class="form-control"
                                            required>
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col">
                                        <label for="phoneNumber"
                                            class="form-label">Phone
                                            Number:</label>
                                        <input type="text" id="phoneNumber"
                                            name="phoneNumber"
                                            class="form-control" required>
                                    </div>
                                    <div class="col">
                                        <label for="school"
                                            class="form-label">School:</label>
                                        <input type="text" id="school"
                                            name="school" class="form-control"
                                            required>
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col">
                                        <label for="mssv"
                                            class="form-label">Student
                                            ID:</label>
                                        <input type="text" id="mssv" name="mssv"
                                            class="form-control" required>
                                    </div>
                                    <div class="col">
                                        <label for="email"
                                            class="form-label">Email:</label>
                                        <input type="email" id="email"
                                            name="email" class="form-control"
                                            required>
                                    </div>
                                </div>
                                <div class="row mb-3">
                                    <div class="col">
                                        <label for="checkInDate"
                                            class="form-label">Check-In
                                            Date:</label>
                                        <input type="date" id="checkInDate"
                                            name="checkInDate"
                                            class="form-control" required>
                                    </div>
                                    <div class="col">
                                        <label for="checkOutDate"
                                            class="form-label">Check-Out
                                            Date:</label>
                                        <input type="date" id="checkOutDate"
                                            name="checkOutDate"
                                            class="form-control" required>
                                    </div>
                                </div>
                                <div class="mb-3 text-center mt-4">
                                    <button type="submit"
                                        class="btn btn-primary">Đăng ký</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container custom-container mt-4">
            <h4 class="mb-3">THÔNG TIN ĐĂNG KÝ KHU B - C02 - P. 303 - TRƯỜNG
                ĐH KHOA HỌC XÃ HỘI VÀ NHÂN VĂN, ĐHQG TP.HCM</h4>
            <div class="note">
                <p>LƯU Ý:</p>
                <ul>
                    <li>Sinh viên đăng nhập số căn cước công dân hoặc mã
                        định danh để đăng ký.</li>
                    <li>Sinh viên cập nhật chính xác thông tin của mình. Các
                        dòng có dấu (*) là bắt buộc nhập. Trường hợp thiếu
                        và sai sót thì đăng ký sẽ bị huỷ.</li>
                    <li>Đối với những sinh viên đã có danh sách sinh viên
                        nhập học sẽ sử dụng mã số CMND/CCCD để kiểm tra
                        thông tin.</li>
                    <li>Thông tin "Email" phải nhập đúng email đang sử dụng
                        để hệ thống gửi mã xác thực.</li>
                </ul>
            </div>

            <form>
                <div class="row">
                    <div class="col-md-6">
                        <h5>I. THÔNG TIN SINH VIÊN</h5>
                        <div class="form-group">
                            <label for="cccd">CCCD(*)</label>
                            <input type="text" class="form-control"
                                id="cccd" placeholder="Nhập CCCD">
                        </div>
                        <div class="form-group">
                            <label for="ngaycap">Ngày cấp CMND/CC(*)</label>
                            <input type="date" class="form-control"
                                id="ngaycap">
                        </div>
                        <div class="form-group">
                            <label for="noicap">Nơi cấp CMND/CC(*)</label>
                            <input type="text" class="form-control"
                                id="noicap" placeholder="Nhập nơi cấp">
                        </div>
                        <div class="form-group">
                            <label for="hotenlot">Họ & Tên lót(*)</label>
                            <input type="text" class="form-control"
                                id="hotenlot"
                                placeholder="Nhập họ và tên lót">
                        </div>
                        <div class="form-group">
                            <label for="ten">Tên(*)</label>
                            <input type="text" class="form-control" id="ten"
                                placeholder="Nhập tên">
                        </div>
                        <div class="form-group">
                            <label for="gioitinh">Giới tính(*)</label>
                            <select class="form-select" id="gioitinh">
                                <option selected>Chọn giới tính</option>
                                <option value="nam">Nam</option>
                                <option value="nu">Nữ</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="ngaysinh">Ngày sinh(*)</label>
                            <input type="date" class="form-control"
                                id="ngaysinh">
                        </div>
                        <div class="form-group">
                            <label for="dantoc">Dân tộc(*)</label>
                            <select class="form-select" id="dantoc">
                                <option selected>Chọn dân tộc</option>
                                <option value="kinh">Kinh</option>
                                <option value="tay">Tày</option>
                                <option value="thai">Thái</option>
                                <!-- Thêm các tùy chọn khác nếu cần -->
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="tongiao">Tôn giáo</label>
                            <input type="text" class="form-control"
                                id="tongiao" placeholder="Nhập tôn giáo">
                        </div>
                        <div class="form-group form-check">
                            <input type="checkbox" class="form-check-input"
                                id="dienchinh">
                            <label class="form-check-label"
                                for="dienchinh">Diện chính sách</label>
                        </div>
                        <!-- Thêm các checkbox khác nếu cần -->
                    </div>

                    <div class="col-md-6">
                        <h5>V. ĐĂNG KÝ THAM GIA CÁC HOẠT ĐỘNG TÌNH NGUYỆN VÌ
                            CỘNG ĐỒNG</h5>
                        <div class="form-group">
                            <label>Tham gia hoạt động ngày Chủ nhật
                                Xanh</label>
                            <div class="form-check">
                                <input class="form-check-input"
                                    type="checkbox" value="1buoi"
                                    id="1buoi">
                                <label class="form-check-label"
                                    for="1buoi">1 buổi</label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input"
                                    type="checkbox" value="2buoi"
                                    id="2buoi">
                                <label class="form-check-label"
                                    for="2buoi">2 buổi</label>
                            </div>
                            <!-- Thêm các checkbox khác nếu cần -->
                        </div>
                        <div class="form-group">
                            <label>Tham gia hiến máu tình nguyện</label>
                            <div class="form-check">
                                <input class="form-check-input"
                                    type="checkbox" value="1lan" id="1lan">
                                <label class="form-check-label" for="1lan">1
                                    lần</label>
                            </div>
                            <div class="form-check">
                                <input class="form-check-input"
                                    type="checkbox" value="2lan" id="2lan">
                                <label class="form-check-label" for="2lan">2
                                    lần</label>
                            </div>
                            <!-- Thêm các checkbox khác nếu cần -->
                        </div>

                        <h5>VI. THÔNG TIN BẢO HIỂM</h5>
                        <div class="form-group">
                            <label for="bhyt">Mã thẻ Bảo hiểm y
                                tế(*)</label>
                            <input type="text" class="form-control"
                                id="bhyt" placeholder="Nhập mã thẻ">
                        </div>
                        <div class="form-group">
                            <label for="giatriden">Giá trị đến(*)</label>
                            <input type="date" class="form-control"
                                id="giatriden">
                        </div>
                        <div class="form-group">
                            <label for="noidangky">Nơi đăng ký(*)</label>
                            <input type="text" class="form-control"
                                id="noidangky"
                                placeholder="Nhập nơi đăng ký">
                        </div>
                        <div class="form-group">
                            <label for="tinhthanh">Tỉnh/Thành phố(*)</label>
                            <select class="form-select" id="tinhthanh">
                                <option selected>Chọn Tỉnh/Thành
                                    phố</option>
                                <option value="hcm">Hồ Chí Minh</option>
                                <option value="hn">Hà Nội</option>
                                <!-- Thêm các tùy chọn khác nếu cần -->
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="kcb">Khám bệnh ban đầu(*)</label>
                            <input type="text" class="form-control" id="kcb"
                                placeholder="Nhập nơi khám bệnh">
                        </div>
                        <div class="form-group">
                            <label for="anhbhyt">Ảnh Bảo hiểm y tế mặt
                                trước(*)</label>
                            <input type="file" class="form-control"
                                id="anhbhyt">
                        </div>
                    </div>
                </div>

                <div class="text-center mt-4">
                    <button type="submit" class="btn btn-primary">Đăng
                        Ký</button>
                </div>
            </form>
        </div>

        <!-- Footer -->
        <footer class="bg-dark py-3">
            <div class="container">
                <div class="text-center text-light">
                    <p>Footer</p>
                </div>
            </div>
        </footer>

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
