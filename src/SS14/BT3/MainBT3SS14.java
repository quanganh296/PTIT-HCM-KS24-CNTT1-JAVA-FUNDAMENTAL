package SS14.BT3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainBT3SS14 {

        public static void main(String[] args) {
            // 1. Khởi tạo dữ liệu ban đầu
            Set<String> thanhPhanThuoc = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
            Set<String> chatDiUng = new HashSet<>(Arrays.asList("Penicillin", "Aspirin", "Pollen"));

            // 2. Tìm các chất gây dị ứng (Phép Giao - retainAll)
            // Tạo bản sao để không làm hỏng dữ liệu gốc
            Set<String> canhBao = new HashSet<>(thanhPhanThuoc);
            canhBao.retainAll(chatDiUng);

            // 3. Tìm các thành phần an toàn (Phép Hiệu - removeAll)
            Set<String> thanhPhanAnToan = new HashSet<>(thanhPhanThuoc);
            thanhPhanAnToan.removeAll(chatDiUng);

            // 4. In kết quả
            System.out.println("Thuốc mới chứa: " + thanhPhanThuoc);
            System.out.println("Bệnh nhân dị ứng với: " + chatDiUng);
            System.out.println("------------------------------------");

            if (!canhBao.isEmpty()) {
                System.out.println("CẢNH BÁO DỊ ỨNG: " + canhBao);
            } else {
                System.out.println("Thuốc an toàn tuyệt đối!");
            }

            System.out.println("Thành phần an toàn cho bệnh nhân: " + thanhPhanAnToan);
        }
    }

