package demo_chien_binh;

public class ChienBinhDepTrai extends ChienBinh implements Comparable<ChienBinhDepTrai> {
    private int doDepTrai;

    public ChienBinhDepTrai() {
    }

    public ChienBinhDepTrai(String ten, int tuoi, float chieuCao, int canNang, String vuKhi, int doDepTrai) {
        super(ten, tuoi, chieuCao, canNang, vuKhi);
        this.doDepTrai = doDepTrai;
    }

    @Override
    public void chienDau() {
        System.out.println(" Chiến binh đẹp trai "+ getTen() + "sử dụng nam nhân kế");
    }

    @Override
    public String toString() {
        return "ChienBinhDepTrai{" +
                super.toString()+
                "doDepTrai=" + doDepTrai +
                '}';
    }

    @Override
    public int compareTo(ChienBinhDepTrai o) {
//        if (this.doDepTrai>o.doDepTrai){
//            return -1;
//        }else if (this.doDepTrai<o.doDepTrai){
//            return 1;
//        }else {
//            return 0;
//        }
        return this.doDepTrai -o.doDepTrai;

    }
}