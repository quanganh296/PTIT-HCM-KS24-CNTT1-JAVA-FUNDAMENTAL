package SS6.Bai4;


public class Bai4 {
public static class Employee {
    // Thuộc tính
    private String maNV;
    private String tenNV;
    private double luong;

    // Constructor không tham số (mặc định)
    public Employee() {
        this.maNV = "N/A";
        this.tenNV = "Chưa có tên";
        this.luong = 0.0;
    }

    // Constructor có mã và tên
    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0.0; // lương mặc định
    }

    // Constructor đầy đủ mã, tên, lương
    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương: " + luong);
        System.out.println("-------------------------");
    }

    // Hàm main để chạy thử

}
}