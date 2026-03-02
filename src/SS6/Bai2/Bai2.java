package SS6.Bai2;


public class Bai2 {
public static class Account {
    // Thuộc tính
    private String username;
    private String password;
    private String email;

    // Constructor khởi tạo thông tin ban đầu
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Phương thức đổi mật khẩu
    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (this.password.equals(matKhauCu)) {
            this.password = matKhauMoi;
            System.out.println("Đổi mật khẩu thành công!");
        } else {
            System.out.println("Mật khẩu cũ không đúng, đổi thất bại!");
        }
    }

    // Phương thức hiển thị thông tin (ẩn mật khẩu)
    public void hienThiThongTin() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + "*".repeat(password.length())); // Ẩn mật khẩu
        System.out.println("-------------------------");
    }

    // Hàm main để chạy chương trình
}

}