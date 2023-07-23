package chap_02;

public class _Quiz {
    public static void main(String[] args) {
        // 놀이기구 키 체크
        // 120 이상만 탑승 가능
        int height1 = 115;
        int height2 = 121;

        String result = (height1 >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가 " + height1 + "cm 이므로" + result);
    }
}
