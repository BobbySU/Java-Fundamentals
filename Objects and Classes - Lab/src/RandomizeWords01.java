import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> words = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());
        Random ran = new Random();

        while (words.size() > 0) {
            String word = words.remove(ran.nextInt(words.size()));
            System.out.println(word);
        }
    }
}
