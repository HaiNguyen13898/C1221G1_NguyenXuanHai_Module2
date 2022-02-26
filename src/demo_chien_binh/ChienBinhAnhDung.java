package demo_chien_binh;

public class ChienBinhAnhDung extends ChienBinh implements IPhepThuat, ILuyenCong {
    private int sucManh;
    public ChienBinhAnhDung() {
    }
    public ChienBinhAnhDung(String ten, int tuoi, float chieuCao, int canNang, String vuKhi, int sucManh) {
        super(ten, tuoi, chieuCao, canNang, vuKhi);
        this.sucManh = sucManh;
    }

    @Override
    public void chienDau() {
        System.out.println("Chiến binh anh dung "+ getTen()+ " chiến đấu bằng sức mạnh và trí thông minh");
    }

    @Override
    public void luyenCong() {
        System.out.println("Đi luyen công");
    }

    @Override
    public void hocHoMuaGoiGio() {
        System.out.println("luyên ho mưa gọi gió");
    }
}

