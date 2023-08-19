package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hdata = data.substring(0, index);
        for (int i = 0; i < data.length() - index ; i++) {
            hdata += "*";
        }

        return hdata;
    };

    public static void main(String[] args) {
        // 개인정보를 비공개로 전환하는 메소드 작성
        // 하나의 메소드에서 모든 동작 처리
        String name = "최예훈";
        String id = "991213-1231234";
        String phone = "010-1234-5698";

        System.out.println(getHiddenData(name, 1));
        System.out.println(getHiddenData(id, 8));
        System.out.println(getHiddenData(phone, 9));
    }
}
