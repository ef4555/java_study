package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자  = 이스케이프 문자
        // \n, \t 등등

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        
        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");
        
        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        
        // \t는 탭을 맞춰줌
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // System.out.println("c:\Program Files\Java"); // 역슬래쉬는 윈도우에서 원래 파일 위치를 나타내므로 오류 나타남
        System.out.println("c:\\Program Files\\Java"); // 역슬래쉬쓰고 싶으면 두 번 쳐줌
        
        // 작은따옴표 큰따옴표 사용
        System.out.println("단비가 \'냐옹\' 이라고 했어요"); // 작은따옴표는 역슬래쉬 없어도 된다.
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
