package chap_01;

import java.awt.*;
import java.sql.Struct;

public class _05_variable_name {
    // 변수 이름 짓는 법
    // 1. 저장할 값에 어울리는 이름
    // 2. 밑줄, 문자, 숫자 사용 가능(공백은 불가)
    // 3. 밑줄 또는 문자로 시작 가능
    // 4. 변수는 한 단어 또는 2개 이상 단어의 연속
    // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자( 첫 단어는 제외)
    // 6. 예약어 사용 불가(public, static, void, double, float..)

    // 입국 신고서
    String nationality = "대한민국";
    String firstName = "예훈";
    String lastName = "최";
    String dateOfBirth = "2001-12-31";
    String purposeOfVisit = "관광";

    String flightNo = "KEs22";
    String _fightNo = "Kes22";
    int accompany = 2;
    int lengthOfStay = 5;


    String item1 = "watch";
    String item2 = "가방";

    // 절대 변하지 않는 상수는 대문자로
    final String CODE = "aaa";

}
