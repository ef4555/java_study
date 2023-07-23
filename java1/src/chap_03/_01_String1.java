package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
        // 포함 관계
        System.out.println(s.contains("C#"));

        // 포함 위치
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#")); // 포함되지 않으면 -1 첫번째로 위치하는 위치정보
        System.out.println(s.lastIndexOf("and")); // 마지막으로 위치하는 위치정보

        System.out.println((s.startsWith(("L like")))); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true.
        

    }
}
