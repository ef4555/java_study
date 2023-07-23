package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육 = false;
        
        System.out.println(김치찌개 || 계란말이 || 제육); // 셋 중 하나라도 true이면 참

        System.out.println((5 > 3) && (3 > 1)); // 두 결과가 같아야 true (true)

        // 논리부정연산자
        System.out.println(!true); // false가 나온다.


    }
}
