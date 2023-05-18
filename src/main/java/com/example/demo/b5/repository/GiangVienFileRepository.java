package com.example.demo.b5.repository;

import com.example.demo.b5.model.GiangVien;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("GiangVienFileRepository")
public class GiangVienFileRepository implements IGiangVienRepository {

    private static final ArrayList<GiangVien> DANH_SACH_GIANG_VIEN = new ArrayList<>();
    static {
        DANH_SACH_GIANG_VIEN.add(new GiangVien("NguyenVV4", "Nguyễn Anh Dũng", 2003));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("MinhDQ8", "Đặng Quang Minh", 2003));
        DANH_SACH_GIANG_VIEN.add(new GiangVien("TienNH21", "Nguyễn Hoàng Tiến", 2000));
    }

    @Override
    public ArrayList<GiangVien> getAll() {
        return DANH_SACH_GIANG_VIEN;
    }
}
