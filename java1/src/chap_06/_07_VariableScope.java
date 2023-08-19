package chap_06;

public class _07_VariableScope {
    public static void  methodA() {
        // main영역의 변수는 main 영역에서만 사용 가능
        // System.out.println(number); 불가능
    }
    public static void  methodB() {
        // method의 변수는 method 영역에서만 사용 가능
        int number = 4; // 지역 변수
    }


    public static void main(String[] args) {
        int number = 3;  // 전달값으로 전달하거나 해서 사용 가능하다.

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i); // i는 for문 밖에서 사용 불가능

        {   // 지역 변수
            int j = 0;
            System.out.println(j);

            // 밖에 있는 것을 갖다 쓰는 것은 가능
            System.out.println(number); 
        }
        // System.out.println(j); // 중괄호 안 변수는 중괄호 안에서만 사용 가능
    }
}
