package com.example.demo.b12;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

@Repository
@SessionScope
public class GioHangSessionRepository implements IGioHangRepository {

    private GioHangDomainModel gioHang = new GioHangDomainModel();

    public void themSanPhamVaoGio(Integer maSanPham, Integer soLuong) {
        gioHang.getDsSanPhamTrongGio().put(maSanPham, soLuong);
    }

    public void capNhapSoLuongSanPhamTrongGio(Integer maSanPham, Integer soLuong) {
        gioHang.getDsSanPhamTrongGio().put(maSanPham, soLuong);
    }

    public GioHangDomainModel layGioHang() {
        return gioHang;
    }

    @Override
    public void xoaSanPhamTrongGio(Integer maSanPham) {

    }

}
