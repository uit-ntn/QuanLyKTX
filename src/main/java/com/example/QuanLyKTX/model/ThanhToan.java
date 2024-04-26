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
@Table(name = "Thanh_toan")
public class ThanhToan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Thanh_toan")
    private Long idThanhToan;

    @ManyToOne
    @JoinColumn(name = "ID_Hoa_don")
    private HoaDon hoaDon;

    @Column(name = "Ngay_thanh_toan")
    private Date ngayThanhToan;

    @Column(name = "So_tien")
    private Double soTien;

    @Column(name = "So_tien_chua_thanh_toan")
    private Double soTienChuaThanhToan;

    @Column(name = "Phuong_thuc_thanh_toan")
    private String phuongThucThanhToan;

    // Constructors
    public ThanhToan() {
    }

    public ThanhToan(HoaDon hoaDon, Date ngayThanhToan, Double soTien, Double soTienChuaThanhToan, String phuongThucThanhToan) {
        this.hoaDon = hoaDon;
        this.ngayThanhToan = ngayThanhToan;
        this.soTien = soTien;
        this.soTienChuaThanhToan = soTienChuaThanhToan;
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    // Getters and setters
    public Long getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(Long idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Double getSoTien() {
        return soTien;
    }

    public void setSoTien(Double soTien) {
        this.soTien = soTien;
    }

    public Double getSoTienChuaThanhToan() {
        return soTienChuaThanhToan;
    }

    public void setSoTienChuaThanhToan(Double soTienChuaThanhToan) {
        this.soTienChuaThanhToan = soTienChuaThanhToan;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }
}
