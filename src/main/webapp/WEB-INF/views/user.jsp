<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Student Information Page</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
            <link rel="stylesheet"
                href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.7.2/font/bootstrap-icons.min.css">

            <style>
                body {
                    font-family: Arial, sans-serif;
                }

                .sidebar {
                    width: 250px;
                    position: fixed;
                    top: 0;
                    bottom: 0;
                    left: 0;
                    background-color: #f8f9fa;
                    padding: 20px;
                    border-right: 1px solid #dee2e6;
                    overflow-y: auto;
                }

                .sidebar .nav-link {
                    color: #000;
                    font-weight: 500;
                }

                .sidebar .nav-link:hover {
                    background-color: #e9ecef;
                    border-radius: 5px;
                }

                .student-photo {
                    width: 150px;
                    height: 200px;
                }

                .info-card {
                    border: 1px solid #ddd;
                    border-radius: 5px;
                    padding: 15px;
                    margin: 20px 0;
                    background-color: #f8f9fa;
                }

                .info-card h5 {
                    margin-bottom: 20px;
                }

                .card-title {
                    font-size: 18px;
                    font-weight: bold;
                }

                .header {
                    padding: 10px 20px;
                    border-bottom: 1px solid #dee2e6;
                    background-color: #fff;
                    position: fixed;
                    top: 0;
                    left: 250px;
                    right: 0;
                    z-index: 1030;
                }

                .header .welcome {
                    float: right;
                }

                .sidebar {
                    width: 250px;
                    height: 100vh;
                    position: fixed;
                    top: 0;
                    left: 0;
                    background-color: #f8f9fa;
                    padding-top: 20px;
                }

                .sidebar a {
                    padding: 10px 15px;
                    text-decoration: none;
                    display: block;
                    color: #000;
                }

                .sidebar a:hover {
                    background-color: #007bff;
                    color: #fff;
                }

                .content {
                    margin-left: 250px;
                    padding: 20px;
                }

                .table thead th {
                    background-color: #f8f9fa;
                }

                body {
                    font-family: Arial, sans-serif;
                }

                .sidebar {
                    width: 250px;
                    position: fixed;
                    top: 0;
                    bottom: 0;
                    left: 0;
                    background-color: #f8f9fa;
                    padding: 20px;
                    border-right: 1px solid #dee2e6;
                    overflow-y: auto;
                }

                .sidebar .nav-link {
                    color: #000;
                    font-weight: 500;
                    display: flex;
                    align-items: center;
                }

                .sidebar .nav-link:hover,
                .sidebar .nav-link.active {
                    background-color: #007bff;
                    color: #fff;
                    border-radius: 5px;
                }

                .sidebar .nav-link i {
                    margin-right: 10px;
                }

                .content {
                    margin-left: 250px;
                    padding: 20px;
                }

                .table thead th {
                    background-color: #f8f9fa;
                }
            </style>
        </head>

        <body>
            <div class="container-fluid">
                <div class="sidebar">
                    <div class="d-flex flex-column align-items-center">
                        <img src="../../../resources/static/img/avt.jpg" alt="Student Photo"
                            class="student-photo img-thumbnail mb-3" style="width: 150px; height: 200px;">
                            <nav class="nav flex-column w-100">
                                <a class="nav-link" href="#" onclick="showSection('general-info')"><i class="bi bi-person"></i> Thông tin cá nhân</a>
                                <a class="nav-link" href="#" onclick="showSection('invoice-details')"><i class="bi bi-file-earmark-bar-graph"></i> Hoá đơn</a>
                                <a class="nav-link" href="#" onclick="showSection('repair-info')"><i class="bi bi-tools"></i> Yêu cầu sửa chữa</a>
                                <a class="nav-link" href="#" onclick="showSection('bhyt-info')"><i class="bi bi-shield-check"></i> Bảo hiểm y tế</a>
                                <a class="nav-link" href="#" onclick="showSection('survey-info')"><i class="bi bi-file-bar-graph"></i> Khảo sát</a>
                                <a class="nav-link" href="/logout"><i class="bi bi-box-arrow-right"></i> Logout</a>
                            </nav>
                    </div>
                </div>

                <div class="header">
                    <div class="d-flex justify-content-between align-items-center">
                        <div>
                            <img src="../../../resources/static/img/logo.png" alt="Logo" style="height: 50px;">
                            <span style="font-size: 20px; font-weight: bold;">TRANG
                                THÔNG TIN SINH VIÊN Ở KÝ TÚC XÁ ĐẠI HỌC QUỐC
                                GIA</span>
                        </div>
                        <div class="welcome">
                            Welcome, Nguyễn Thanh Nhân
                        </div>
                    </div>
                </div>

                <div class="content mt-5">
                    <div class="info-card" id="general-info">
                        <h2>Thông tin chung</h2>
                        <hr>

                        <div class="row">
                            <div class="col-md-3">
                                <h6>Mặt trước CCCD</h6>
                                <img src="../../../resources/static/img/cccd.jpg" alt="ID Front"
                                    class="img-thumbnail mb-3">
                                <h6>Mặt sau CCCD</h6>
                                <img src="../../../resources/static/img/cccd.jpg" alt="ID Back" class="img-thumbnail">
                            </div>
                            <div class="col-md-9">
                                <p><span class="card-title"></span></p>
                                <table class="table table-striped">
                                    <tbody>
                                        <tr>
                                            <th scope="row">Ngày sinh</th>
                                            <td>13/01/2003</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Giới tính</th>
                                            <td>Nam</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">SV năm</th>
                                            <td>3</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Sinh viên trường</th>
                                            <td>ĐH Công nghệ Thông tin, ĐHQG
                                                TP.HCM</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Khoa</th>
                                            <td>Hệ thống thông tin</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Mã số sinh viên</th>
                                            <td>21521219</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">CCCD</th>
                                            <td>xxxxxxxxxxx</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Nơi cấp CMND/CC</th>
                                            <td>Đồng Tháp</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Dân tộc</th>
                                            <td>Kinh</td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Tôn giáo</th>
                                            <td>Không</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="text-end">
                            <img src="../../../resources/static/img/qrcode-default.png" alt="QR Code"
                                class="img-thumbnail" style="width: 100px; height: 100px;">
                        </div>
                    </div>

                    <div class="info-card d-none" id="invoice-details">
                        <h3 class="mb-4">Hóa đơn, biên lai</h3>
                        <ul class="nav nav-tabs mb-3">
                            <li class="nav-item">
                                <a class="nav-link active">Hóa đơn lệ
                                    phí</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link">Biên lai điện nước</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link">DS hóa đơn đang nợ</a>
                            </li>
                        </ul>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Tháng/Năm</th>
                                    <th>Ngày chốt chỉ số</th>
                                    <th>Chỉ số điện</th>
                                    <th>Chỉ số nước</th>
                                    <th>Tổng cộng</th>
                                    <th>Số dư ví</th>
                                    <th>Thông tin thanh toán</th>
                                    <th>Ghi chú</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>4/2024</td>
                                    <td>29/04/2024</td>
                                    <td>
                                        <p>Chỉ số đầu: 11369 Kwh</p>
                                        <p>Chỉ số cuối: 11567 Kwh</p>
                                        <p>Sử dụng: 198 Kwh</p>
                                        <p>Số tiền: 409.769 đ</p>
                                    </td>
                                    <td>
                                        <p>Chỉ số đầu: 1529 m³</p>
                                        <p>Chỉ số cuối: 1539 m³</p>
                                        <p>Sử dụng: 10 m³</p>
                                        <p>Số tiền: 54.850 đ</p>
                                    </td>
                                    <td>464.619 đ (6 sinh viên)</td>
                                    <td>0 đ</td>
                                    <td>Đã thanh toán</td>
                                    <td></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <!-- Thêm các phần nội dung khác ở đây -->
                    <div class="info-card d-none" id="repair-info">
                        <h3>Yêu cầu sửa chữa</h3>
                        <p>Nội dung yêu cầu sửa chữa...</p>
                    </div>
                    <div class="info-card d-none" id="bhyt-info">
                        <h3>Khai báo BHYT</h3>
                        <p>Nội dung khai báo BHYT...</p>
                    </div>
                    <div class="info-card d-none" id="survey-info">
                        <h3>Khảo sát</h3>
                        <p>Nội dung khảo sát...</p>
                    </div>
                    <div class="info-card d-none" id="form-info">
                        <h3>Biểu mẫu</h3>
                        <p>Nội dung biểu mẫu...</p>
                    </div>
                    <div class="info-card d-none" id="notify-info">
                        <h3>Thông báo</h3>
                        <p>Nội dung thông báo...</p>
                    </div>
                </div>
            </div>
            </script>

            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
            <script src="../../../resources/static/js/user.js"></script>

        </body>

        </html>