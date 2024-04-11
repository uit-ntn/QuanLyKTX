package com.example.QuanLyKTX.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Phong")
public class Phong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Phong")
    private Long idPhong;

    @Column(name = "So_phong")
    private String soPhong;

    @Column(name = "Loai_phong")
    private String loaiPhong;

    @Column(name = "Gia_thue")
    private Double giaThue;

    @Column(name = "Tinh_trang")
    private String tinhTrang;

    // Constructors
    public Phong() {
    }

    public Phong(String soPhong, String loaiPhong, Double giaThue, String tinhTrang) {
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.giaThue = giaThue;
        this.tinhTrang = tinhTrang;
    }

    // Getters and setters
    public Long getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(Long idPhong) {
        this.idPhong = idPhong;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public Double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(Double giaThue) {
        this.giaThue = giaThue;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
