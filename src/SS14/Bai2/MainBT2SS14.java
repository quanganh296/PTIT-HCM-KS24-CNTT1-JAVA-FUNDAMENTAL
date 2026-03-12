package SS14.Bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainBT2SS14 {

        public static void main(String[] args) {
            // 1. Khởi tạo HashMap (Key: Mã thuốc, Value: Tên thuốc)
            Map<String, String> danhMucThuoc = new HashMap<>();

            // 2. Thêm sẵn 5 loại thuốc vào danh mục
            danhMucThuoc.put("T01", "Paracetamol");
            danhMucThuoc.put("T02", "Ibuprofen");
            danhMucThuoc.put("T03", "Aspirin");
            danhMucThuoc.put("T04", "Amoxicillin");
            danhMucThuoc.put("T05", "Vitamin C");

            // 3. Xử lý tra cứu
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã thuốc cần tra cứu: ");
            String maNhap = scanner.nextLine().trim(); // Xóa khoảng trắng thừa

            // 4. Kiểm tra sự tồn tại của mã trong Map
            if (danhMucThuoc.containsKey(maNhap)) {
                String tenThuoc = danhMucThuoc.get(maNhap);
                System.out.println("Kết quả: Tên thuốc: " + tenThuoc);
            } else {
                System.out.println("Kết quả: Thuốc không tồn tại trong danh mục BHYT.");
            }

            scanner.close();
        }
    }

