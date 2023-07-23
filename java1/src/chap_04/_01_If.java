package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문
        int hour = 15;
        if (hour < 14) {
            System.out.println("2시 전입니다");
            System.out.println("ㅇㅇㅇㅇㅇㅇ");
        }
        else {
            System.out.println("두시 이후입니다");
        }

        System.out.println("현재 시간 리포팅");
        
        // 조건문 여러 개
        hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 주문");
        }
        
        // 오후 두시 이후이거나 커피 마신 경우?
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("디카페인으로 주문");
        }
    }
}
