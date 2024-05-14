import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int cinmRows = input.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int cinmNumSeat = input.nextInt();

        String[][] cinema = new String[cinmRows + 1][cinmNumSeat + 1];

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
        }


        boolean exit = false;
        int currentIncome = 0;
        int counTicket = 0;
        int totalIncome = 0;
        while (!exit) {
            System.out.println("\n1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit\n");
            int menu = input.nextInt();
            switch (menu) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    Cinema.cinemaPrint(cinema);
                    break;
                case 2:
                    System.out.println("Enter a row number:");
                    int rows = input.nextInt();

                    System.out.println("Enter a seat number in that row:");
                    int seatsInEachRow = input.nextInt();


                    int price = 0;
                    if (cinmRows * cinmNumSeat <= 60) {
                        price = 10;
                    } else if ((cinmRows / 2) >= rows) {
                        price = 10;
                    } else {
                        price = 8;
                    }
                    currentIncome += price;
                    System.out.println("Ticket price: $" + price);
                    cinema[rows][seatsInEachRow] = "B";
                    //Cinema.cinemaPrint(cinema);
                    break;
                case 3:
                    Cinema.cinStat(cinema, totalIncome, counTicket, currentIncome);

            }

        }

    }

    public static void cinemaPrint(String[][] cinema) {
        System.out.println("Cinema:");
        for (int i = 0; i < cinema.length; i++) {
            for(int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void cinStat (String[][] cinema, int counTicket, int totalIncome, int currentIncome) {
        counTicket = 0;
        totalIncome = 0;
        int tict = 0;
        for (int i = 1; i < cinema.length; i++) {
            for(int j = 1; j < cinema[i].length; j++) {
                tict++;
                counTicket = "B".equals(cinema[i][j]) ? ++counTicket : counTicket;
                if (cinema.length * cinema[cinema.length - 1].length <= 60) {
                    totalIncome += 10;
                } else if (((cinema.length) / 2) >= i) {
                    totalIncome += 10;
                } else {
                    totalIncome += 8;
                }
            }

        }
        System.out.println("Number of purchased tickets: " + counTicket);
        System.out.println(String.format("Percentage: %.2f", ((double) 100 / tict * counTicket)) + "%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
    }
}




