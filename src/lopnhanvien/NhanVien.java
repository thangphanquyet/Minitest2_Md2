package lopnhanvien;

public class NhanVien {
    int manhanvien;
    String hovaten;
    int tuoi;
    String sdt;
    String email;

    public NhanVien() {
    }

    public NhanVien(int manhanvien, String hovaten, int tuoi, String sdt, String email) {
        this.manhanvien = manhanvien;
        this.hovaten = hovaten;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "manhanvien=" + manhanvien +
                ", hovaten='" + hovaten + '\'' +
                ", tuoi=" + tuoi +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}';
    }
}
