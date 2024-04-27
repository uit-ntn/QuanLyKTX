package com.example.QuanLyKTX.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sinh_vien")
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MSSV")
    private Long mssv;

    @Column(name = "Ho_va_ten")
    private String hoVaTen;

    @Column(name = "Ngay_sinh")
    private Date ngaySinh;

    @Column(name = "Gioi_tinh")
    private String gioiTinh;

    @Column(name = "Dia_chi")
    private String diaChi;

    @Column(name = "So_dien_thoai")
    private String soDienThoai;

    @Column(name = "Email")
    private String email;

    @Column(name = "ID_user")
    private Long idUser;

    // Constructors
    public SinhVien() {
    }

    public SinhVien(Long mssv, String hoVaTen, Date ngaySinh, String gioiTinh, String diaChi, String soDienThoai, String email, Long idUser) {
        this.mssv = mssv;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.idUser = idUser;
    }

    // Getters and setters
    public Long getMssv() {
        return mssv;
    }

    public void setMssv(Long mssv) {
        this.mssv = mssv;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
