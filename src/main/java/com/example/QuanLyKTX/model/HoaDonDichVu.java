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
@Table(name = "Hoadon_dv")
public class HoaDonDichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HDDV")
    private Long idHDDV;

    @ManyToOne
    @JoinColumn(name = "MSSV", referencedColumnName = "MSSV", foreignKey = @ForeignKey(name = "FK_Hoadon_dv_Sinh_vien"))
    private SinhVien sinhVien;

    @Column(name = "NGAY_LAP_HD")
    private Date ngayLapHD;

    @ManyToOne
    @JoinColumn(name = "ID_Dich_vu", referencedColumnName = "ID_Dich_vu", foreignKey = @ForeignKey(name = "FK_Hoadon_dv_Dich_vu"))
    private DichVu dichVu;

    @Column(name = "So_luong")
    private Integer soLuong;

    @Column(name = "Tong_tien")
    private Double tongTien;

    @Column(name = "So_tien_da_TT")
    private Double soTienDaTT;

    @Column(name = "So_tien_chua_thanh_toan")
    private Double soTienChuaThanhToan;

    @Column(name = "Trang_thai_TT")
    private String trangThaiTT;

    // Constructors
    public HoaDonDichVu() {
    }

    public HoaDonDichVu(SinhVien sinhVien, Date ngayLapHD, DichVu dichVu, Integer soLuong, Double tongTien, Double soTienDaTT, Double soTienChuaThanhToan, String trangThaiTT) {
        this.sinhVien = sinhVien;
        this.ngayLapHD = ngayLapHD;
        this.dichVu = dichVu;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.soTienDaTT = soTienDaTT;
        this.soTienChuaThanhToan = soTienChuaThanhToan;
        this.trangThaiTT = trangThaiTT;
    }

    // Getters and setters
    public Long getIdHDDV() {
        return idHDDV;
    }

    public void setIdHDDV(Long idHDDV) {
        this.idHDDV = idHDDV;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
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

    public Double getSoTienDaTT() {
        return soTienDaTT;
    }

    public void setSoTienDaTT(Double soTienDaTT) {
        this.soTienDaTT = soTienDaTT;
    }

    public Double getSoTienChuaThanhToan() {
        return soTienChuaThanhToan;
    }

    public void setSoTienChuaThanhToan(Double soTienChuaThanhToan) {
        this.soTienChuaThanhToan = soTienChuaThanhToan;
    }

    public String getTrangThaiTT() {
        return trangThaiTT;
    }

    public void setTrangThaiTT(String trangThaiTT) {
        this.trangThaiTT = trangThaiTT;
    }
}
