<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>

    <link rel="icon" href="../../../resources/static/img/logo.png"
      type="image/x-icon">
    <link
      rel="stylesheet"
      type="text/css"
      href="../../../resources/static/css/home.css?version=5.1" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Trang đăng ký phòng</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous">

    <script
      src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container px-5">
        <img class="navbar-brand" href="/"
          src="../../../resources/static/img/logo.png">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false"
          aria-label="Toggle navigation"><span
            class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
            <li class="nav-item"><a class="nav-link active" aria-current="page"
                href="/">Home</a></li>
            <li class="nav-item"><a class="nav-link"
                href="/about">About</a></li>
            <li class="nav-item"><a class="nav-link"
                href="/contact">Contact</a></li>
            <li class="nav-item"><a class="nav-link"
                href="/Services">Services</a></li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="container mt-5">
      <form>
        <div class="row">
          <!-- Chọn trường -->
          <div class="col-md-3 mb-3">
            <label for="school" class="form-label">Chọn Trường</label>
            <select class="form-select" id="school" name="school">
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
            <label for="gender" class="form-label">Chọn Giới Tính</label>
            <select class="form-select" id="gender" name="gender">
              <option value="male">Nam</option>
              <option value="female">Nữ</option>
            </select>
          </div>

          <!-- Chọn loại phòng -->
          <div class="col-md-3 mb-3">
            <label for="capacity" class="form-label">Chọn Loại Phòng</label>
            <select class="form-select" id="capacity" name="capacity">
              <option value="4">4</option>
              <option value="6">6</option>
              <option value="8">8</option>
            </select>
          </div>

          <!-- Dùng AJAX để load tòa từ database sau khi đã chọn giới tính -->
          <div class="col-md-3 mb-3">
            <label for="building" class="form-label">Chọn Tòa</label>
            <select class="form-select" id="building" name="building">
              <!-- Options sẽ được load bằng AJAX -->
            </select>
          </div>
        </div>
      </form>
    </div>

    <!--end select section-->

    <div class="container mt-5">
      <div class="row">
        <!-- Cột 1 -->
        <div class="col-md-6">
          <div class=" bg-light p-3">
            <h2>Cột 1</h2>
            <p>Đây là nội dung của cột 1.</p>
          </div>
        </div>
        <!-- Cột 2 -->
        <div class="col-md-6">
          <div class="bg-light p-3">
            <h2>Cột 2</h2>
            <p>Đây là nội dung của cột 2.</p>
          </div>
        </div>
      </div>
    </div>
    <!-- 
    <table border="1" id="bookingTable">
      <thead>
        <tr>
          <th>Booking ID</th>
          <th>Student ID</th>
          <th>Room ID</th>
          <th>Check-In Date</th>
          <th>Check-Out Date</th>
        </tr>
      </thead>
      <tbody id="booking_data"></tbody>
    </table> -->
  </body>
  <!-- <script>
    console.log("hello");
    $(document).ready(function () {
      $.ajax({
        type: "GET",
        url: "/api/bookings",
        dataType: "json",
        success: function (data) {
          console.log(data);
          var tbody = $("#booking_data");
          $.each(data, function (index, booking) {
            var row = "<tr>";
            row += "<td>" + booking.bookingID + "</td>";
            row += "<td>" + booking.student.studentID + "</td>";
            row += "<td>" + booking.room.roomID + "</td>";
            row +=
              "<td>" +
              new Date(booking.checkInDate).toLocaleDateString() +
              "</td>";
            row +=
              "<td>" +
              new Date(booking.checkOutDate).toLocaleDateString() +
              "</td>";
            row += "</tr>";
            tbody.append(row);
          });
        },
        error: function (xhr, status, error) {
          console.error(xhr.responseText);
        },
      });
    });
  </script> -->
  <script src="../../../resources/static/js/booking.js"></script>
</html>
