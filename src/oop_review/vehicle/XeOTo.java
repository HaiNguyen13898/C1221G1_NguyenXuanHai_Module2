package oop_review.vehicle;

public class XeOTo extends  Vehicle implements VePhat{
    public XeOTo() {
    }

    public XeOTo(String chuXe, String mausac, String loaiXe, int bienSoXe, int dungTich, Double canNang, int tocDo, int triGia) {
        super(chuXe, mausac, loaiXe, bienSoXe, dungTich, canNang, tocDo, triGia);
    }

    public void drift () {
        System.out.println("Dominic said: family, yeah family, hãy drift");
    }

    public void bay () {
        System.out.println(" i believe i can fly ");
    }

    @Override
    public String toString() {
        return "Xe ô tô: " + super.toString();
    }

    @Override
    public void vePhat() {
        if ( getTocDo() > 300 ) {
            System.out.println(" Xuân nay con không về ");
        } else {
            System.out.println(" Nhấn ga lên 300km/h đi bạn eiii ");
        }
    }
}
