import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());

        int sum = 0;
        switch (command) {
            case "+":
                sum = add(a, b);
                break;
            case "*":
                sum = multiply(a, b);
                break;
            case "-":
                sum = subtract(a, b);
                break;
            case "/":
                sum = divide(a, b);
                break;
        }
        System.out.println(sum);
    }

    private static int divide(int a, int b) {
        int sum = a / b;
        return sum;
    }

    private static int subtract(int a, int b) {
        int sum = a - b;
        return sum;
    }

    private static int multiply(int a, int b) {
        int sum = a * b;
        return sum;
    }

    private static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
