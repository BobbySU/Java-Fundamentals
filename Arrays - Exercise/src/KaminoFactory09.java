import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int bestLenght = 0;
        String bestDns = "";
        int bestI = 0;
        int bestSum = 0;
        int count = 0;
        int bestCount = 0;
        while (!input.equals("Clone them!")) {
            count++;
            String element = input.replaceAll("!", "");
            String[] dns = element.split("0");
            int maxLenght = 0;
            int sum = 0;
            String bestLokalDns = "";
            for (int i = 0; i < dns.length; i++) {
                if (dns[i].length() > maxLenght) {
                    maxLenght = dns[i].length();
                    bestLokalDns = dns[i];
                }
                sum += dns[i].length();
            }
            int biginI = element.indexOf(bestLokalDns);
            if (maxLenght > bestLenght) {
                bestLenght = maxLenght;
                bestDns = element;
                bestI = biginI;
                bestSum = sum;
                bestCount = count;
            } else if (maxLenght == bestLenght && (biginI < bestI || sum > bestSum)) {
                bestLenght = maxLenght;
                bestDns = element;
                bestI = biginI;
                bestSum = sum;
                bestCount = count;
            }else if (count==1){
                bestLenght = maxLenght;
                bestDns = element;
                bestI = biginI;
                bestSum = sum;
                bestCount = count;
            }
            input = scan.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCount, bestSum);
        for (int i = 0; i < bestDns.length(); i++) {
            System.out.print(bestDns.charAt(i) + " ");
        }
        System.out.println();
    }
}
