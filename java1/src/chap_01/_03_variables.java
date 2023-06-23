package chap_01;

public class _03_variables {
    public static void main(String[] args) {

        String name; // 문자열 변수 선언
        name = "나도코딩"; // 변수에 값 지정
        // String name = "나도코딩"
        int hour = 15; // 숫자 넣을때는 따옴표 없음

        System.out.println(name + "님 배송시작~ " + hour + "시에 방문예정입니다.");
        System.out.println(name + "님 배송완료~");

        double score = 90.5; // 실수 가능
        char grade = 'A'; // 문자열 하나만 지정 char, 작은따옴표 사용
        name = "최예훈"; // 변수 값은 자유롭게 업데이트 가능
        System.out.println(name + "님의 평균 점수는 " + score +"입니다.");
        System.out.println(name + "학점은 " + grade + "입니다.");
        boolean pass = true;
        System.out.println("합격 : " + pass);


        double d = 3.14123456789; // 실수 정밀한 값을 담을 수 있음
        float f = 3.14123456789F; // 더블보다 덜 정밀해서 뒤에 F(f) 붙여주어야 함
        System.out.println(d); // 전부 표시됨
        System.out.println(f); // 어느정도 이하 자리는 표시 안됨

        // int i = 1000000000000; 정수 값이 너무 크면 int로 변수 지정 불가 21억 사이만 가능
        long i = 100000000000L; // 값이 너무 큰 경우 long으로 선언하고 뒤에 L 붙여야함
        i = 1_000_000_000_000L; // 언더바로 보기 좋게 표시 가능
        System.out.println(i);

        // int, long, float, double, char, String, boolean_
        // 자료형의 크기에 따라 적절히 선언하여 사용
    }
}
