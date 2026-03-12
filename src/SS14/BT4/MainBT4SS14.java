package SS14.BT4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainBT4SS14 {

    public static void main(String[] args) {

        // 1. Danh sách ca bệnh trong ngày
        List<String> danhSachCaBenh = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        // 2. TreeMap để thống kê và tự sắp xếp theo alphabet
        Map<String, Integer> thongKe = new TreeMap<>();

        // 3. Thống kê số ca bệnh
        for (String tenBenh : danhSachCaBenh) {

            if (thongKe.containsKey(tenBenh)) {

                int soCa = thongKe.get(tenBenh);
                thongKe.put(tenBenh, soCa + 1);

            } else {

                thongKe.put(tenBenh, 1);

            }
        }

        // 4. In báo cáo
        System.out.println("----- BAO CAO DICH TE -----");

        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {

            System.out.println(
                    entry.getKey() + " : "
                            + entry.getValue() + " ca"
            );

        }

    }
}