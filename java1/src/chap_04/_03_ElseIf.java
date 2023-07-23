package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 Else If
        // 한라봉 에이드가 있으면 주문
        // 망고주스가 있으면 주문
        // 또는 아아 주문
        
        boolean hanlla = false;
        boolean mango = true;
        
        // else는 없어도 가능하다
        if (hanlla) {
            System.out.println("한라봉에이드 주문");
        } else if (mango) {
            System.out.println("망고주스 주문");
            
        } else {
            System.out.println("아아 주문");
        }
    }
}
