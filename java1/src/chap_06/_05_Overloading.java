package chap_06;

public class _05_Overloading {
    // 메소드 오버로딩
    // 이름이 같은 메소드를 여러 개 만드는 것
    // 전달되는 자료형이 다르지만 같은 이름의 메소드 만들 수 있다.
    // 전달값의 타입, 갯수 다르게 만들 수 있다.
    public static int getPower(int number) { // parameter
        int result = number * number;
        return result;
        // return number * number;
    }
    // 반환값의 형식은 오버로딩 안된다.
//    public static double getPower(int number) { // parameter
//        return result;
//        // return number * number;
//    }
    public static int getPower(String strNumber) {
        int Number = Integer.parseInt(strNumber);
        return Number * Number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메서드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 전달값의 타입이 다르거나 전달값의 개수가 다를때
        // return값이 다르게는 정의 못한다.
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(4, 5));

    }
}
