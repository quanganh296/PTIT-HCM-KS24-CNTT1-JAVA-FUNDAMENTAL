import java.util.LinkedHashSet;
import java.util.Set;

public static class MainBai4SS14 {
    public static void main(String[] args) {
        // 1. Khởi tạo LinkedHashSet để giữ thứ tự và tránh trùng lặp
        Set<String> danhSachKham = new LinkedHashSet<>();

        // 2. Dữ liệu đầu vào (Input)
        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái", // Tên này bị trùng
                "Lê Văn C – Hưng Yên"
        };

        // 3. Thêm bệnh nhân vào hệ thống
        for (String benhNhan : input) {
            danhSachKham.add(benhNhan);
        }

        // 4. In kết quả (Output)
        System.out.println("Danh sách gọi khám (theo thứ tự đến):");
        int stt = 1;
        for (String benhNhan : danhSachKham) {
            System.out.println(stt + ". " + benhNhan);
            stt++;
        }
    }
}

void main() {
}