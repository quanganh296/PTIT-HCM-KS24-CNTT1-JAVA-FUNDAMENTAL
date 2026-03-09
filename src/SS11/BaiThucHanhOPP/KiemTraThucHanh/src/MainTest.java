package SS11.BaiThucHanhOPP.KiemTraThucHanh.src;
public class MainTest {
    public static void main(String[] args) {
        // Khai báo mảng đối tượng Drink
        Drink[] drinks = new Drink[3];

        // Khởi tạo dữ liệu cho mảng
        drinks[0] = new Coffee("CF001", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("FJ001", "Nước dâu", 40000, 10);
        drinks[2] = null;

        // Duyệt mảng để in thông tin hóa đơn
        System.out.println("========== HÓA ĐƠN ĐỒ UỐNG ==========\n");
        for (int i = 0; i < drinks.length; i++) {
            // Kiểm tra phần tử không phải null
            if (drinks[i] != null) {
                System.out.println("--- Sản phẩm " + (i + 1) + " ---");
                drinks[i].displayInfo();
                System.out.println("Thành tiền: " + drinks[i].calculatePrice());

                // Kiểm tra nếu đồ uống thực thi IMixable
                if (drinks[i] instanceof IMixable) {
                    IMixable mixable = (IMixable) drinks[i];
                    mixable.mix();
                }
                System.out.println();
            }
        }
        System.out.println("====================================");
    }
}