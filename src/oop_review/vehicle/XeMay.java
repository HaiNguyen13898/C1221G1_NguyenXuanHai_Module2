package oop_review.vehicle;

public class XeMay extends Vehicle implements VePhat  {

    public XeMay() {
    }

    public XeMay(String chuXe, String mausac, String loaiXe, int bienSoXe, int dungTich, Double canNang, int tocDo, int triGia) {
        super(chuXe, mausac, loaiXe, bienSoXe, dungTich, canNang, tocDo, triGia);
    }

    public void bocDau () {
        System.out.println("Quẩy lên nào anh em, xem anh thể hiện đây");
    }

    public void vuotDenDo () {
        System.out.println("Đừng cản anh, người yêu của anh hiện đang ở nhà một mình");
    }

    @Override
    public String toString() {
        return "Xe may: " + super.toString();
    }

    @Override
    public void vePhat() {
        if ( getTocDo() > 180 ) {
            System.out.println(" á à m chọn cái chết");
        } else {
            System.out.println(" chạy nhanh nữa lên chàng trai, tình yêu đang ở nhà một mình");
        }
    }
}
