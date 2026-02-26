package SS4;

public class Bai1 {
    public static void main(String[] args) {
        String title = "lập trình java cơ bản";
        String author = "nguyễn văn a";

        title = title.toUpperCase();

        System.out.println("Tiêu đề sách: " + title);
        System.out.println("Tác giả: " + capitalizeWords(author));
    }

    // Hàm hỗ trợ viết hoa chữ cái đầu mỗi từ
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (w.length() > 0) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                        .append(w.substring(1).toLowerCase()) // Đảm bảo các chữ sau là chữ thường
                        .append(" ");
            }
        }
        return sb.toString().trim();
    }
}
