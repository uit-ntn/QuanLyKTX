package com.example.QuanLyKTX.repository;

import com.example.QuanLyKTX.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Long> {

    // không cần ghi mã cụ thể JPA tự cung cấp sẵn các phương thức để CRUD DB

    // Tìm sinh viên theo tên
    List<SinhVien> findByMSSV(String MSSV);

    // Tìm sinh viên theo tên
    List<SinhVien> findByHoVaTen(String hoVaTen);

    // Tìm sinh viên theo địa chỉ
    List<SinhVien> findByDiaChi(String diaChi);

    // Tìm sinh viên theo số điện thoại
    SinhVien findBySoDienThoai(String soDienThoai);

    // Tìm sinh viên theo email
    SinhVien findByEmail(String email);

    // Tìm sinh viên theo ID user
    SinhVien findByIdUser(Long idUser);

    // Cập nhật thông tin của sinh viên
    SinhVien update(SinhVien sinhVien);

    // Xoá sinh viên theo ID
    void deleteById(Long id);

    // Thêm mới sinh viên
    SinhVien save(SinhVien sinhVien);

}
