package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = 조건 ? 참일때 결과값 : 거짓일때 결과값

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y; // x > y 가 조건, 조건에 따라 참일 때 결과, 거짓일 때 결과
        System.out.println(max);


        int min = (x < y) ? x : y; // x가 y보다 작은게 참이면 x 값이 min에 저장됨
        System.out.println(min);

        boolean b = (x == y) ? true : false; // 같으면 참 출력
        System.out.println(b);

        String s = (x != y) ? "다르다" : "같다";
        System.out.println(s);
    }
}
