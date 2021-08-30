import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String user = scan.nextLine();

        String pass = "";
        for (int i = user.length() - 1; i >= 0; i--) {
            char x = user.charAt(i);
            pass += x;
        }
        int caunt=0;
        String userpass = scan.nextLine();
        while (!userpass.equals(pass)){
            caunt++;
            if (caunt>=4){
                System.out.printf("User %s blocked!",user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            userpass=scan.nextLine();
        }
        if (userpass.equals(pass)){
            System.out.printf("User %s logged in.",user);
        }
    }
}
