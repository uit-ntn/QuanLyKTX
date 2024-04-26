package com.example.QuanLyKTX.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Dich_vu")
public class DichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Dich_vu")
    private Long idDichVu;

    @Column(name = "Ten_dich_vu")
    private String tenDichVu;

    @Column(name = "Gia_tien")
    private Double giaTien;

    @Column(name = "Thoi_han")
    private Integer thoiHan;

    // Constructors
    public DichVu() {
    }

    public DichVu(String tenDichVu, Double giaTien, Integer thoiHan) {
        this.tenDichVu = tenDichVu;
        this.giaTien = giaTien;
        this.thoiHan = thoiHan;
    }

    // Getters and setters
    public Long getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(Long idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public Integer getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(Integer thoiHan) {
        this.thoiHan = thoiHan;
    }
}
