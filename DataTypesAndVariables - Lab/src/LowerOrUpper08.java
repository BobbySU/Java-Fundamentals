import java.util.Scanner;

public class LowerOrUpper08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char a = scan.nextLine().charAt(0);
        int n=(int)a;
        if (n<96){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
