<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="../../../resources/static/img/logo.png"
            type="image/x-icon">
        <link rel="stylesheet" type="text/css"
            href="../../../resources/static/css/booking.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Trang đăng ký phòng</title>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous">
        <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <style>
          .custom-container {
            border: 1px solid #ddd;
            border-radius: 5px;
            background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
        }
      </style>
    </head>
    <body>
        <div class="container custom-container mt-3">
            <form class="mb-2" action="<c:url value='/rooms/search' />"
                method="post">
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
                    <div class="col-md-3 mb-3">
                        <label for="buildingtype" class="form-label">Chọn Giới
                            Tính</label>
                        <select class="form-select" id="buildingtype"
                            name="building.buildingType">
                            <option value="male">Nam</option>
                            <option value="female">Nữ</option>
                            <option value="KTX">KTX</option>
                        </select>
                    </div>
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
                            name="building.buildingID">
                            <c:foreach var="building" items="${buildings}">
                                <option
                                    value="${building.buildingID}">${building.buildingName}</option>
                            </c:foreach>
                        </select>
                    </div>
                </div>
                <div class="col-12">
                    <div class="text-center">
                        <button class="btn btn-primary" type="submit">Tìm
                            phòng</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
