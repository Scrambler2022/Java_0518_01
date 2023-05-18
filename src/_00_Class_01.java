import java.util.Scanner;
public class _00_Class_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //5! = 5*4*3*2*1;
        //10! = 10*9*8*7*6*5*4*3*2*1;
        //for문으로 해보세요.
        //숫자를 입력받아 해당되는 팩토리얼???을 구현하시오.
        int num=1;
        int input = 0;
        System.out.println("팩토리얼에 사용하는 숫자를 입력하세요");
        input = scan.nextInt();//팩토리얼을 계산하기위한 입력값
        for (int i=input; i>0;i--){//팩토리얼을 반복하여 계산한 반복문
            num = num*i;
            System.out.println("num : "+num);
        }
        System.out.printf("result : "+num);
        int num1 = 0;int num2 = 0;int num3 = 0;int sum = 0;int sum2 = 0;int sum3 = 0;
        //
        for (int i=0; i<=10; i++) {
            sum = sum + i;
        }//for
        System.out.println("1-10의합" + sum + "입니다.");
        ///////////////////
        for (int i=0; i<=100; i++) {
            sum2 = sum2 + i;
        }//for
        System.out.println("1-100의합" + sum2 + "입니다.");
        //////////////////////////////////////////
        for (int i=0; i<=1000; i++) {
            sum3 = sum3 + i;
        }//for
        System.out.println("1-1000의합" + sum3 + "입니다.");
    }//main
}//class