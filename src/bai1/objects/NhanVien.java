package bai1.objects;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int tuoi, char gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", congViec=" + congViec + '}';
    }

}
