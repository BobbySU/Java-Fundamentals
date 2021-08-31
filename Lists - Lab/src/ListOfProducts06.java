import java.util.*;

public class ListOfProducts06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> product = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            product.add(scan.nextLine());
        }
        Collections.sort(product);
        for (int i = 0; i < product.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, product.get(i));
        }
    }
}
