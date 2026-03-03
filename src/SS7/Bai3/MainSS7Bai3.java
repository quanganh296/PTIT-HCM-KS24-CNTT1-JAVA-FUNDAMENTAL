package SS7.Bai3;


import SS7.Bai3.Bai3;

public class MainSS7Bai3 {
    public static void main(String[] args) {
        double[] scores = {7.5, 8.0, 6.0, 4.5, 9.0};


        System.out.println("Danh sách điểm số: ");
        for (double score : scores) {
            System.out.println(score);
        }
        System.out.println("\n");


        double average = Bai3.ScoreUtils.calculateAverage(scores);
        System.out.println("Điểm trung bình cả lớp : %.2f" + average);

        for (double score : scores) {
            boolean isPass = Bai3.ScoreUtils.checkPass(score);
            String status = isPass ? "Đậu" : "Trượt";
            System.out.println("- Điểm " + score + ": " + status);
        }

    }
}
