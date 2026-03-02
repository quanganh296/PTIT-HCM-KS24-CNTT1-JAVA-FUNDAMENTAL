package SS6.Bai2;

import SS6.Bai2.Bai2;
public class MainBai2 {
    public static void main(String[] args) {
        // Tạo đối tượng Account
        Bai2.Account acc = new Bai2.Account("quang123", "123456", "quang@example.com");

        // Hiển thị thông tin ban đầu
        acc.hienThiThongTin();

        // Thực hiện đổi mật khẩu
        acc.doiMatKhau("123456", "654321");

        // Hiển thị thông tin sau khi đổi mật khẩu
        acc.hienThiThongTin();
    }
}
