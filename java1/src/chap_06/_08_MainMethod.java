package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // main은 자바 프로그램이 시작될 때 가장 먼저 작동하는 메서드
        // main은 문자열(String[])을 전달받고 return이 void인 메서드이다.
        // String[] 다루는 방법
        // run에 가서 edit configuration에서 현재 메서드를 찾아서 지정 가능하다.

        // 띄어쓰기 기준으로 나눠서 저장됨
        for (String s : args) {
            System.out.println(s);
        }

        // 도서 조회, 대출, 반납을 나눠야 할 경우(예)
        // 전달값에 따라서 실행을 다르게 할 수 있다.
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서 조회 메뉴입니다");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다");
                    break;
                case "3":
                    System.out.println("반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력함");
                }
            } else { // 실수로 여러 값을 입력했을 때
                System.out.println("1~3중에 하나를 입력하세요 : ");
            }
        }
}
