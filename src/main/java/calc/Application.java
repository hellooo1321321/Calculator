package calc;

public class Application {

    public static void main(String[] args) {


    }



    // 나머지 mod
    public void mod(int first, int second) {

//        return first % second;
        try {
            System.out.println(first + "%" + second + "=" + first % second);
        } catch (NullPointerException error) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

    }


    // 정민 try catch 활용
}
