package SS4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Bai4 {


        public static void main(String[] args) {
            // Mã thẻ cần kiểm tra
            String cardID = "TV202312345";

            validateCardID(cardID);
        }

        public static void validateCardID(String cardID) {
            // 1. Định nghĩa Regex:
            // ^[A-Z]{2} : Bắt đầu bằng 2 chữ cái viết hoa
            // [0-9]{4}  : Tiếp theo là 4 chữ số (năm)
            // [0-9]{5}$ : Kết thúc bằng 5 chữ số ngẫu nhiên
            String regex = "^[A-Z]{2}[0-9]{4}[0-9]{5}$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(cardID);

            if (matcher.matches()) {
                System.out.println("Mã thẻ hợp lệ!");
            } else {
                // Kiểm tra lỗi cụ thể để thông báo cho người dùng
                checkSpecificErrors(cardID);
            }
        }

        private static void checkSpecificErrors(String cardID) {
            if (cardID == null || cardID.length() != 11) {
                System.out.println("Lỗi: Độ dài mã thẻ phải đúng 11 ký tự.");
                return;
            }

            // Kiểm tra 2 ký tự đầu (Tiền tố)
            if (!cardID.substring(0, 2).matches("[A-Z]{2}")) {
                System.out.println("Lỗi: Thiếu tiền tố hoặc tiền tố không phải chữ hoa (ví dụ: TV).");
            }
            // Kiểm tra 4 ký tự tiếp theo (Năm)
            else if (!cardID.substring(2, 6).matches("[0-9]{4}")) {
                System.out.println("Lỗi: Năm không hợp lệ (phải là 4 chữ số).");
            }
            // Kiểm tra 5 ký tự cuối
            else if (!cardID.substring(6).matches("[0-9]{5}")) {
                System.out.println("Lỗi: 5 ký tự cuối phải là số ngẫu nhiên.");
            } else {
                System.out.println("Lỗi: Định dạng không xác định.");
            }
        }
    }

