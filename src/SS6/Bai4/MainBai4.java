import SS6.Bai4.Bai4;

public static void main(String[] args) {
    // Tạo nhân viên bằng constructor mặc định
    Bai4.Employee nv1 = new Bai4.Employee();
    nv1.hienThiThongTin();

    // Tạo nhân viên bằng constructor có mã và tên
    Bai4.Employee nv2 = new Bai4.Employee("NV002", "Nguyen Van B");
    nv2.hienThiThongTin();

    // Tạo nhân viên bằng constructor đầy đủ
    Bai4.Employee nv3 = new Bai4.Employee("NV003", "Tran Thi C", 1200.5);
    nv3.hienThiThongTin();
}