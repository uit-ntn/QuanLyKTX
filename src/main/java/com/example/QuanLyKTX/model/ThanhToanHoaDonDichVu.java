package com.example.QuanLyKTX.model;

import java.util.Date;

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
@Table(name = "THANH_TOAN_HDDV")
public class ThanhToanHoaDonDichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TT_HDDV")
    private Long idTTHDDV;

    @ManyToOne
    @JoinColumn(name = "MSSV", referencedColumnName = "MSSV", foreignKey = @ForeignKey(name = "FK_Thanh_toan_hddv_Sinh_vien"))
    private SinhVien sinhVien;

    @ManyToOne
    @JoinColumn(name = "ID_HDDV", referencedColumnName = "ID_HDDV", foreignKey = @ForeignKey(name = "FK_Thanh_toan_hddv_Hoadon_dv"))
    private HoaDonDichVu hoaDonDichVu;

    @Column(name = "So_tien_TT")
    private Double soTienTT;

    @Column(name = "Ngay_TT")
    private Date ngayTT;

    // Constructors
    public ThanhToanHoaDonDichVu() {
    }

    public ThanhToanHoaDonDichVu(SinhVien sinhVien, HoaDonDichVu hoaDonDichVu, Double soTienTT, Date ngayTT) {
        this.sinhVien = sinhVien;
        this.hoaDonDichVu = hoaDonDichVu;
        this.soTienTT = soTienTT;
        this.ngayTT = ngayTT;
    }

    // Getters and setters
    public Long getIdTTHDDV() {
        return idTTHDDV;
    }

    public void setIdTTHDDV(Long idTTHDDV) {
        this.idTTHDDV = idTTHDDV;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public HoaDonDichVu getHoaDonDichVu() {
        return hoaDonDichVu;
    }

    public void setHoaDonDichVu(HoaDonDichVu hoaDonDichVu) {
        this.hoaDonDichVu = hoaDonDichVu;
    }

    public Double getSoTienTT() {
        return soTienTT;
    }

    public void setSoTienTT(Double soTienTT) {
        this.soTienTT = soTienTT;
    }

    public Date getNgayTT() {
        return ngayTT;
    }

    public void setNgayTT(Date ngayTT) {
        this.ngayTT = ngayTT;
    }
}
