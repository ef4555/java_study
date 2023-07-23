package chap_04;

public class _5_For {
    public static void main(String[] args) {
        // for
        // 나코 매장
        System.out.println("어서오세요 나코 매장입니다");
        // 또 다른 손님이 들어오면 인사 또 해야함
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");

        // 기본 꼴 fori만 적고 엔터(인텔리제이)
        // 0, 2, 4, 6, 8
        for (int i = 0; i < 10 ; i+=2 ) {
            System.out.println(i); // println은 출력하고 줄바꿈, print는 줄 안바꿈
        }

        // 홀수만 출력
        for (int i = 1; i < 10 ; i = i + 2) {
            System.out.print(i);
        }

        // 거꾸로 숫자 출력
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }

        // 1부터 10까지 합
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
