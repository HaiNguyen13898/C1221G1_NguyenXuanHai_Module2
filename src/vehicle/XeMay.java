package vehicle;

public class XeMay extends Vehicle{
    private int congSuat;

    public XeMay(String bienSo, String hangXe, int namSanXuat, String tenChuXe, int congSuat) {
        super(bienSo, hangXe, namSanXuat, tenChuXe);
        this.congSuat = congSuat;
    }

    public XeMay() {

    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
}
