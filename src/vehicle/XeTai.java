package vehicle;

public class XeTai extends Vehicle{
    private double taiTrong;

    public XeTai() {
    }

    public XeTai(String bienSo, String hangXe, int namSanXuat, String tenChuXe, double taiTrong) {
        super(bienSo, hangXe, namSanXuat, tenChuXe);
        this.taiTrong = taiTrong;
    }

    public double getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(double taiTrong) {
        this.taiTrong = taiTrong;
    }


}
