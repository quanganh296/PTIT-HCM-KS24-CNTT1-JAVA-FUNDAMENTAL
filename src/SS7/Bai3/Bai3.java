package SS7.Bai3;


public class Bai3 {
    public static class ScoreUtils {
        public static boolean checkPass(double score) {
            if (score >= 5.0) return true;
            else return false;

        }

        // Phương thức tính trung bình cộng
        public static double calculateAverage(double[] scores) {
            double sum =0.0;
            for(double score : scores) {
                sum += score;
            }
            return sum / scores.length;
        }
    }
}
