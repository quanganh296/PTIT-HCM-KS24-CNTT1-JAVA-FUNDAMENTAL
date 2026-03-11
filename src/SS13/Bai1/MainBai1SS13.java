package SS13.Bai1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class MainBai1SS13 {

        public static void main(String[] args) {
            ArrayList<Double> arr =  new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));

            double average = 0;
            double sum = 0;
            ListIterator<Double> it = arr.listIterator();
            while(it.hasNext()){
                double value = it.next();
                if(value < 34.0 || value > 42.0) {
                    it.remove();
                }

            }
            System.out.print(arr + " ");
            for(double temp: arr) {
                sum += temp;
            }
            average = sum/arr.size();
            System.out.print("\n Nhiệt độ trung bình: \n" + average);


        }

}
