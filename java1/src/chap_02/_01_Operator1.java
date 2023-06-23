package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(5/2); // 정수만 나옴
        System.out.println(2/4); // 0이 나옴
        System.out.println(4 % 2); // 나머지 나눗셈
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);

        int a = 20;
        int b = 30;
        int c = a-b;
        System.out.println(c);

        // 증감 연산 ++
        int val = 10;
        System.out.println(val); //10
        System.out.println(val++); // 출력하고 더함
        System.out.println(val);
        val = 10;
        System.out.println(++val); // 더하고 출력

    }
}
