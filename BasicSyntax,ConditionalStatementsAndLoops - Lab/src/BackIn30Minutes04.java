import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        m+=30;

        if (m>=60){
            m-=60;
            h+=1;
            if (h>=24){
                h-=24;
                System.out.printf("%d:%02d",h,m);
            }else {
                System.out.printf("%d:%02d",h,m);
            }
        }else {
            System.out.printf("%d:%02d", h, m);
        }
    }
}
