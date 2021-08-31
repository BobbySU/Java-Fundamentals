import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        while (list.size() > 0) {
            int index = Integer.parseInt(scan.nextLine());

            int removed = -1;
            if (index < 0) {
                removed = list.remove(0);
                sum += removed;
                int lastElement = list.get(list.size() - 1);
                list.add(0, lastElement);
            } else if (index >= list.size()) {
                removed = list.remove(list.size() - 1);
                sum += removed;
                int firstElement = list.get(0);
                list.add(firstElement);
            } else {
                removed = list.remove(index);
                sum += removed;
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= removed) {
                    list.set(i, list.get(i) + removed);
                } else {
                    list.set(i, list.get(i) - removed);
                }
            }
        }
        System.out.println(sum);
    }
}
