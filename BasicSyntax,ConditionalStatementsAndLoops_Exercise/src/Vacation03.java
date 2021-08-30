import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String people = scan.nextLine();
        String day = scan.nextLine();

        double total =0;

        switch (people){
            case "Students":
                switch (day){
                    case "Friday":
                        total=n*8.45;
                        break;
                    case "Saturday":
                        total=n*9.80;
                        break;
                    case "Sunday":
                        total=n*10.46;
                        break;
                }
                if (n>=30){
                    total=total*0.85;
                    System.out.printf("Total price: %.2f", total);
                }else {
                    System.out.printf("Total price: %.2f", total);
                }
                break;
            case "Business":
                if (n>=100){
                    n=n-10;
                }
                switch (day){
                    case "Friday":
                        total=n*10.90;
                        break;
                    case "Saturday":
                        total=n*15.60;
                        break;
                    case "Sunday":
                        total=n*16;
                        break;
                }
                System.out.printf("Total price: %.2f", total);

                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        total=n*15;
                        break;
                    case "Saturday":
                        total=n*20;
                        break;
                    case "Sunday":
                        total=n*22.50;
                        break;
                }
                if (n>=10&&n<=20){
                    total=total*0.95;
                    System.out.printf("Total price: %.2f", total);
                }else {
                    System.out.printf("Total price: %.2f", total);
                }
                break;
        }
    }
}
