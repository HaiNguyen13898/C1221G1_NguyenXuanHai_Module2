package demo_chien_binh;

public abstract class ChienBinh extends ConNguoi {
    private String vuKhi;

    public ChienBinh() {
    }

    public ChienBinh(String ten, int tuoi, float chieuCao, int canNang, String vuKhi) {
        super(ten, tuoi, chieuCao, canNang);
        this.vuKhi = vuKhi;
    }

    @Override
    public void diChuyen() {
        System.out.println("Chiến binh di chuyển bằng ngụa");
    }
    public void lamNhiemVu(String tenNhiemVu){
        System.out.println(this.getTen()+ " làm nhiệm vụ "+ tenNhiemVu);
    }
    // phương thức abstract
    public abstract void chienDau();

    @Override
    public String toString() {
        return   super.toString()+
                "vuKhi='" + vuKhi + '\'' +
                '}';
    }
}
