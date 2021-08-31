import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] comand = scan.nextLine().split(" ");
        int bomb = Integer.parseInt(comand[0]);
        int power = Integer.parseInt(comand[1]);

        int start = 0;
        int finish = 0;
        int sum = 0;
        Boolean sumCheck = true;
        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i).equals(bomb)) {
                start = i - power;
                if (start < 0) {
                    start = 0;
                }
                finish = i + power;
                if (finish > num.size() - 1) {
                    finish = num.size() - 1;
                }
                if (start == 0 && finish == (num.size() - 1)) {
                    sumCheck = false;
                }
                for (int j = start; j <= finish; j++) {
                    num.remove(start);
                }
                i = 0;
            }
        }
        if (sumCheck) {
            for (int i = 0; i < num.size(); i++) {
                int n = num.get(i);
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
