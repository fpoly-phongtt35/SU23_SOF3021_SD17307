package com.example.demo.b2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class Session2Controller {

    @RequestMapping("/b2") // cấu hình đường dẫn
    public String welcome() {
        return "index"; // view
    }

    @RequestMapping("/b2/sinh-vien")
    public String listSinhVien(Model model) {
        String[] list = new String[] {
                "DungNA29", "TienNH21", "MinhDQ8", "NguyenVV4"
        };

        model.addAttribute("listSinhVien", list);

        return "b2/sinh-vien";
    }

    @GetMapping("/b2/tinh-tuoi")
    public String viewTinhTuoi() {
        return "b2/tinh-tuoi";
    }

    @PostMapping("/b2/tinh-tuoi")
    public String doTinhTuoi(Model model
        , @RequestParam(name = "year") Integer namSinh) {
        Integer namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        Integer age = namHienTai - namSinh;
        model.addAttribute("age", age);
        return "b2/tinh-tuoi";
    }
}
