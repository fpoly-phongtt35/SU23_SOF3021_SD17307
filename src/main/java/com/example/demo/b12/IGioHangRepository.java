package com.example.demo.b12;

public interface IGioHangRepository {

    void themSanPhamVaoGio(Integer maSanPham, Integer soLuong);

    void capNhapSoLuongSanPhamTrongGio(Integer maSanPham, Integer soLuong);

    void xoaSanPhamTrongGio(Integer maSanPham);
}
