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
@Table(name = "Bao_tri")
public class BaoTri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Bao_tri")
    private Long idBaoTri;

    @ManyToOne
    @JoinColumn(name = "ID_Phong", referencedColumnName = "ID_Phong", foreignKey = @ForeignKey(name = "FK_Bao_tri_Phong"))
    private Phong phong;

    @Column(name = "Ngay_bao_bao_tri")
    private Date ngayBaoBaoTri;

    @Column(name = "Tinh_trang_bao_tri")
    private String tinhTrangBaoTri;

    @Column(name = "Mo_ta")
    private String moTa;

    // Constructors
    public BaoTri() {
    }

    public BaoTri(Phong phong, Date ngayBaoBaoTri, String tinhTrangBaoTri, String moTa) {
        this.phong = phong;
        this.ngayBaoBaoTri = ngayBaoBaoTri;
        this.tinhTrangBaoTri = tinhTrangBaoTri;
        this.moTa = moTa;
    }

    // Getters and setters
    public Long getIdBaoTri() {
        return idBaoTri;
    }

    public void setIdBaoTri(Long idBaoTri) {
        this.idBaoTri = idBaoTri;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public Date getNgayBaoBaoTri() {
        return ngayBaoBaoTri;
    }

    public void setNgayBaoBaoTri(Date ngayBaoBaoTri) {
        this.ngayBaoBaoTri = ngayBaoBaoTri;
    }

    public String getTinhTrangBaoTri() {
        return tinhTrangBaoTri;
    }

    public void setTinhTrangBaoTri(String tinhTrangBaoTri) {
        this.tinhTrangBaoTri = tinhTrangBaoTri;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
