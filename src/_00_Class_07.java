import java.util.Scanner;

public class _00_Class_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int)(Math.random()*100)+1;
        int[] num = new  int[10];
        //for문
        for (int i=0; i<10; i++) {
            //1. 숫자입력
            num[i] = scan.nextInt();
            //비교 if(입력받은 숫자와 랜덤숫자가 같은지 비교)
            if(num[i] == random) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("틀렸습니다. 다시 입력하세요.");
            }//else
        }//for
    }//main
}//class
