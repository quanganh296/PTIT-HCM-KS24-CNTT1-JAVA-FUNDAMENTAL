package SS13.Bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
public class MainBai2SS13 {
    static void main(String[] args) {
        List<String> input = Arrays.asList("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen");
        List<String> output = processMedicineList(input);

        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
    public static List<String> processMedicineList(List<String> inputList) {
        // 1. Sử dụng TreeSet để vừa lọc trùng, vừa tự động sắp xếp A-Z
        TreeSet<String> cleanSet = new TreeSet<>(inputList);

        // 2. Chuyển ngược lại về List để trả về theo yêu cầu
        return new ArrayList<>(cleanSet);
    }
}
