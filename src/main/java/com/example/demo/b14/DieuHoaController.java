package com.example.demo.b14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/b14/dieu-hoa")
public class DieuHoaController {

    @GetMapping
    public String view(Model model) {
        return "b14/dieu-hoa";
    }
}
