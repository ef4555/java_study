package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String[] coffees = new String[4]; // 크기 4의 배열 선언
        // 두 번째 방법
        // String coffees[] = new String[4];


//        coffees[0] = "아메리카노";
//        coffees[1] = "카푸치노";
//        coffees[2] = "라떼";

        // 세 번째 방법
        String[] coffees1 = new String[]{"아메리카노", "카페모카", "라떼", "에스프레소"};

        // 네 번째 방법
        String[] coffees2 = {"아메리카노", "카페모카", "라떼", "에스프레소"};
    }
}
