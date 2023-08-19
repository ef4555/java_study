package chap_06;

public class _03_return {
    
    // 호텔 전화번호
    // 지금까지 void라고 했던 것은 반환값이 없어서 그랬던 것
    // 반환값 return이 있는 경우 반환값의 타입을 적어줌
    public static String getPhoneNumber() {
        String phoneNumber = "01-0110-1111";
        return  phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        // 바로 반환값에 전달 가능
        return "역삼역";
    }
    // 호텔 액티비티
    public static String getactivity() {
        return "볼링장";
    }
    public static void main(String[] args) {
        // 반환값
        String contactNum = getPhoneNumber();
        System.out.println("호텔 전화번호는 " + contactNum);
        String address = getAddress();
        System.out.println("호텔 주소는 " + address);
        // 바로 메소드 전달 가능
        System.out.println("호텔 액티비티 " + getactivity());
    }
}
