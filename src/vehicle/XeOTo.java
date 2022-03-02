package vehicle;

public class XeOTo extends Vehicle{
    private String kieuXe;
    private int soChoNgoi;

    public XeOTo() {
    }


    public XeOTo(String bienSo, String hangXe, int namSanXuat, String tenChuXe, String kieuXe, int soChoNgoi) {
        super(bienSo, hangXe, namSanXuat, tenChuXe);
        this.kieuXe = kieuXe;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
}
