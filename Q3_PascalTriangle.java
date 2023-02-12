import java.util.Scanner;

class Q3_PascalTriangle {

    public static void main(String[] args) {
        int rowNo, c = 1, blk, i, j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        rowNo = in.nextInt();

        for (i = 0; i < rowNo; i++) {
            for (blk = 1; blk <= rowNo - i; blk++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.print("\n");
        }
    }
}