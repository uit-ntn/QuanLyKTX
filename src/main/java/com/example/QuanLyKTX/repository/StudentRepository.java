package com.example.QuanLyKTX.repository;

import com.example.QuanLyKTX.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

// do spring data jpa đã cung cấp các hàm cho thêm sửa xóa database tương ứng

//  // Tìm kiếm sinh viên theo ID
//  Student findById(Long id);
    
//  // Tìm kiếm sinh viên theo giới tính
//  List<Student> findByGender(String gender);
 
//  // Tìm kiếm sinh viên theo trường học
//  List<Student> findBySchool(String school);
 
//  // Tìm kiếm sinh viên theo tên đầy đủ
//  List<Student> findByFullname(String fullname);
 
//  // Tìm kiếm sinh viên theo ngày sinh
//  List<Student> findByDateOfBirth(Date dateOfBirth);
 
//  // Tìm kiếm sinh viên theo địa chỉ - Sử dụng @Query
//  @Query("SELECT s FROM Student s WHERE s.address = :address")
//  List<Student> findByAddress(@Param("address") String address);
 
//  // Tạo sinh viên mới
//  Student save(Student student);
 
//  // Xóa sinh viên
//  void delete(Student student);
 
//  // Xóa sinh viên theo ID
//  void deleteById(Long id);
 
//  // Kiểm tra sự tồn tại của sinh viên theo ID
//  boolean existsById(Long id);
 
//  // Đếm số lượng sinh viên trong cơ sở dữ liệu
//  long count();
 
//  // Tìm kiếm tất cả sinh viên và sắp xếp theo tên đầy đủ theo thứ tự tăng dần
//  List<Student> findAllByOrderByFullnameAsc();
