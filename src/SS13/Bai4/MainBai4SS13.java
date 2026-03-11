package SS13.Bai4;

import java.util.LinkedList;
public class MainBai4SS13 {

        private LinkedList<String> queue = new LinkedList<>();

        // Bệnh nhân thường: Thêm vào cuối danh sách (addLast)
        public void patientCheckIn(String name) {
            queue.addLast(name);
            System.out.println("Bệnh nhân mới: " + name);
        }

        // Ca cấp cứu: Thêm vào đầu danh sách (addFirst)
        public void emergencyCheckIn(String name) {
            queue.addFirst(name);
            System.out.println("CẤP CỨU: " + name);
        }

        // Bác sĩ khám: Lấy và xóa người ở đầu danh sách (pollFirst hoặc removeFirst)
        public void treatPatient() {
            if (queue.isEmpty()) {
                System.out.println("Không còn bệnh nhân nào trong hàng đợi.");
                return;
            }

            // Lấy bệnh nhân đầu tiên ra
            String patient = queue.pollFirst();

            // Kiểm tra xem đây có phải ca cấp cứu không (logic giả định để in thông báo)
            // Trong thực tế bạn có thể dùng một Object Patient có thuộc tính isEmergency
            if (patient.equals("C")) { // Dựa theo ví dụ mẫu
                System.out.println("Đang cấp cứu: " + patient);
            } else {
                System.out.println("Đang khám: " + patient);
            }
        }

        public static void main(String[] args) {
            MainBai4SS13 er = new MainBai4SS13();

            // 1. Bệnh nhân A, B đến khám
            er.patientCheckIn("A");
            er.patientCheckIn("B");

            // 2. Ca C nguy kịch đến
            er.emergencyCheckIn("C");

            // 3. Bác sĩ lần lượt gọi khám
            System.out.println("\n--- Bắt đầu quy trình khám bệnh ---");
            er.treatPatient(); // Sẽ gọi C
            er.treatPatient(); // Sẽ gọi A
            er.treatPatient(); // Sẽ gọi B
        }

}
