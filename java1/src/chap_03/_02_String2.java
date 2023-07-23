package chap_03;

public class _02_String2 {
    public static void main(String[] args) {

        String s = "I Like Java and Python and C.";
        // 문자열 변환
        System.out.println(s.replace(" and", ","));

        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작

        System.out.println(s.substring(s.indexOf("Java"))); // 시작인덱스부터 끝까지
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작위치부터 끝위치 직전까지

        // 공백 제거
        s = "                          I Love Java";

        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); // concat : 문자열 결합을 위해 사용됨

    }
}
