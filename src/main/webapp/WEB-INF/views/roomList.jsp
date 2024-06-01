<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="com.example.QuanLyKTX.model.Room" %>
<%@page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

            <form class="mb-4" action="/booking/rooms" method="get">
                <div class="row">
                    <div class="col-md-3 mb-3">
                        <label for="school" class="form-label">Chọn
                            Trường</label>
                        <select class="form-select" id="school">
                            <option>Chọn trường</option>
                            <option>Trường Đại học Công nghệ Thông tin</option>
                            <option>Trường Đại học Bách Khoa</option>
                            <option>Trường Đại học Quốc tế</option>
                            <option>Trường Đại học Nhân văn</option>
                            <option>Trường Đại học Kinh tế - Luật</option>
                        </select>
                    </div>
                    <!-- Chọn giới tính -->
                    <div class="col-md-3 mb-3">
                        <label for="gender" class="form-label">Chọn Giới
                            Tính</label>
                        <select class="form-select" id="buildingtype"
                            name="buildingtype">
                            <option value="male">Nam</option>
                            <option value="female">Nữ</option>
                            <option value="KTX">KTX</option>
                        </select>
                    </div>
                    <!-- Chọn loại phòng -->
                    <div class="col-md-3 mb-3">
                        <label for="capacity" class="form-label">Chọn Loại
                            Phòng</label>
                        <select class="form-select" id="capacity"
                            name="capacity">
                            <option value="4">Phòng 4 sinh viên</option>
                            <option value="6">Phòng 6 sinh viên</option>
                            <option value="8">Phòng 8 sinh viên</option>
                        </select>
                    </div>

                    <div class="col-md-3 mb-3">
                        <label for="building" class="form-label">Chọn
                            Tòa</label>
                        <select class="form-select" id="building"
                            name="building">
                            <c:forEach var="building" items="${buildings}">
                                <option
                                    value="${building.buildingID}">${building.buildingName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="col-12">
                    <div class="text-center">
                        <button class="btn btn-primary">Tìm phòng</button>
                    </div>
                </div>
            </form>

            
            <div class="container">
                <h1>Danh sách các phòng</h1>
                <p>Building Type: ${buildingtype}</p>
                <p>Capacity: ${capacity}</p>
                <p>Building: ${building}</p>

                <c:choose>
                    <c:when test="${empty rooms}">
                        <p>Không có phòng phù hợp.</p>
                    </c:when>
                    <c:otherwise>
                        <div class="row">
                            <c:forEach var="room" items="${rooms}">
                                <div class="col-md-4 mb-3">
                                    <div class="card">
                                        <div class="card-header">
                                            P ${room.roomNumber}
                                            <span class="badge bg-primary">${room.capacity} sinh viên</span>
                                        </div>
                                        <div class="card-body">
                                            <div class="room-status">
                                                <c:forEach var="i" begin="1" end="${room.capacity}">
                                                    <span class="seat 
                                                        <c:choose>
                                                            <c:when test="${i <= room.occupied}">
                                                                seat-occupied
                                                            </c:when>
                                                            <c:otherwise>
                                                                seat-available
                                                            </c:otherwise>
                                                        </c:choose>
                                                    ">&#x1F464;</span>
                                                </c:forEach>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </c:otherwise>
                </c:choose>
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
