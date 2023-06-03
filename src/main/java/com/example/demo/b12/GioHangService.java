package com.example.demo.b12;

import com.example.demo.b7.IProductRepository;
import com.example.demo.b7.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GioHangService {

    @Autowired
    private GioHangSessionRepository repository;

    @Autowired
    private IProductRepository sanPhamRepository;

    public void themSanPhamVaoGio(Integer maSanPham, Integer soLuongThem) {

    }

    public void boSanPhamKhoiGio(Integer maSanPham, Integer soLuongBo) {

    }

    public GioHangViewModel xemSanPhamTrongGio() {
        GioHangViewModel gioHangViewModel = new GioHangViewModel();
        List<SanPhamTrongGio> sanPhamTrongGios = new ArrayList<>();

        GioHangDomainModel gioHangDomainModel = repository.layGioHang();
        for(Map.Entry<Integer, Integer> entry :
                gioHangDomainModel.getDsSanPhamTrongGio().entrySet()) {
            Integer maSanPham = entry.getKey();
            Integer soLuong = entry.getValue();

            Product sanPham = sanPhamRepository.findById(maSanPham).get();

            SanPhamTrongGio sanPhamTrongGio = new SanPhamTrongGio();
            sanPhamTrongGio.setMaSanPham(maSanPham);
            sanPhamTrongGio.setTenSanPham(sanPham.getProductName());
            sanPhamTrongGio.setSoLuong(soLuong);
            sanPhamTrongGio.setDonGia(sanPham.getPrice());

            sanPhamTrongGios.add(sanPhamTrongGio);
        }

        gioHangViewModel.setSanPhamTrongGios(sanPhamTrongGios);
        return gioHangViewModel;
    }
}
