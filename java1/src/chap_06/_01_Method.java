package chap_06;

public class _01_Method {
    // 메소드 정의
    // 한번 메소드 정의 후 원하는만큼 호출 가능
    public static void sayHello() {
        System.out.println("안녕하세요");
    }
    
    
    
    public static void main(String[] args) {
        // 메소드
        // 어떤 기능을 하는 코드를 묶은 것
        // 파이썬의 Function과 비슷
        
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
