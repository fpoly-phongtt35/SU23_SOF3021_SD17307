package com.example.demo.b4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
@RequestMapping("/b4/san-pham")
public class SanPhamController {

    private static final ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
    static {
        danhSachSanPham.add(new SanPham(1L, "TH Milk Chuoi", BigDecimal.valueOf(4000), 699));
        danhSachSanPham.add(new SanPham(2L, "TH Milk Xoai", BigDecimal.valueOf(3000), 199));
        danhSachSanPham.add(new SanPham(3L, "TH Milk Mang Cut", BigDecimal.valueOf(5000), 999));
        danhSachSanPham.add(new SanPham(4L, "TH Milk Dau", BigDecimal.valueOf(3000), 199));
        danhSachSanPham.add(new SanPham(5L, "TH Milk Cam", BigDecimal.valueOf(3000), 199));
    }

    @GetMapping
    public String xemDanhSach(Model model) {
        model.addAttribute("danhSachSanPham", danhSachSanPham);
        return "b4/san-pham";
    }
}
