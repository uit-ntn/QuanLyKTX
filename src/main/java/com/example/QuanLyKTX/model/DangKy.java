package com.example.QuanLyKTX.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dang_ky")
public class DangKy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_dang_ky")
    private Long idDangKy;

    @Column(name = "Ngay_dang_ky")
    private Date ngayDangKy;

    @ManyToOne
    @JoinColumn(name = "MSSV")
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "ID_phong_yeu_cau")
    private Phong phongYeuCau;

    @Column(name = "Ngay_nhan_phong")
    private Date ngayNhanPhong;

    @Column(name = "Ngay_tra_phong")
    private Date ngayTraPhong;

    @Column(name = "Trang_thai_dang_ky")
    private String trangThaiDangKy;

    // Constructors
    public DangKy() {
    }

    public DangKy(Date ngayDangKy, SinhVien sinhVien, Phong phongYeuCau, Date ngayNhanPhong, Date ngayTraPhong, String trangThaiDangKy) {
        this.ngayDangKy = ngayDangKy;
        this.sinhVien = sinhVien;
        this.phongYeuCau = phongYeuCau;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.trangThaiDangKy = trangThaiDangKy;
    }

    // Getters and setters
    public Long getIdDangKy() {
        return idDangKy;
    }

    public void setIdDangKy(Long idDangKy) {
        this.idDangKy = idDangKy;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Phong getPhongYeuCau() {
        return phongYeuCau;
    }

    public void setPhongYeuCau(Phong phongYeuCau) {
        this.phongYeuCau = phongYeuCau;
    }

    public Date getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public void setNgayNhanPhong(Date ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public Date getNgayTraPhong() {
        return ngayTraPhong;
    }

    public void setNgayTraPhong(Date ngayTraPhong) {
        this.ngayTraPhong = ngayTraPhong;
    }

    public String getTrangThaiDangKy() {
        return trangThaiDangKy;
    }

    public void setTrangThaiDangKy(String trangThaiDangKy) {
        this.trangThaiDangKy = trangThaiDangKy;
    }
}
