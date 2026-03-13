package SS15.Bai2;


        public class MainBai2SS15 {
    static void main(String[] args) {
        PatientQueue manager = new PatientQueue();


        manager.addPatient(new Patient("BN01", "Nguyen Van A", 20));
        manager.addPatient(new Patient("BN02", "Tran Van B", 35));
        manager.addPatient(new Patient("BN03", "Le Van C", 40));
        manager.addPatient(new Patient("BN04", "Le Van D", 45));


        manager.displayQueue();


        System.out.println("\nSắp khám:");
        System.out.println(manager.peekNextPatient());


        manager.callNextPatient();


        manager.displayQueue();

    }
}



