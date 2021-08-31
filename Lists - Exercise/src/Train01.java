import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagon = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int place = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] comand = input.split(" ");
            String comandIndex = comand[0];
            if (comandIndex.equals("Add")) {
                int a = Integer.parseInt(comand[1]);
                wagon.add(a);
            } else {
                int n = Integer.parseInt(comand[0]);
                for (int i = 0; i < wagon.size(); i++) {
                    int sum = 0;
                    if (wagon.get(i) + n <= place) {
                        sum = wagon.get(i) + n;
                        wagon.set(i, sum);
                        break;
                    }
                }
            }
            input = scan.nextLine();
        }
        System.out.println(wagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
