$(document).ready(function () {

    // hàm load toà mỗi khi có những trường option thay đổi 

    // Khi có giá trị của bất kỳ select nào thay đổi, hàm loadBuildings sẽ được gọi để load lại danh sách toà
    function loadBuildings() {
        var school = $('select[name="school"]').val();
        var gender = $('select[name="gender"]').val();
        var capacity = $('select[name="capacity"]').val();

        if (school && gender && capacity) {
            // AJAX call để lấy dữ liệu của tòa từ database dựa trên  "trường, giới tính và loại phòng" đã chọn
            $.ajax({
                url: '', // URL của file xử lý phía server
                type: 'GET',
                data: {
                    school: school,
                    gender: gender,
                    capacity: capacity
                },
                dataType: 'json',
                success: function (data) {
                    var buildingSelect = $('select[name="building"]');
                    buildingSelect.empty(); // Xóa các tùy chọn hiện có
                    buildingSelect.append('<option value="">Chọn tòa</option>'); // Thêm tùy chọn mặc định
                    data.buildings.forEach(function (building) {
                        buildingSelect.append('<option value="' + building.value + '">' + building.text + '</option>');
                    });
                }
            });
        }
    }

    $('select[name="school"], select[name="gender"], select[name="capacity"]').change(function () {
        loadBuildings();
    });


    buildingSelect.off('change').on('change', function () {
        var selectedBuilding = $(this).val();
        if (selectedBuilding) {
            var url = 'chonPhong.html?school=&gender=' + encodeURIComponent(gender) +
                '&capacity=' + encodeURIComponent(capacity) +
                '&building=' + encodeURIComponent(selectedBuilding);
            window.location.href = url;
        }
    });

});

