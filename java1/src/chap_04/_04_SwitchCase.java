package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등은 전액 장학금
        // 2등은 반액 장학금
        // 3등은 반액 장학금
        // 그 외는 장학금 없음

        int ranking = 2; // 2등
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }

        System.out.println("조회 완료 #1");

        // Switch Case 사용
        //    switch (expression) {
        //        case A : ... 수행할 명령 ...
        //            break;
        //        case B : ... 수행할 명령 ...
        //            break;
        //        case C : ... 수행할 명령 ...
        //            break;
        //        default: ... 수행할 명령 ...
        ranking = 1;
        // Switch Case 사용
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
            }
            System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격을 잭정(1급 : 최하, 4급: 최상)
        int grade = 1; // 기본 등급 정의
        int price = 7000; // 기본 등급에 따른 기본 가격
        
        // break 없이 사용할 경우 케이스별로 계속 값을 더해가면서 내려감
        switch (grade) {
            case 1 :
                price += 1000;
            case 2 :
                price += 1000;
            case 3 :
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격" + price + "원");

        // 범위에 해당하는 값에 조건을 걸 때는 if
        // 어떤 명확한 경우에 해당하는 값에 조건을 걸 때는 case
        int score = 95;
        if (score >= 90) {
            System.out.println("A 등급");
        } else {
            System.out.println("B 등급");
        }
    }
}
