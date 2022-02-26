package oop_review.vehicle;

public class Vehicle {
    private String chuXe;
    private String mausac;
    private String loaiXe;
    private int bienSoXe;
    private int dungTich;
    private Double canNang;
    private int tocDo;
    private int triGia;

    public Vehicle() {
    }

    public Vehicle(String chuXe, String mausac, String loaiXe, int bienSoXe, int dungTich, Double canNang, int tocDo, int triGia) {
        this.chuXe = chuXe;
        this.mausac = mausac;
        this.loaiXe = loaiXe;
        this.bienSoXe = bienSoXe;
        this.dungTich = dungTich;
        this.canNang = canNang;
        this.tocDo = tocDo;
        this.triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(int bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public Double getCanNang() {
        return canNang;
    }

    public void setCanNang(Double canNang) {
        this.canNang = canNang;
    }

    public int getTocDo() {
        return tocDo;
    }

    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(int triGia) {
        this.triGia = triGia;
    }

    public double tinhThue() {
        double thue;
        if (dungTich < 100) {
            thue = triGia * 0.01;
        } else if (dungTich >= 100 && dungTich <= 200) {
            thue = triGia * 0.03;
        } else {
            thue = triGia * 0.05;
        }
        return thue;
    }

     public void hienThiThue() {
        System.out.println("Thuế xe của bạn là: " + tinhThue());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "chuXe='" + chuXe + '\'' +
                ", mausac='" + mausac + '\'' +
                ", loaiXe='" + loaiXe + '\'' +
                ", bienSoXe=" + bienSoXe +
                ", dungTich=" + dungTich +
                ", canNang=" + canNang +
                ", tocDo=" + tocDo +
                ", triGia=" + triGia +
                '}';
    }
}
