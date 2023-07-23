package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true
        System.out.println(s2.equals("python")); // equals는 대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 상관없을 때 사용

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true ( equals는 내용 비교)
        System.out.println(s1 == s2); // true (참조 비교)

        s1 = new String("1234"); // 서로 다른 곳에 데이터가 저장됨
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true 내용은 똑같기 때문
        System.out.println(s1 == s2); // false가 나온다. 
    }
}
