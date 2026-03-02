package SS6.Bai1;

public class Bai1 {
    // Khai báo lớp Student
    public static class Student {
        private String maSV;
        private String hoTen;
        private int namSinh;
        private double diemTB;

        // Constructor có tham số
        public Student(String maSV, String hoTen, int namSinh, double diemTB) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.namSinh = namSinh;
            this.diemTB = diemTB;
        }

        // Phương thức hiển thị thông tin
        public void hienThiThongTin() {
            System.out.println("Mã SV: " + maSV);
            System.out.println("Họ tên: " + hoTen);
            System.out.println("Năm sinh: " + namSinh);
            System.out.println("Điểm TB: " + diemTB);
            System.out.println("-------------------------");
        }
    }

    // Hàm main để chạy chương trình

}