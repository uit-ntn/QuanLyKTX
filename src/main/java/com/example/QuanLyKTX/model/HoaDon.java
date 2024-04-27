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
@Table(name = "Hoa_don")
public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Hoa_don")
    private Long idHoaDon;

    @ManyToOne
    @JoinColumn(name = "MSSV")
    private SinhVien sinhVien;

    @Column(name = "Ngay_lap")
    private Date ngayLap;

    @Column(name = "Tong_tien")
    private Double tongTien;

    @Column(name = "Trang_thai_thanh_toan")
    private String trangThaiThanhToan;

    // Constructors
    public HoaDon() {
    }

    public HoaDon(SinhVien sinhVien, Date ngayLap, Double tongTien, String trangThaiThanhToan) {
        this.sinhVien = sinhVien;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    // Getters and setters
    public Long getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Long idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(String trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }
}
