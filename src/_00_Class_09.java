import java.util.Scanner;

public class _00_Class_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myMoney = 1000;
        int choice = 0;
        //1.밀크커피-300 2.헤이즐럿커피-500 3.블랙커피-350 4.코코아-300 5.우유-400 6.잔액충전
        loop: while (true) {
            System.out.println(" [ 우리동네 자판기 ] ");
            System.out.println("밀크커피[300] 헤이커피[500] 블랙커피[350] 코코아[350] 우유[400] 잔액충전[6] 프로그램종료[0]");
            System.out.println("현재잔액 :" + myMoney);
            System.out.println("원하는 메뉴를 눌러주세요");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    myMoney = order(myMoney,300,"밀크커피");
                    break;
                case 2:
                    myMoney = order(myMoney,500,"헤이커피");
//                    if (myMoney >= 500) {
//                        System.out.println("헤이커피가 자동으로 나옵니다.");
//                        myMoney = myMoney - 500;// myMoney -= 300;
//                    } else {
//                        System.out.println("잔액이 부족합니다. 잔액을 충전하여 주세요.");
//                    }
                    break;
                case 3://블랙커피 350
                    myMoney = order(myMoney,350,"블랙커피");
//                    if (myMoney >= 350){
//                        System.out.println("블랙커피가 나옵니다");
//                        myMoney = myMoney - 350;
//                    }else {
//                        System.out.println("잔액이 부족합니다. 잔액을 충전하여 주세요");
//                    }
                    break;
                case 4://코코아 350
                    myMoney = order(myMoney,350,"코코아");
//                    if (myMoney >= 350) {
//                    System.out.println("코코아가 나옵니다");
//                    myMoney = myMoney -350;
//                    }else {
//                        System.out.println("잔액이 부족합니다. 충전하세요");
//                    }
                    break;
                case 5://우유 400
                    myMoney = order(myMoney,400,"우유");
//                    if (myMoney >= 400) {
//                        System.out.println("우유가 나옵니다");
//                        myMoney = myMoney - 400;
//                    }else {
//                        System.out.println("잔액이 부족합니다. 충전하셈");
//                    }
                    break;
                case 6: // 잔액충전
                    System.out.println("잔액을 충전합니다. 얼마를 충전하시겠습니까?");
                    int temp = scan.nextInt();
                    if (temp > 0) {
                        System.out.println("결제수단 : 1. 카드결제 2. 현금결제");
                        choice = scan.nextInt();
                        if (choice == 1) {
                            myMoney += temp;
                            System.out.println("[ 카드결제가 되었습니다.]");
                            System.out.println("충전 금액 : " + temp);
                            System.out.println("현재 잔액 : " + myMoney);
                            System.out.println();
                        } else {
                            System.out.println(" [ 시스템 오류 다시 실행 요망] ");
                            System.out.println();
                        }

                    }
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    System.out.println();
                    break loop;
            } // switch
        } // while
    } // main

    //음료 제조 메소드
    static int order(int myMoney,int price,String title) {//스태틱붙이면 선언안해도 사용 할 수 있다.
        if (myMoney >= price) {
            System.out.println(title+"밀크커피가 자동으로 나옵니다.");
            myMoney = myMoney - price;// myMoney -= 300;
        } else {
            System.out.println("잔액이 부족합니다. 잔액을 충전하여 주세요.");
        }
        return myMoney;
    }//order 객체
} // class