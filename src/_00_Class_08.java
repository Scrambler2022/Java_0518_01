import java.util.Scanner;

public class _00_Class_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //로또 맞추기
        //1-45까지 숫자입력
        int[] lotto = new int[45];
        int[] myNum = new int[6];
        int[] myLotto = new int[6];

        //1-45번까지 숫자를 lotto 넣어 보세요.
        //for
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;
        }
        for (int i = 0; i < lotto.length; i++) {
            //System.out.print(lotto[i]+"\t");
        }
        //번호섞기
        int temp = 0;
        for (int i = 0; i < 100000; i++) {
            int random = (int) (Math.random() * 45);
            temp = lotto[0];
            lotto[0] = lotto[random];
            lotto[random] = temp;
        }
        //
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
        //번호 입력하기
        for (int i = 0; i < myNum.length; i++) {
            System.out.println("번호를 입력하세요");
            myNum[i] = scan.nextInt();
        }
        //입력한번호 출력하기
        System.out.println("서건웅이가 입력한 노또 본호");
        for (int i = 0; i < myNum.length; i++) {
            System.out.print(myNum[i] + "\t");
        }
        System.out.println();
        // 당첨된 번호 넣기
        int count = 0; // 당첨된 번호 개수를 확인하는 변수
        System.out.println("로또 제 777회 당첨 번호");
        for (int i = 0; i < 6; i++) { // myNum의 각 요소에 대하여
            for (int j = 0; j < 45; j++) { // lotto의 모든 요소와 비교
                if (myNum[i] == lotto[j]) { // 당첨되었는지 확인
                    count++;
                    System.out.print(myNum[i] + "\t"); // 당첨된 번호 출력
                    break; // 중복 확인 방지를 위해 break를 사용해 루프를 빠져나감
                }
            }
        }
        System.out.println("\n당첨된 번호의 개수: " + count);
    }
}