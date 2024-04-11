package com.example.QuanLyKTX.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Su_dung_dich_vu")
public class SuDungDichVu {

    @Id
    @ManyToOne
    @JoinColumn(name = "MSSV", referencedColumnName = "MSSV", foreignKey = @ForeignKey(name = "FK_Su_dung_dich_vu_Sinh_vien"))
    private SinhVien sinhVien;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_Dich_vu", referencedColumnName = "ID_Dich_vu", foreignKey = @ForeignKey(name = "FK_Su_dung_dich_vu_Dich_vu"))
    private DichVu dichVu;

    @Column(name = "So_luong")
    private Integer soLuong;

    @Column(name = "Tong_tien")
    private Double tongTien;

    // Constructors
    public SuDungDichVu() {
    }

    public SuDungDichVu(SinhVien sinhVien, DichVu dichVu, Integer soLuong, Double tongTien) {
        this.sinhVien = sinhVien;
        this.dichVu = dichVu;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }

    // Getters and setters
    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }
}
