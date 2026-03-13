package SS15.Bai4;

public class MainBai4 {

    public static void main(String[] args) {

        EmergencyQueue q = new EmergencyQueue();

        q.addPatient(new EmergencyPatient("BN01", "A", 2));
        q.addPatient(new EmergencyPatient("BN02", "B", 1));
        q.addPatient(new EmergencyPatient("BN03", "C", 2));
        q.addPatient(new EmergencyPatient("BN04", "D", 1));

        q.displayQueue();

        System.out.println("\n--- GỌI KHÁM ---");

        q.callNextPatient();
        q.callNextPatient();
        q.callNextPatient();
        q.callNextPatient();
    }
}