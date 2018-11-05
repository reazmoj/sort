import java.lang.reflect.Array;
import java.util.Scanner;

public class TableSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter table row:");
        int row = scanner.nextInt();
        System.out.println("please enter table col:");
        scanner = new Scanner(System.in);
        int col = scanner.nextInt();
        int[][] Table = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Table[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Table[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Please enter R or C for sort:");
        scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        if (a.equals("R")) {
            System.out.println("enter number of row");
            scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for (int i = 0 ; i < col ; i++){
                int k = i;
                for (int j = i + 1 ; j < col ; j++){

                    if (Table[n][j] < Table[n][k])

                        k = j;
                }
                if (k != i){
                     int temp = Table[n][i];
                     Table[n][i] = Table[n][k];
                     Table[n][k] = temp;
                }
            }
/*            for (int j = 0; j < col-1; j++) {
                if (Table[n][j] > Table[n][j + 1]) {
                    int t = Table[n][j];
                    Table[n][j] = Table[n][j + 1];
                    Table[n][j + 1] = t;
                }
            }*/
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++)
                    System.out.print(Table[i][j] + " ");
                System.out.println();
            }
        } else {
            System.out.println("enter number of col");
            scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            for (int j = 0 ; j < row ; j++){
                int k = j;
                for (int i = j + 1 ; i < row ; i++){

                    if (Table[i][m] < Table[k][m])

                        k = i;
                }
                if (k != j){
                    int temp = Table[j][m];
                    Table[j][m] = Table[k][m];
                    Table[k][m] = temp;
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++)
                    System.out.print(Table[i][j] + " ");
                System.out.println();
            }
        }
    }
}