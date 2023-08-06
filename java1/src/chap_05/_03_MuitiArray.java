package chap_05;

public class _03_MuitiArray {
    public static void main(String[] args) {
        // 2차원 배열
        // 영화관 좌석
        // 3x5
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2에 접근하려면
        System.out.println(seats[1][1]);

        // 첫 줄에는 3칸, 둘째줄에는 4칸 셋째줄에는 5칸
        String[][] seats2 = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3에 접근하려면
        System.out.println(seats2[0][2]);

        // A5에 접근하려고 한다면?
        System.out.println(seats2[0][4]); // 범위 초과
    };
}
