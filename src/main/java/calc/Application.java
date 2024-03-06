package calc;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 메인
        // 스캐너 이용 반복문 활용 1.2.3.4. 사칙연산 9. 프로그램종료
        // 찬우

        Scanner sc = new Scanner(System.in);
        System.out.println("");

    }




        Application app = new Application();
        Scanner sc = new Scanner(System.in);
        boolean istrue = true;
        while (istrue) {
            System.out.println("=====================================================");
            System.out.println("계산기 프로그램 1. 더하기 2. 뺴기 3. 곱하기 4. 나누기 5. 나머지 ");
            System.out.println("=====================================================");
            System.out.print("입력하세요 : ");
            int case1 = sc.nextInt();
            if(case1 == 9){
                istrue = false;
            }
            System.out.print("숫자 1 입력 : ");
            int first = sc.nextInt();
            System.out.print("숫자 2 입력 : ");
            int second = sc.nextInt();

            switch (case1) {
                case 1:
                    app.plus(first, second); break;
                case 2:
                    app.min(first, second); break;
                case 3:
                    app.multi(first, second); break;
                case 4:
                    app.div(first, second); break;
                case 5:
                    app.mod(first, second); break;
                case 9:
                    System.out.println("프로그램 종료");
                default:
                    System.out.println("숫자를 잘못입력하셨습니다.");
            }
        }

    }

public void plus(int first, int second ) {
    System.out.println(first + second);
}

// 뺴기 min
public void minus(int first, int second){
    System.out.println(first - second);
}

   
  
  public int multi(int first, int second) {

       return first * second;

  
  
  
  
  public int div (int first, int second){

        if (second != 0) {

            return first / second;


        } else {
            throw new IllegalArgumentException("0으로 나눌 수 없음");

        }

    }


    // 더하기 plus


    public void plus(int first, int second ) {
        System.out.println(first + second);
    }
    // 뺴기 min
    public void minus(int first, int second){
        System.out.println(first - second);
    }
    // 윤재

    // 곱하기 multi

    // 나누기 div

    // 도아

    // 나머지 mod

    // 정민 try catch 활용

}