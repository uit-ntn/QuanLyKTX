<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Student Information Page</title>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet">
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
                    <img src="../../../resources/static/img/avt.jpg"
                        alt="Student Photo"
                        class="student-photo img-thumbnail mb-3"
                        style="width: 150px; height: 200px;">
                    <nav class="nav flex-column w-100">
                        <a class="nav-link" href="#"
                            onclick="showSection('general-info')"><i
                                class="bi bi-person"></i> Thông tin cá nhân</a>
                        <a class="nav-link" href="#"
                            onclick="showSection('invoice-details')"><i
                                class="bi bi-file-earmark-bar-graph"></i> Hoá
                            đơn</a>
                        <a class="nav-link" href="#"
                            onclick="showSection('repair-info')"><i
                                class="bi bi-tools"></i> Yêu cầu sửa chữa</a>
                        <a class="nav-link" href="#"
                            onclick="showSection('bhyt-info')"><i
                                class="bi bi-shield-check"></i> Bảo hiểm y
                            tế</a>
                        <a class="nav-link" href="#"
                            onclick="showSection('survey-info')"><i
                                class="bi bi-file-bar-graph"></i> Khảo sát</a>
                        <a class="nav-link" href="/logout"><i
                                class="bi bi-box-arrow-right"></i> Logout</a>
                    </nav>
                </div>
            </div>

            <div class="header">
                <div class="d-flex justify-content-between align-items-center">
                    <div>
                        <img src="../../../resources/static/img/logo.png"
                            alt="Logo" style="height: 50px;">
                        <span style="font-size: 20px; font-weight: bold;">TRANG
                            THÔNG TIN SINH VIÊN Ở KÝ TÚC XÁ ĐẠI HỌC QUỐC
                            GIA</span>
                    </div>
                    <div class="dropdown">
                        <a href="#" style="text-decoration: none;">
                            <button class="btn btn-primary">
                                <i class="bi bi-cart-fill">Giỏ hàng</i>
                            </button>
                        </a>
                        <a
                            class="btn btn-secondary dropdown-toggle bi bi-person"
                            href="#"
                            role="button" id="dropdownMenuLink"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            ${student.fullName}
                        </a>

                        <ul class="dropdown-menu"
                            aria-labelledby="dropdownMenuLink">
                            <li><a class="dropdown-item" href="/"><i
                                        class="bi bi-house-door"></i> Trang
                                    chủ</a></li>
                            <li><a class="dropdown-item" href="/contact"><i
                                        class="bi bi-envelope"></i> Liên
                                    hệ</a></li>
                            <li><a class="dropdown-item" href="/services"><i
                                        class="bi bi-gear"></i> Dịch vụ</a></li>
                            <li><a class="dropdown-item" href="/user/profile"><i
                                        class="bi bi-person"></i> Thông tin cá
                                    nhân</a></li>
                            <li><a class="dropdown-item"
                                    href="/shop/${student.studentID}/cart"><i
                                        class="bi bi-cart"></i> Giỏ
                                    hàng</a></li>
                            <li><a class="dropdown-item" href="/logout"><i
                                        class="bi bi-box-arrow-right"></i>
                                    Logout</a></li>
                        </ul>
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
                            <img src="../../../resources/static/img/cccd.jpg"
                                alt="ID Front" class="img-thumbnail mb-3">
                            <h6>Mặt sau CCCD</h6>
                            <img src="../../../resources/static/img/cccd.jpg"
                                alt="ID Back" class="img-thumbnail">
                        </div>
                        <div class="col-md-9">
                            <p><span class="card-title"></span></p>
                            <table class="table table-striped">
                                <tbody>
                                    <tr>
                                        <th scope="row">Họ và tên</th>
                                        <th>${student.fullName}</th>
                                    </tr>

                                    <tr>
                                        <th scope="row">Ngày sinh</th>
                                        <td>${student.dateOfBirth}</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Giới tính</th>
                                        <td>${student.gender}</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Quê quán</th>
                                        <td>${student.address}</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">SV năm</th>
                                        <td>3</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Sinh viên trường</th>
                                        <td>${student.school}, ĐHQG TP.HCM</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Khoa</th>
                                        <td>Hệ thống thông tin</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">Mã số sinh viên</th>
                                        <td>${student.mssv}</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">CCCD</th>
                                        <td>${user.username}</td>
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
                        <img
                            src="../../../resources/static/img/qrcode-default.png"
                            alt="QR Code" class="img-thumbnail"
                            style="width: 100px; height: 100px;">
                    </div>
                </div>

                <div class="info-card" id="invoice-details">
                    <h3 class="mb-4">Hóa đơn, biên lai</h3>
                    <ul class="nav nav-tabs mb-3">
                        <li class="nav-item">
                            <a class="nav-link active">Hóa đơn phòng</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link">Hoá đơn dịch vụ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link">Hoá đơn mua sắm</a>
                        </li>
                    </ul>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Tháng/Năm</th>
                                <th>Chỉ số điện</th>
                                <th>Chỉ số nước</th>
                                <th>Tiền rác</th>
                                <th>Tổng cộng</th>
                                <th>Trạng thái</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="invoice" items="${invoices}">
                                <tr>
                                    <td>${invoice.issueDate}</td>
                                    <td>
                                        <p>Sử dụng: ${invoice.electricityUsage}
                                            Kwh</p>
                                        <p>Số tiền: ${invoice.electricityCost}
                                            đ</p>
                                    </td>
                                    <td>
                                        <p>Sử dụng: ${invoice.waterUsage} m³</p>
                                        <p>Số tiền: ${invoice.waterCost} đ</p>
                                    </td>
                                    <td>${invoice.junkCost}</td>
                                    <td>${invoice.totalAmount} đ</td>
                                    <td>${invoice.paymentStatus}</td>
                                    <td>
                                        <button
                                            class="btn btn-danger mb-3">Thanh
                                            toán</button>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>

                <!-- Modal -->
                <div class="modal fade" id="invoiceModal" tabindex="-1"
                    aria-labelledby="invoiceModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title"
                                    id="invoiceModalLabel">Chi tiết hóa đơn</h5>
                                <button type="button" class="btn-close"
                                    data-bs-dismiss="modal"
                                    aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <p><strong>Tháng/Năm:</strong> <span
                                        id="modal-month-year"></span></p>
                                <p><strong>Ngày chốt chỉ số:</strong> <span
                                        id="modal-closing-date"></span></p>
                                <p><strong>Chỉ số điện:</strong> <span
                                        id="modal-electricity-usage"></span></p>
                                <p><strong>Số tiền điện:</strong> <span
                                        id="modal-electricity-amount"></span></p>
                                <p><strong>Chỉ số nước:</strong> <span
                                        id="modal-water-usage"></span></p>
                                <p><strong>Số tiền nước:</strong> <span
                                        id="modal-water-amount"></span></p>
                                <p><strong>Tổng cộng:</strong> <span
                                        id="modal-total-amount"></span></p>
                                <p><strong>Thông tin thanh toán:</strong> <span
                                        id="modal-payment-info"></span></p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary"
                                    data-bs-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="info-card" id="repair-info">
                    <h3>Yêu cầu sửa chữa</h3>
                    <ul class="nav nav-tabs mb-3">
                        <li class="nav-item">
                            <a class="nav-link active" id="room-repair-tab"
                                data-bs-toggle="tab" href="#room-repair">Gửi yêu
                                cầu sửa chữa phòng</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="item-repair-tab"
                                data-bs-toggle="tab" href="#item-repair">Thông
                                tin sửa chữa vật tư</a>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane fade show active" id="room-repair">
                            <div class="mb-3">
                                <label for="repair-content"
                                    class="form-label">Nội dung sửa chữa</label>
                                <input type="text" class="form-control"
                                    id="repair-content"
                                    placeholder="Nội dung sửa chữa">
                                <button
                                    class="btn btn-primary mt-2">Gửi</button>
                            </div>
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>Ngày gửi yêu cầu</th>
                                        <th>Khu/Nhà/Phòng KTX</th>
                                        <th>Nội dung sửa chữa</th>
                                        <th>Ghi chú</th>
                                        <th>Tình trạng</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td colspan="5">There are no items to
                                            display</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="tab-pane fade" id="item-repair">
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>Ngày yêu cầu</th>
                                        <th>Nội dung yêu cầu sửa chữa</th>
                                        <th>Ghi chú</th>
                                        <th>Ngày sửa chữa hoàn thành</th>
                                        <th>Trạng thái</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>04/04/2017 8:13</td>
                                        <td>điện các ổ cắm không có điện</td>
                                        <td></td>
                                        <td>04/04/2017 8:13</td>
                                        <td>Đang sửa chữa</td>
                                    </tr>
                                    <!-- Add more rows as needed -->
                                </tbody>
                            </table>
                        </div>
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
        </div>

        <script
            src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
        <script src="../../../resources/static/js/user.js"></script>

        <script>
        function showSection(sectionId) {
            const sections = document.querySelectorAll('.info-card');
            sections.forEach(section => {
                section.classList.add('d-none');
            });
            document.getElementById(sectionId).classList.remove('d-none');
        }
    </script>
    </body>

</html>
