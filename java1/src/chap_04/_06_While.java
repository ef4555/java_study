package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // While
        // 명확한 횟수가 없을 때 사용
        int distance = 25;
        int move = 0;
        while (move < distance) {
            // 현재 이동거리가 전체 거리보다 작을 때까지
            System.out.println("걷는다");
            System.out.println("현재 이동 거리 " + move);
            move += 3; // 3만큼 이동
        }
        System.out.println("도착했습니다");
    }
}
