import java.util.Scanner;
public class _00_Class_04 {
    public static void main(String[] args) {
        //문자를 입력받아 해당 소문자로 변환하시오.

        Scanner scan = new Scanner(System.in);
        System.out.println("대문자를 입력하세요");
        char ch = scan.next().charAt(0);
        while (true) {
            if (ch <= 96) {
                ch = (char) (ch + 32);
            } else {
                ch = (char) (ch - 32);
            }
            System.out.println(ch);

        }



//        while (true) {
//            char ch = scan.next().charAt(0);
//            ch = (char) (ch + 32); //작은수 큰수 더하고 빼준다.
//            System.out.print(ch);
//        }



    }
}
