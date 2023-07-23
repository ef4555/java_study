package chap_03;

public class _Quiz2 {
    public static void main(String[] args) {
        //주민등록번호에서 생년월일과 성별까지만 출력
        // 13자리 숫자이고
        // 데이터는 -를 포함한 14자리 문자열

        // 980614-1234567
        String jumin = "980614-1234567";
        System.out.println(jumin.substring(0, 8));
        System.out.println(jumin.substring(0, jumin.indexOf("-")+2));


    }
}
