package SS7.Bai4;

public class Bai4 {
    public static class ClassRoom {
        public static double classFund = 0;
        public String name;

        public ClassRoom(String StudentName) {
            this.name = StudentName;

        }
        public void addFund(double amount) {
             classFund += amount;
            System.out.println(name + " đã đóng: " + amount + " VNĐ");
        }
        public static void showTotalFund() {
            System.out.println("--- Tổng quỹ lớp hiện tại: " + classFund + " VNĐ ---");
        }
    }
}
