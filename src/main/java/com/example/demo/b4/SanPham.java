package com.example.demo.b4;

import java.math.BigDecimal;

public class SanPham {

    private Long id;
    private String ten;
    private BigDecimal giaHienHanh;
    private Integer soLuongTon;

    public SanPham() {
    }

    public SanPham(Long id, String ten, BigDecimal giaHienHanh, Integer soLuongTon) {
        this.id = id;
        this.ten = ten;
        this.giaHienHanh = giaHienHanh;
        this.soLuongTon = soLuongTon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public BigDecimal getGiaHienHanh() {
        return giaHienHanh;
    }

    public void setGiaHienHanh(BigDecimal giaHienHanh) {
        this.giaHienHanh = giaHienHanh;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
}
