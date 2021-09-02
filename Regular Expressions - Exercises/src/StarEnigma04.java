import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[STARstar]");
        Pattern patternDecrypted = Pattern.compile("[^-@!:> ]*@([A-Z][a-z]+)[^-@!:>]*:([\\d]+)[^-@!:>]*!([AD])![^-@!:>]*->([\\d]+)[^-@!:> ]*");

        List<String> attack = new ArrayList<>();
        List<String> destroy = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String encrypt = scan.nextLine();
            StringBuilder decrypt = new StringBuilder();
            Matcher matcher = pattern.matcher(encrypt);
            int count = 0;

            while (matcher.find()) {
                count++;
            }
            for (int j = 0; j < encrypt.length(); j++) {
                int e = encrypt.charAt(j) - count;
                decrypt.append((char) e);
            }

            Matcher matcherDecrypted = patternDecrypted.matcher(decrypt);
            if (matcherDecrypted.find()) {
                if (matcherDecrypted.group(3).equals("A")) {
                    attack.add(matcherDecrypted.group(1));
                } else {
                    destroy.add(matcherDecrypted.group(1));
                }
            }
        }
        System.out.printf("Attacked planets: %d%n", attack.size());
        attack.stream().sorted().forEach(e -> System.out.println("-> " + e));
        System.out.printf("Destroyed planets: %d%n", destroy.size());
        destroy.stream().sorted().forEach(e -> System.out.println("-> " + e));
    }
}
