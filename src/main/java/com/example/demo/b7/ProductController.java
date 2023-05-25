package com.example.demo.b7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/b7/product")
public class ProductController {

    @Autowired
    private IProductRepository repository;

    @GetMapping()
    public String view(Model model) {
        List<Product> products = repository.findAll();
        model.addAttribute("danhSachSanPham", products);
        return "b7/san-pham";
    }

    @GetMapping("/view-1")
    public String view1(Model model) {
        List<Product> products = repository.findByQuantityGreaterThanAndPriceBeforeOrderByProductName(
                100,
                BigDecimal.valueOf(4000000)
        );
        model.addAttribute("danhSachSanPham", products);
        return "b7/san-pham";
    }

    @GetMapping("/view-2")
    public String view2(Model model) {
        List<Product> products = repository.findByProductNameContains("scarlet");
        model.addAttribute("danhSachSanPham", products);
        return "b7/san-pham";
    }

    @GetMapping("/view-3")
    public String view3(Model model) {
        List<Product> products = repository.findByPriceBetween(
                BigDecimal.valueOf(3000000),
                BigDecimal.valueOf(4000000)
        );
        model.addAttribute("danhSachSanPham", products);
        return "b7/san-pham";
    }

    @GetMapping("/view-4")
    public String view4(Model model) {
        List<Product> products = repository.findByQuantityLessThan(100);
        model.addAttribute("danhSachSanPham", products);
        return "b7/san-pham";
    }
}
