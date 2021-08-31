import java.util.Scanner;

public class PrintingTriangle03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printPiramid(n);
    }

    private static void printPiramid(int n) {
        printTop(n);
        printBottob(n);
    }

    private static void printTop(int n) {
        for (int i = 1; i < n; i++) {
            printLine(i);
        }
    }

    private static void printLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void printBottob(int n) {
        for (int i = n; i >= 1; i--) {
            printLine(i);
        }
    }
}

