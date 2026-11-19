import java.util.Scanner;
 
public class Matrix {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        while (true) {
 
            int[][] matrix = new int[3][3];  
 
            System.out.println("Enter 9 numbers: ");
 
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    matrix[r][c] = sc.nextInt();
                }
            }
 
            System.out.println("\nDisplay Here are the Numbers and the required outputs:");
            System.out.println("======================================================");
            System.out.printf("%53s%n%n", "Row Sum");
 
            int[] colSum = new int[3];
 
            for (int r = 0; r < 3; r++) {
                int rowSum = 0;
                System.out.printf("%12s", "");
 
                for (int c = 0; c < 3; c++) {
                    System.out.printf("%6d", matrix[r][c]);
                    rowSum += matrix[r][c];
                    colSum[c] += matrix[r][c];
                }
 
                System.out.printf("%20d%n", rowSum);
            }
 
            System.out.println();
            System.out.printf("%-12s", "Column sum:");
            for (int c = 0; c < 3; c++) {
                System.out.printf("%6d", colSum[c]);
            }
            System.out.println("\n======================================================");
 
            int diag1 = 0, diag2 = 0;
            for (int i = 0; i < 3; i++) {
                diag1 += matrix[i][i];
                diag2 += matrix[i][2 - i];
            }
            int  totalelements = 0;
            for (int[] r : matrix) {
                totalelements += matrix.length;
            }
            System.out.println();
            System.out.printf("%-18s%d%n", "Diagonal sum 1:", diag1);
            System.out.printf("%-18s%d%n", "Diagonal Sum 2:", diag2);
            System.out.printf("%-20s%d%n", "Display Total Elements:", totalelements);
            String repeat;
 
do {
 
    System.out.print("\nTry Again [y|n]: ");
    repeat = sc.next();
 
} while (!repeat.equalsIgnoreCase("y") &&
         !repeat.equalsIgnoreCase("n"));
 
 
    if (repeat.equalsIgnoreCase("n")) {
        break;
    }
System.out.println();
        }
        sc.close();
    }
}