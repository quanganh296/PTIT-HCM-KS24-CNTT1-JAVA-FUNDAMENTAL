package SS6.Bai3;


public class Bai3 {
public static class Product {
    // Thuộc tính private
    private String maSP;
    private String tenSP;
    private double giaBan;

    // Constructor
    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan); // dùng setter để kiểm tra giá
    }

    // Getter
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    // Setter có kiểm tra
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Giá bán không hợp lệ! Phải > 0");
        }
    }

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("-------------------------");
    }

    // Hàm main để chạy thử

}
}