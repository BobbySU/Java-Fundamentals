import java.util.Scanner;

public class PassedOrFailed03 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());
        if (grade>=3){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");

        }
    }
}
