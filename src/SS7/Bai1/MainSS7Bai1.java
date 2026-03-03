package SS7.Bai1;

public class MainSS7Bai1 {
    public static void main(String[] args) {

        // Tạo sinh viên thứ 1
        Bai1 student1 = new Bai1("SV001", "Nguyễn Văn A");
        student1.displayFull();
        System.out.println();

        // Tạo sinh viên thứ 2
        Bai1 student2 = new Bai1("SV002", "Trần Thị B");
        student2.displayFull();
        System.out.println();

        // Tạo sinh viên thứ 3
        Bai1 student3 = new Bai1("SV003", "Lê Văn C");
        student3.displayFull();
        System.out.println();

        // Tạo sinh viên thứ 4
        Bai1 student4 = new Bai1("SV004", "Phạm Thị D");
        student4.displayFull();
        System.out.println();

        // Tạo sinh viên thứ 5
        Bai1 student5 = new Bai1("SV005", "Đỗ Văn E");
        student5.displayFull();
        System.out.println();


        // Hoặc gọi trực tiếp từ lớp
        System.out.println("Tổng số sinh viên: " + Bai1.getTotalStudent());
    }
}

