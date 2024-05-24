<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="com.example.QuanLyKTX.model.Room" %>
<%@page session="false" %>

<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
            content="width=device-width, initial-scale=1.0">
        <title>Trang Thông Tin Sinh Viên</title>
        <link
            href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css"
            rel="stylesheet">
        <style>
            .custom-container {
            border: 1px solid #ddd;
            border-radius: 5px;
            background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
            padding: 20px;
            margin-top: 20px;
        }
        .custom-title {
            font-size: 1.5rem;
            font-weight: bold;
            color: #333;
        }
             .note {
            background-color: #fff3cd;
            padding: 15px;
            border: 1px solid #ffeeba;
            border-radius: 5px;
            margin-bottom: 20px;
        }
        .note p {
            margin: 0;
        }
        .form-group {
            margin-bottom: 1rem;
        }
            .room-status {
                display: flex;
                justify-content: center;
                align-items: center;
                flex-wrap: wrap;
            }
            .room-status .seat {
                margin: 5px;
            }
            .seat-occupied {
                color: red;
            }
            .seat-reserved {
                color: orange;
            }
            .seat-available {
                color: gray;
            }

            .card-header {
            font-weight: bold;
            background-color: #f8f9fa;
        }
        .list-group-item {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .badge-status {
            font-size: 0.9em;
        }
        </style>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous">
    </head>
    <body>
        <div class="container custom-container mt-5">
            <div class="text-center mb-4"
                style="display:flex ; justify-content: center; align-items: center;">
                <img src="../../../resources/static/img/logo.png" alt="Logo"
                    style="width: 100px;">
                <h2>TRANG THÔNG TIN SINH VIÊN Ở KÝ TÚC XÁ ĐẠI HỌC QUỐC
                    GIA</h2>
            </div>

            <form class="mb-4">
                <div class="row">
                    <div class="col-md-3">
                        <select class="form-select">
                            <option selected>ĐH Khoa học Xã hội và Nhân
                                văn, ĐHQG TP.HCM</option>
                            <!-- Add other options here -->
                        </select>
                    </div>
                    <div class="col-md-2">
                        <select class="form-select">
                            <option selected>Khu B</option>
                            <!-- Add other options here -->
                        </select>
                    </div>
                    <div class="col-md-2">
                        <select class="form-select">
                            <option selected>Nam</option>
                            <!-- Add other options here -->
                        </select>
                    </div>
                    <div class="col-md-3">
                        <select class="form-select">
                            <option selected>Phòng 8 sinh viên</option>
                            <!-- Add other options here -->
                        </select>
                    </div>
                    <div class="col-md-2">
                        <select class="form-select">
                            <option selected>C02</option>
                            <!-- Add other options here -->
                        </select>
                    </div>
                </div>
            </form>

            <div class="row">
                <div class="col-md-4 mb-3">
                    <div class="card">
                        <div class="card-header">
                            P 301 <span class="badge bg-primary">8 sinh
                                viên</span>
                        </div>
                        <div class="card-body">
                            <div class="room-status">
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-available">&#x1F464;</span>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 mb-3">
                    <div class="card">
                        <div class="card-header">
                            P 303 <span class="badge bg-primary">8 sinh
                                viên</span>
                        </div>
                        <div class="card-body">
                            <div class="room-status">
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-available">&#x1F464;</span>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 mb-3">
                    <div class="card">
                        <div class="card-header">
                            P 308 <span class="badge bg-primary">8 sinh
                                viên</span>
                        </div>
                        <div class="card-body">
                            <div class="room-status">
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-occupied">&#x1F464;</span>
                                <span
                                    class="seat seat-available">&#x1F464;</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container custom-container mt-5">
            <div class="text-center mb-4"
                style="display: flex; justify-content: center; align-items: center;">
                <img src="../../../resources/static/img/logo.png" alt="Logo"
                    style="width: 100px;">
                <h2>TRANG THÔNG TIN SINH VIÊN Ở KÝ TÚC XÁ ĐẠI HỌC QUỐC GIA</h2>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            THÔNG TIN PHÒNG
                        </div>
                        <div class="card-body">
                            <table class="table">
                                <tr>
                                    <th scope="row">Khu</th>
                                    <td>Khu B</td>
                                </tr>
                                <tr>
                                    <th scope="row">Nhà</th>
                                    <td>C02</td>
                                </tr>
                                <tr>
                                    <th scope="row">Phòng</th>
                                    <td>303</td>
                                </tr>
                                <tr>
                                    <th scope="row">Loại phòng</th>
                                    <td>Phòng 8 sinh viên</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            DANH SÁCH CHỖ TRỐNG
                        </div>
                        <div class="card-body">
                            <ul class="list-group">
                                <li class="list-group-item">
                                    <span>Chỗ 1</span>
                                    <span
                                        class="badge bg-danger badge-status">Đã
                                        được đăng ký</span>
                                </li>
                                <li class="list-group-item">
                                    <span>Chỗ 2</span>
                                    <span
                                        class="badge bg-danger badge-status">Đã
                                        được đăng ký</span>
                                </li>
                                <li class="list-group-item">
                                    <span>Chỗ 3</span>
                                    <span
                                        class="badge bg-success badge-status">Trống</span>
                                </li>
                                <li class="list-group-item">
                                    <span>Chỗ 4</span>
                                    <span
                                        class="badge bg-danger badge-status">Đã
                                        được đăng ký</span>
                                </li>
                                <li class="list-group-item">
                                    <span>Chỗ 5</span>
                                    <span
                                        class="badge bg-danger badge-status">Đã
                                        được đăng ký</span>
                                </li>
                                <li class="list-group-item">
                                    <span>Chỗ 6</span>
                                    <span
                                        class="badge bg-danger badge-status">Đã
                                        được đăng ký</span>
                                </li>
                                <li class="list-group-item">
                                    <span>Chỗ 7</span>
                                    <span
                                        class="badge bg-danger badge-status">Đã
                                        được đăng ký</span>
                                </li>
                                <li class="list-group-item">
                                    <span>Chỗ 8</span>
                                    <span
                                        class="badge bg-danger badge-status">Đã
                                        được đăng ký</span>
                                </li>
                            </ul>
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
        </div>
        <script
            src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0/js/bootstrap.bundle.min.js"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    </body>
</html>
