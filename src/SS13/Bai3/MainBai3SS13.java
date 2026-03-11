package SS13.Bai3;
import java.util.ArrayList;
import java.util.List;


public class MainBai3SS13 {
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
