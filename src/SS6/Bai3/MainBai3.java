import SS6.Bai3.Bai3;
public static void main(String[] args) {
    Bai3.Product p1 = new Bai3.Product("SP001", "Laptop Dell", 1500);
    p1.hienThiThongTin();

    // Thử set giá hợp lệ
    p1.setGiaBan(2000);
    p1.hienThiThongTin();

    // Thử set giá không hợp lệ
    p1.setGiaBan(-500);
    p1.hienThiThongTin();
}