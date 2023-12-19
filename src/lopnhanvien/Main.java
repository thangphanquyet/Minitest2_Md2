package lopnhanvien;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien = new NhanVien();
        NhanVienFulltime[] a = new NhanVienFulltime[3];
        NhanVienFulltime nhanVien1 = new NhanVienFulltime(01, "Nguyễn Thị Một", 17, "0196699969", "nono", 500.0, 100.0, 10000.0);
        NhanVienFulltime nhanVien2 = new NhanVienFulltime(02, "Nguyễn Thị Hai", 18, "0296699969", "nono", 4000.0, 0.0, 15000.0);
        NhanVienFulltime nhanvien3 = new NhanVienFulltime(03, "Nguyễn Thị Ba", 17, "0396699969", "nono", 4500.0, 50.0, 20000.0);
        a[0]= nhanVien1;
        a[1]= nhanVien2;
        a[2]= nhanvien3;
        double luongfullttime = 0;
        for (int i = 0; i < a.length; i++) {
            luongfullttime += a[i].getLuongcung()+(a[i].getTientuong()-a[i].getTienphat());
        }
        System.out.println("2 Trung bình số lương nhân viên Fullttime là: "+ luongfullttime/ a.length +" usd");
        NhanVienParttime[] b = new NhanVienParttime[3];
        NhanVienParttime nhanVien4 = new NhanVienParttime(04, "Nguyễn Thị Bốn", 17, "0496699969", "nono", 8);
        NhanVienParttime nhanvien5 = new NhanVienParttime(05, "Nguyễn Thị năm", 18, "0596699969", "nono", 5);
        NhanVienParttime nhanvien6 = new NhanVienParttime(06, "Nguyễn Thị SÁu", 18, "0696699969", "nono", 6);
        b[0]= nhanVien4;
        b[1]= nhanvien5;
        b[2]= nhanvien6;
        double luongParttime = 0;
        for (int i = 0; i < b.length; i++) {
            luongParttime += b[i].getSogiolam()*1000;
        }
        System.out.println("3 Trung bình số lương của nhân viên Parttime là: "+ luongParttime/ b.length + " usd");
        double luongParttime1 = 0;
        for (int i = 0; i < b.length; i++) {
            luongParttime1 = luongParttime +b[i].getSogiolam()*1000;
        }
        System.out.println("4 Tổng số lương của nhân viên Parttime là: "+ luongParttime1+" usd");

    }
    public void luongtrungbinh(){
    }
}