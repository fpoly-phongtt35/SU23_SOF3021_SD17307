package com.example.demo.b4;

import java.util.Map;

public class GioHangService {

    private final GioHang gioHang = new GioHang();

    public Map<Long, Integer> laySanPhamTrongGio() {
        return gioHang.getSanPhamTrongGio();
    }

    public void themSanPhamVaoGio(Long maSanPham, Integer soLuongChoVao) {
        Map<Long, Integer> sanPhamTrongGio = gioHang.getSanPhamTrongGio();

        // Kiểm tra trong giỏ có sản phẩm muốn thêm chưa
        if (sanPhamTrongGio.containsKey(maSanPham)) { // Nếu có rồi thì cộng dồn
            // Lấy số lượng sản phẩm hiện có
            Integer soLuongHienCo = sanPhamTrongGio.get(maSanPham);

            // Cộng dồn
            Integer soLuongMoi = soLuongHienCo + soLuongChoVao;

            // Cập nhập lại giỏ hàng
            sanPhamTrongGio.put(maSanPham, soLuongMoi);
        } else { // Sản phẩm không có trong giỏ, thêm mới vào
            sanPhamTrongGio.put(maSanPham, soLuongChoVao);
        }
    }
}
