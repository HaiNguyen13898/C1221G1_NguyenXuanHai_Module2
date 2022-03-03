package vehicle;

public abstract class  Vehicle {
    private  String licensePlates;
    private  String hangXe;
    private  int namSanXuat;
    private  String tenChuXe;

    public Vehicle() {
    }

    public Vehicle(String bienSo, String hangXe, int namSanXuat, String tenChuXe) {
        this.licensePlates = bienSo;
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
        this.tenChuXe = tenChuXe;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }



}
