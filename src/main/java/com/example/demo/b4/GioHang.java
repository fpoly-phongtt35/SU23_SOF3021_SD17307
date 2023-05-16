package com.example.demo.b4;

import java.util.HashMap;
import java.util.Map;

public class GioHang {

    private Map<Long, Integer> sanPhamTrongGio = new HashMap<>();

    public Map<Long, Integer> getSanPhamTrongGio() {
        return sanPhamTrongGio;
    }

    public void setSanPhamTrongGio(Map<Long, Integer> sanPhamTrongGio) {
        this.sanPhamTrongGio = sanPhamTrongGio;
    }
}
