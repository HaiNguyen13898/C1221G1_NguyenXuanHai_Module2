package vehicle;

public abstract class  Vehicle {
    private  String bienSo;
    private  String hangXe;
    private  int namSanXuat;
    private  String tenChuXe;



    public Vehicle() {
    }

    public Vehicle(String bienSo, String hangXe, int namSanXuat, String tenChuXe) {
        this.bienSo = bienSo;
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
        this.tenChuXe = tenChuXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
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
