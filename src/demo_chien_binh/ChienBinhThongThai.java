package demo_chien_binh;

public class ChienBinhThongThai extends ChienBinh implements IPhepThuat  {
    private int chiSoThongMinh;

    public ChienBinhThongThai(){

    }
    public ChienBinhThongThai(String ten, int tuoi, float chieuCao, int canNang, String vuKhi, int chiSoThongMinh) {
        super(ten, tuoi, chieuCao, canNang, vuKhi);
        this.chiSoThongMinh = chiSoThongMinh;
    }

    @Override
    public void chienDau() {
        System.out.println("Chiến binh thông thái "+getTen()+": chiến đầu dùng phép thuật");
    }

    @Override
    public String toString() {
        return "ChienBinhThongThai{" +
                super.toString()+
                "chiSoThongMinh=" + chiSoThongMinh +
                '}';
    }

    @Override
    public void hocHoMuaGoiGio() {
        System.out.println("Đi luyện phép thuật ho mưa gọi gió");
    }
}