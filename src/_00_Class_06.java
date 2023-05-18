import java.util.Scanner;

public class _00_Class_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[3]; // 국어, 영어, 수학 점수를 저장할 배열
        String[] subjects = {"국어", "영어", "수학"}; // 과목명을 저장할 배열
        // 각 과목의 점수를 입력받는다
        for (int i = 0; i < 3; i++) {
            System.out.println(subjects[i] + " 점수를 입력하세요");
            scores[i] = scan.nextInt();
        }
        // 총점과 평균을 계산한다
        int total = total(scores[0], scores[1], scores[2]);
        double avg = avg(scores[0], scores[1], scores[2]);
        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);
        // 등급을 결정한다
        String grade;
        if (avg >= 97) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else {
            grade = "F";
        }
        System.out.println("등급: " + grade);
        scan.close();
    }
    // 총점을 계산하는 메소드
    public static int total(int a, int b, int c) {
        return a + b + c;
    }
    // 평균을 계산하는 메소드
    public static double avg(int a, int b, int c) {
        return total(a, b, c) / 3.0;
    }
}//class
