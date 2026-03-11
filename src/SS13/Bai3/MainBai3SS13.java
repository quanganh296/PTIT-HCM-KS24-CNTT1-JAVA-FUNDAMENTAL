package SS13.Bai3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MainBai3SS13 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {

        List<T> common = new ArrayList<>(listA);

        // retainAll: Chỉ giữ lại những phần tử có xuất hiện trong listB
        common.retainAll(listB);

        return common;
    }
    public static void main(String[] args) {
        // --- Trường hợp 1: Integer (ID Bệnh nhân) ---
        List<Integer> idsA = Arrays.asList(101, 102, 105);
        List<Integer> idsB = Arrays.asList(102, 105, 108);
        List<Integer> commonIds = findCommonPatients(idsA, idsB);
        System.out.println("ID chung: " + commonIds); // Kết quả: [102, 105]

        // --- Trường hợp 2: String (Mã BHYT) ---
        List<String> bhytA = Arrays.asList("DN01", "DN02", "DN03");
        List<String> bhytB = Arrays.asList("DN02", "DN04");
        List<String> commonBhyt = findCommonPatients(bhytA, bhytB);
        System.out.println("Mã BHYT chung: " + commonBhyt); // Kết quả: [DN02]
    }
}
