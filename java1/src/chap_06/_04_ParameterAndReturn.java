package chap_06;

public class _04_ParameterAndReturn {
    // 전달값과 반환값이 모두 있는 메소드
    public static int getPower(int number) { // parameter
        int result = number * number;
        return result;
        // return number * number;
    }
    // 전달값 두 개를 받는 메소드
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        int reval = getPower(2);
        int reval2 = getPower(3);
        System.out.println(reval);
        System.out.println(reval2);
        System.out.println(getPowerByExp(3, 4));
    }
}
