import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*        String[][] cinema = {
                {" ", "1", "2", "3", "4", "5", "6", "7", "8"},
                {"1", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"2", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"3", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"4", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"5", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"6", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"7", "S", "S", "S", "S", "S", "S", "S", "S"}
        };


        System.out.println("Cinema:");
        for (int i = 0; i < cinema.length; i++) {
            for(int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatsInEachRow = input.nextInt();

        int summ$ = 0;
        if (rows * seatsInEachRow <= 60) {
            summ$ = rows * seatsInEachRow * 10;
        } else if (rows > 4) {
            summ$ = ((rows / 2) * seatsInEachRow * 10) + (rows - (rows / 2))  * seatsInEachRow * 8;
        }

        System.out.println("Total income:");
        System.out.println("$" + summ$);

    }
}






/*
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                 if (i == 0 && j > 0) {
                     cinema[0][j] =  (j + "");
                 } else if (j == 0 && i > 0) {
                     cinema[i][j] =(i + "");
                 } else if (i > 0 && j > 0) {
                    cinema[i][j] = "S";
                 } else {
                    cinema[i][j] = " ";
                 }
            }
        }*/
