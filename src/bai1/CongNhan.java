package bai1;

public class CongNhan extends CanBo {

    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int tuoi, char gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", bac=" + bac + '}';
    }

}
