package chap_04;

public class _07_Dowhile {
    public static void main(String[] args) {
        // DoWhile
        // 수영하는 경우
        int distance = 25;
        int move = 0; // 현재 이동 거리
        int height = 2; // 키 2m
        while (move + height < distance) {
            System.out.println("발차기를 합니다");
            System.out.println("현재 이동 거리 " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        
        System.out.println("---------------------");
        System.out.println("키가 큰 경우");
        // 키가 엄청나게 큰 사람이 수영
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 합니다");
            System.out.println("현재 이동 거리 " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        
        // Do While 반복문
        System.out.println("---------------------");

        move = 0;
        height = 25;
        do {
            System.out.println("발차기를 합니다");
            System.out.println("현재 이동 거리 " + move);
            move += 3;
        } while (move + height < distance);
            System.out.println("도착했습니다");
    }
}
