package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // 정수에서 실수형으로
        // 실수에서 정수형으로

        // int score = 93 + 1,11; 형이 달라서 안됨

        // int를 float, double로
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        // float, double을 int로
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        // 정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score);

        score_d = (double) 93 + 98.8;
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환된다 )
        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int(수동으로 형변환 해주어야 한다.)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        // 같은 역할 s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.9);
        // 같은 역할 s2 = Double.toString(98.9);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // 괄호 속 자료형이 올바르지 않을 때는 에러 발생
        int error = Integer.parseInt("자바");
    }
}
