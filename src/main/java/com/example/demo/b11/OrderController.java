package com.example.demo.b11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/b11/order")
public class OrderController {

    @Autowired
    private IOrderRepository repository;

    @GetMapping
    public String view(Model model) {
        List<Order> orders = repository.timHet();
        model.addAttribute("orders", orders);
        return "b11/hoa-don";
    }

    @GetMapping("/sdt")
    public String viewSdt(Model model) {
        List<Order> orders = repository
                .timTheoSdt("799 465 9696");
        model.addAttribute("orders", orders);
        return "b11/hoa-don";
    }

    @GetMapping("/vang-lai")
    public String viewVangLai(Model model) {
        List<OrderVangLai> orders = repository.timHoaDonVangLai();
        model.addAttribute("orders", orders);
        return "b11/hoa-don-vang-lai";
    }
}
