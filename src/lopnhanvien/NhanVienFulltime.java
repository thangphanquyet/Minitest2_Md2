package lopnhanvien;

public class NhanVienFulltime extends NhanVien {
    double tienthuong;
    double tienphat;
    double luongcung;

    public NhanVienFulltime() {
    }

    public NhanVienFulltime(int manhanvien, String hovaten, int tuoi, String sdt, String email, double tientuong, double tienphat, double luongcung) {
        super(manhanvien, hovaten, tuoi, sdt, email);
        this.tienthuong = tientuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public double getTientuong() {
        return tienthuong;
    }

    public void setTientuong(double tientuong) {
        this.tienthuong = tientuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "tientuong=" + tienthuong +
                ", tienphat=" + tienphat +
                ", luongcung=" + luongcung +
                ", manhanvien=" + manhanvien +
                ", hovaten='" + hovaten + '\'' +
                ", tuoi=" + tuoi +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}';
    }
}
