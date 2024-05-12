import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] cinema = new char[8][9];
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (i == 0 && j > 0) {
                    cinema[0][j] = (char) (j + '0');
                } else if (j == 0 && i > 0) {
                    cinema[i][j] = (char) ((i) + '0');
                } else if (i > 0 && j > 0) {
                    cinema[i][j] = 'S';
                } else {
                    cinema[i][j] = ' ';
                }
            }
        }

        System.out.println("Cinema:");
        for (int i = 0; i < cinema.length; i++) {
            for(int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }
}