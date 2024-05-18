<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="vi">

    <head>
        <meta charset="UTF-8">
        <title>Tra cứu thông tin hóa đơn</title>
        <link rel="stylesheet" type="text/css" href="../../../resources/static/css/payment.css" />
    </head>

    <body>
        <header>

            <div class="payment-header">
                <div class="payment-title-fix-img">
                    <img src="../../../resources/static/img/logo.png">
                </div>
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

        <br><br>

        <!-- Danh Sách Hóa Đơn -->
        <section>
            <div>
                <h2>Danh sách các hóa đơn</h2>
            </div>
            <form action="">
                <table>
                    <tr>
                        <th>STT</th>
                        <th>Ngày hóa đơn</th>
                        <th>Số tiền</th>
                        <th>Trạng thái hóa đơn</th>
                        <th>Hành động</th>
                    </tr>

                    {$for (invoice : invoices )
                
                    <tr id="{invoice.----}">
                        <td></td>
                        <td>{}</td>
                        <td>10000</td>
                        <td>Chưa thanh toán</td>
                        <td>
                        
                            <!-- Đổi href của nút "Thanh toán" thành URL mong muốn -->
                            <a href="/user/{user_id}/payment/{invoice_id}">Thanh toán</a>

                            <button>Xóa</button>
                        </td>
                    }
                    </tr>
                </table>
            </form>
            
            
        </section>

        <br><br>

        <!-- Footer -->
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