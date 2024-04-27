package com.example.QuanLyKTX.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Chi_Tiet_Hoa_don")
public class ChiTietHoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Chi_tiet")
    private Long idChiTiet;

    @ManyToOne
    @JoinColumn(name = "ID_Hoa_don", referencedColumnName = "ID_Hoa_don", foreignKey = @ForeignKey(name = "FK_Chi_Tiet_Hoa_don_Hoa_don"))
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "MSSV", referencedColumnName = "MSSV", foreignKey = @ForeignKey(name = "FK_Chi_Tiet_Hoa_don_Sinh_vien"))
    private SinhVien sinhVien;

    @Column(name = "Dien_su_dung")
    private Double dienSuDung;

    @Column(name = "Nuoc_su_dung")
    private Double nuocSuDung;

    // Constructors
    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(HoaDon hoaDon, SinhVien sinhVien, Double dienSuDung, Double nuocSuDung) {
        this.hoaDon = hoaDon;
        this.sinhVien = sinhVien;
        this.dienSuDung = dienSuDung;
        this.nuocSuDung = nuocSuDung;
    }

    // Getters and setters
    public Long getIdChiTiet() {
        return idChiTiet;
    }

    public void setIdChiTiet(Long idChiTiet) {
        this.idChiTiet = idChiTiet;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Double getDienSuDung() {
        return dienSuDung;
    }

    public void setDienSuDung(Double dienSuDung) {
        this.dienSuDung = dienSuDung;
    }

    public Double getNuocSuDung() {
        return nuocSuDung;
    }

    public void setNuocSuDung(Double nuocSuDung) {
        this.nuocSuDung = nuocSuDung;
    }
}
