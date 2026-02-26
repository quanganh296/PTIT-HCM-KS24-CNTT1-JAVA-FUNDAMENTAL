package SS4;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class Bai3 {


        public static void main(String[] args) {
            // 1. Tạo danh sách các giao dịch
            String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

            // Lấy ngày hiện tại để làm báo cáo
            String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            // --- SỬ DỤNG STRINGBUILDER ---
            long startSB = System.currentTimeMillis();
            StringBuilder sbReport = new StringBuilder();
            sbReport.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
            sbReport.append("Ngày tạo: ").append(currentDate).append("\n");

            for (String record : transactions) {
                sbReport.append("Giao dịch: ").append(record).append("\n");
            }

            // Để thấy rõ sự khác biệt về hiệu năng, trong thực tế ta thường lặp lại hàng nghìn lần
            // Ở đây ta in kết quả ra màn hình
            String finalReportSB = sbReport.toString();
            long endSB = System.currentTimeMillis();
            long timeSB = endSB - startSB;


            // --- SỬ DỤNG PHÉP CỘNG CHUỖI (+) THÔNG THƯỜNG ---
            long startS = System.currentTimeMillis();
            String sReport = "--- BÁO CÁO MƯỢN SÁCH ---\n";
            sReport += "Ngày tạo: " + currentDate + "\n";

            for (String record : transactions) {
                sReport += "Giao dịch: " + record + "\n";
            }
            long endS = System.currentTimeMillis();
            long timeS = endS - startS;

            // 3. Hiển thị kết quả mong muốn
            System.out.println(finalReportSB);
            System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeSB);
            System.out.println("Số thời gian thực thi đối với String: " + timeS);
        }
    }

