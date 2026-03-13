package SS15.Bai4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> capCuu = new LinkedList<>();
    private Queue<EmergencyPatient> thuong = new LinkedList<>();


    public void addPatient(EmergencyPatient p) {

        if (p.getPriority() == 1) {
            capCuu.add(p);
            System.out.println("THÊM CẤP CỨU: " + p);
        } else {
            thuong.add(p);
            System.out.println("THÊM THƯỜNG: " + p);
        }
    }


    public EmergencyPatient callNextPatient() {

        if (!capCuu.isEmpty()) {

            EmergencyPatient p = capCuu.poll();
            System.out.println("KHÁM (ƯU TIÊN): " + p);
            return p;
        }

        if (!thuong.isEmpty()) {

            EmergencyPatient p = thuong.poll();
            System.out.println("KHÁM: " + p);
            return p;
        }

        System.out.println("Không còn bệnh nhân");
        return null;
    }


    public void displayQueue() {

        System.out.println("\n===== DANH SÁCH CẤP CỨU =====");

        for (EmergencyPatient p : capCuu) {
            System.out.println(p);
        }

        System.out.println("\n===== DANH SÁCH THƯỜNG =====");

        for (EmergencyPatient p : thuong) {
            System.out.println(p);
        }
    }
}