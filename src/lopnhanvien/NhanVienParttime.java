package lopnhanvien;

public class NhanVienParttime extends NhanVien {
    int sogiolam;
    public NhanVienParttime(){
    }

    public NhanVienParttime(int manhanvien, String hovaten, int tuoi, String sdt, String email, int sogiolam) {
        super(manhanvien, hovaten, tuoi, sdt, email);
        this.sogiolam = sogiolam;
    }

    public int getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "sogiolam=" + sogiolam +
                ", manhanvien=" + manhanvien +
                ", hovaten='" + hovaten + '\'' +
                ", tuoi=" + tuoi +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}';
    }
}
