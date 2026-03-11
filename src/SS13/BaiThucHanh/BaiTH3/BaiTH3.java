package SS13.BaiThucHanh.BaiTH3;
import java.util.ArrayList;
import java.util.List;


public class BaiTH3 {
    static void main(String[] args) {
        List<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Chuột");
        products.add("Bàn phím");

        products.set(1, "Chuột Gaming");

        products.remove(2);

        System.out.println(products);

    }
}
