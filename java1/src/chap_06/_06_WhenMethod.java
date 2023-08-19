package chap_06;

public class _06_WhenMethod {
    public static int getPower(int number) {
        // 메서드 내에서 다른 메서드를 호출 가능하다.
        // 2의 거듭제곱을 하는 메서드 만들 때
        return getPower(number, 2);
    };
    public static int getPower(int number, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= exp;
        }
        return result;
    };
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 반복을 줄일 수 있다
        // 이 짓을 안할 수 있다.
        // 똑같은 동작을 하는데 사용되는 값만 다른 경우
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        System.out.println(getPower(3, 5));
    }
}
