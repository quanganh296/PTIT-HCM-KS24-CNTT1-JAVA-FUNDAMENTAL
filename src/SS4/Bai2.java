package SS4;

public class Bai2 {
    static void main(String[] args) {
        String discription = " Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        String[] parts = discription.split(",");
        String found;
        for (String part : parts) {
            if (part.toLowerCase().contains("kệ:")) {
                found = part.trim();
                System.out.println("Vị trí tìm thấy: " + found);
                //thay "kệ:" thành "Vị trí lưu trữ:"
                found = found.replace("Kệ:", "Vị trí lưu trữ:");

                System.out.println("Sách giáo khoa Toán lớp 12, " + found + ", tình trạng mới");
                break;
            }
        }
    }
}
