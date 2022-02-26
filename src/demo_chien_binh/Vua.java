package demo_chien_binh;

public class Vua extends ConNguoi {
    boolean minhQuan;

    @Override
    public void diChuyen() {
        System.out.printf("Vua đi lại bằng kiệu");
    }

    public Vua() {
    }

    public Vua(String ten, int tuoi, float chieuCao, int canNang, boolean minhQuan) {
        super(ten, tuoi, chieuCao, canNang);
        this.minhQuan = minhQuan;
    }

    public void raLenh(String tenLenh){
        System.out.println("Vua ra lệnh: " +tenLenh);
    }

    @Override
    public String toString() {
        return "Vua{" +
                super.toString()+
                "minhQuan=" + minhQuan +
                '}';
    }
}
