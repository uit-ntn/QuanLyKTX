<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chi tiết hóa đơn</title>
    <link rel="stylesheet" href="../../../resources/static/css/detail_billing.css">
</head>
<body>
    <header>
        <div>
            <img src="src\main\resources\static\img\logo.png">
            <p>
                <h1>TRANG TRA CỨU THÔNG TIN HOÁ ĐƠN</h1>
            </p>
        </div>
    </header>


    <nav class="navbar">
        <ul>
            <li><a href="/home">Trang chủ</a></li>
            <li><a href="/help">Trợ giúp</a></li>
        </ul>
    </nav>

    <br>

    <div><h2>Chi tiết hóa đơn</h2></div>
    <div>
        <table>
            <tr>
                <th>Số hóa đơn:</th>
                <td>...</td>
            </tr>
            <tr>
                <th>Loại hóa đơn:</th>
                <td>...</td>
            </tr>
            <tr>
                <th>Ngày xuất hóa đơn:</th>
                <td>...</td>
            </tr>
            <tr>
                <th>Tổng tiền:</th>
                <td>...</td>
            </tr>
            <tr>
                <th>Trạng thái hóa đơn:</th>
                <td>...</td>
            </tr>
        </table>
    </div>

    <br>

    <div id="waytopay">
        <label for="payment">Chọn phương thức thanh toán:</label>
            <select name="" id="payment">
                <option value="cash">Tiền mặt</option>
                <option value="momo">CK momo</option>
                <option value="bank">CK ngân hàng</option>
            </select>
    </div>
    
    <div>
        <button>Xác nhận thanh toán</button>
    </div>
    
    <section>
        <button onclick="window.print()">In Hóa Đơn</button>
        <button onclick="downloadInvoice()">Tải Xuống</button>       
    </section>

    <br>

    <div>
        <a href="test.html"><button>Quay lại</button></a>
    </div>

    <footer>
        <div>
            <h1 id="ftt">DORM DEV TEAM</h1>
        </div>

        <ul>
            <li><a href="" class="footertext">Điều khoản và điều kiện</a></li>
            <li><a href="" class="footertext">Chính sách bảo mật</a></li>
            <li><a href="" class="footertext">Liên hệ</a></li>
        </ul>
    </footer>

</body>
</html>