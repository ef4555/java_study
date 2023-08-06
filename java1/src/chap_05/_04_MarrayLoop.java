package chap_05;

public class _04_MarrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(seats[i][j]);
//            }
//        };
        String[][] seats2 = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.println(seats2[i][j]);
            }
        };
        // 값 넣기
        String[][] seats3 = new String[5][5];
        String[] eng ={"A", "B", "C", "D", "E"};
        for (int i = 0; i < seats3[i].length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats[i][j] = eng[i] + (j+1);
            }
        }
    }
}
