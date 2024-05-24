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