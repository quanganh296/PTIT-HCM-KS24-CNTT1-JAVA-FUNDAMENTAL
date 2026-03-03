package SS7.Bai1;

public class Bai1 {
    private String studentId;
    private String studentName;

    private static int totalStudent = 0;

    // Constructor
    public Bai1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId + ", Tên sinh viên: " + studentName);
    }

    // Phương thức hiển thị đầy đủ (thông tin sinh viên + tổng số sinh viên)
    public void displayFull() {
        displayInfo();
    }
}
