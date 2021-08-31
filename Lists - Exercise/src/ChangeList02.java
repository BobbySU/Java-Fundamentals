import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] comand = input.split(" ");
            String comandIndex = comand[0];
            switch (comandIndex) {
                case "Delete":
                    int d = Integer.parseInt(comand[1]);
                    num.removeAll(Arrays.asList(d));
                    break;
                case "Insert":
                    int i = Integer.parseInt(comand[1]);
                    int p = Integer.parseInt(comand[2]);
                    num.add(p, i);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(num.toString().replaceAll("[\\[\\],]", ""));
    }
}
