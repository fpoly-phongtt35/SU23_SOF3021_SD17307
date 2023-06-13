package com.example.demo.b14;

import jakarta.persistence.*;

@Entity
@Table(name = "dieuhoa")
public class DieuHoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "madieuhoa")
    private Long maDieuHoa;

    @Column(name = "tendieuhoa")
    private String tenDieuHoa;

    @Column(name = "lahaichieu")
    private Boolean laHaiChieu;

    @Column(name = "congsuat")
    private Integer congSuat;

    @Column(name = "luuluong")
    private Integer luuLuong;

    public Long getMaDieuHoa() {
        return maDieuHoa;
    }

    public void setMaDieuHoa(Long maDieuHoa) {
        this.maDieuHoa = maDieuHoa;
    }

    public String getTenDieuHoa() {
        return tenDieuHoa;
    }

    public void setTenDieuHoa(String tenDieuHoa) {
        this.tenDieuHoa = tenDieuHoa;
    }

    public Boolean getLaHaiChieu() {
        return laHaiChieu;
    }

    public void setLaHaiChieu(Boolean laHaiChieu) {
        this.laHaiChieu = laHaiChieu;
    }

    public Integer getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Integer congSuat) {
        this.congSuat = congSuat;
    }

    public Integer getLuuLuong() {
        return luuLuong;
    }

    public void setLuuLuong(Integer luuLuong) {
        this.luuLuong = luuLuong;
    }
}
