<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Orders</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .header {
            background-color: #f8f9fa;
            padding: 10px 0;
            border-bottom: 1px solid #dee2e6;
        }
    </style>
</head>
<body>
    <div class="container">
    </div>
    <div class="container-fluid">

        <div class="row">
            <!-- Main content -->
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
                <header class="header d-flex align-items-center justify-content-between">
                    <div>
                        <h2>Đơn hàng của tôi</h2>
                    </div>
                    <div>
                        <input type="text" class="form-control" placeholder="Tìm kiếm đơn hàng">
                    </div>
                </header>
                <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3">
                    <!-- Content goes here -->
                </div>

                <div class="mb-4">
                    <ul class="nav nav-tabs">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Tất cả đơn</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Chờ thanh toán</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Đang xử lý</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Đang vận chuyển</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Đã giao</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Đã hủy</a>
                        </li>
                    </ul>
                </div>

                <div class="order-card">
                    <div class="d-flex justify-content-between">
                        <div class="d-flex">
                            <img src="https://via.placeholder.com/50" alt="Product Image">
                            <div class="ms-3">
                                <span>Điện Thoại Oppo A17k (3GB/64GB) - Vàng - Hàng Chính Hãng</span>
                                <div class="mt-2">
                                    <span class="badge bg-danger">Đã hủy</span>
                                </div>
                            </div>
                        </div>
                        <div>
                            <span>2.390.000 ₫</span>
                        </div>
                    </div>
                    <div class="d-flex justify-content-end mt-2">
                        <button class="btn btn-primary me-2">Mua lại</button>
                        <button class="btn btn-secondary">Xem chi tiết</button>
                    </div>
                </div>

                <div class="order-card">
                    <div class="d-flex justify-content-between">
                        <div class="d-flex">
                            <img src="https://via.placeholder.com/50" alt="Product Image">
                            <div class="ms-3">
                                <span>Quần jogger túi hộp vải kaki xịn co giãn - SIZE M (49-55kg)</span>
                                <div class="mt-2">
                                    <span class="badge bg-success">Giao thành công</span>
                                </div>
                            </div>
                        </div>
                        <div>
                            <span>99.500 ₫</span>
                        </div>
                    </div>
                    <div class="d-flex justify-content-end mt-2">
                        <button class="btn btn-primary me-2">Mua lại</button>
                        <button class="btn btn-secondary">Xem chi tiết</button>
                    </div>
                </div>
            </main>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
