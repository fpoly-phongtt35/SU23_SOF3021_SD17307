package com.example.demo.b5.controller;

import com.example.demo.b5.model.GiangVien;
import com.example.demo.b5.service.GiangVienService;
import com.example.demo.b5.service.IGiangVienService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/b5/giang-vien")
public class GiangVienController {

    @Autowired
    private IGiangVienService service;

    @Autowired
    private HttpSession session;

    @GetMapping
    public String viewGiangVien(Model model) {
        ArrayList<GiangVien> dsGiangVien = service.getAll();
        model.addAttribute("danhSachGiangVien", dsGiangVien);
        return "b5/lecturer";
    }
}
