import java.util.Scanner;
public class _00_Class_03 {
    public static void main(String[] args) {
        // Scanner 는 입력할때만 쓴다.
        Scanner scan = new Scanner(System.in);
        //Number
//        int num = 0;
//        String str = new String();
//        int num = scan.nextInt();
//        String str = scan.next(); // 사이 띄우기 까지 포함시켜준다.
        //숫자 2개를 입력받아 1,100 -> 1부터 100까지의 합을 구하시오.
        System.out.println("첫번째 숫자를 입력하세요");
        int num = scan.nextInt(); // 1
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = scan.nextInt(); //100
        //
        //if
        int temp=0;
        if(num>num2) {
            temp = num;
            num = num2;
            num2 = temp;
        }

        int sum2 = 0;
        for (int i=num; i<=num2; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("1부터 100까지이 합은"+ sum2 + "입니다");
    }
}
