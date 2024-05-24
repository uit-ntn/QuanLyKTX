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
                            <option>ĐH Khoa học Xã hội và Nhân
                                văn, ĐHQG TP.HCM</option>
                        </select>
                    </div>
                    <div class="col-md-2">
                        <select class="form-select">
                            <option>Khu A</option>
                            <option>Khu B</option>
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
                <button class="btn-primary btn">Tìm kiếm</button>
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

        <script
            src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0/js/bootstrap.bundle.min.js"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    </body>
</html>
