package SS15.Bai2;

import java.util.LinkedList;
import java.util.Queue;
public class PatientQueue {

        private Queue<Patient> queue = new LinkedList<>();

        // enqueue
        public void addPatient(Patient p) {

            queue.add(p);

            System.out.println("THÊM: " + p);
        }
        public Patient callNextPatient() {

            if (!queue.isEmpty()) {

                Patient p = queue.poll();

                System.out.println("KHÁM: " + p);

                return p;
            }

            System.out.println("Không có bệnh nhân");
            return null;
        }
        public Patient peekNextPatient() {

            if (!queue.isEmpty()) {
                return queue.peek();
            }

            return null;
        }


        public boolean isEmpty() {
            return queue.isEmpty();
        }


        public void displayQueue() {

            System.out.println("\n===== HÀNG ĐỢI =====");

            if (queue.isEmpty()) {
                System.out.println("Trống");
                return;
            }

            for (Patient p : queue) {
                System.out.println(p);
            }
        }
    }

