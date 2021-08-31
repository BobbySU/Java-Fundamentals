import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
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
                case "Add":
                    int a = Integer.parseInt(comand[1]);
                    num.add(a);
                    break;
                case "Remove":
                    int r = Integer.parseInt(comand[1]);
                    num.remove(Integer.valueOf(r));
                    break;
                case "RemoveAt":
                    int rA = Integer.parseInt(comand[1]);
                    num.remove(rA);
                    break;
                case "Insert":
                    int n = Integer.parseInt(comand[1]);
                    int i = Integer.parseInt(comand[2]);
                    num.add(i, n);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(num.toString().replaceAll("[\\[\\],]", ""));
    }

}
