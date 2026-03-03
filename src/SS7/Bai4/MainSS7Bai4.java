package SS7.Bai4;


import SS7.Bai4.Bai4;
import SS7.Bai4.Bai4.ClassRoom;
public class MainSS7Bai4 {
    static void main(String[] args) {

            // Tạo các sinh viên khác nhau
            ClassRoom sv1 = new ClassRoom("Nguyễn Văn A");
            ClassRoom sv2 = new ClassRoom("Trần Thị B");
            ClassRoom sv3 = new ClassRoom("Lê Văn C");

            // Thực hiện đóng tiền
            sv1.addFund(50000);
            sv2.addFund(100000);

            // Kiểm tra quỹ
            ClassRoom.showTotalFund();

            sv3.addFund(20000);

            // Kiểm tra quỹ lần nữa
            ClassRoom.showTotalFund();

    }
}
