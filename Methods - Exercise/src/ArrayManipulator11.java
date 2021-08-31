import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] one = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] comand = input.split(" ");
            String comandIndex = comand[0];
            switch (comandIndex) {
                case "exchange":
                    int ex = Integer.parseInt(comand[1]);
                    if (exValid(ex, one.length)) {
                        one = exchange(one, ex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    max(one, comand[1]);
                    break;
                case "min":
                    min(one, comand[1]);
                    break;
                case "first":
                    first(one, Integer.parseInt(comand[1]), comand[2]);
                    break;
                case "last":
                    last(one, Integer.parseInt(comand[1]), comand[2]);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(Arrays.toString(one));
    }

    private static void last(int[] one, int parseInt, String s) {
        if (parseInt > one.length) {
            System.out.println("Invalid count");
            return;
        }

        int[] resultArr = new int[parseInt];
        int index = 0;

        for (int i = one.length - 1; i >= 0; i--) {
            if (("even".equals(s) && one[i] % 2 == 0)
                    || ("odd".equals(s) && one[i] % 2 != 0)) {
                resultArr[index++] = one[i];
                if (index >= parseInt) break;
            }
        }

        resultArr = reverseCopyOfArray(resultArr, index);

        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] reverseCopyOfArray(int[] resultArr, int index) {
        int[] copy = new int[index];

        for (int i = 0; i < index; i++) {
            copy[index - i - 1] = resultArr[i];
        }
        return copy;
    }

    private static void first(int[] one, int parseInt, String s) {
        if (parseInt > one.length) {
            System.out.println("Invalid count");
            return;
        }

        int[] resultArr = new int[parseInt];
        int index = 0;

        for (int i = 0; i < one.length; i++) {
            if (("even".equals(s) && one[i] % 2 == 0)
                    || ("odd".equals(s) && one[i] % 2 != 0)) {
                resultArr[index++] = one[i];
                if (index >= parseInt) break;
            }
        }
        resultArr = copyOfArray(resultArr, index);

        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] copyOfArray(int[] resultArr, int index) {
        int[] copy = new int[index];
        for (int i = 0; i < index; i++) {
            copy[i] = resultArr[i];
        }
        return copy;
    }

    private static void min(int[] one, String s) {
        int minElementIndex = -1;
        int minElementValue = Integer.MAX_VALUE;

        for (int i = 0; i < one.length; i++) {
            if ((("even".equals(s) && one[i] % 2 == 0) || ("odd".equals(s) && one[i] % 2 != 0))
                    && one[i] <= minElementValue) {
                minElementIndex = i;
                minElementValue = one[i];
            }
        }

        if (minElementIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minElementIndex);
        }
    }

    private static void max(int[] one, String s) {
        int maxElementIndex = -1;
        int maxElementValue = Integer.MIN_VALUE;

        for (int i = 0; i < one.length; i++) {

            if ((("even".equals(s) && one[i] % 2 == 0) || ("odd".equals(s) && one[i] % 2 != 0))
                    && one[i] >= maxElementValue) {
                maxElementIndex = i;
                maxElementValue = one[i];
            }
        }

        if (maxElementIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxElementIndex);
        }
    }


    private static int[] exchange(int[] one, int ex) {
        int[] num1 = new int[ex + 1];
        int[] num2 = new int[one.length - ex - 1];
        for (int i = 0; i <= ex; i++) {
            int curunt = one[i];
            num1[i] = curunt;
        }
        for (int i = ex + 1; i <= one.length - 1; i++) {
            int curunt = one[i];
            num2[i - ex - 1] = curunt;
        }

        int[] newArray = new int[one.length];
        for (int i = 0; i <= num2.length - 1; i++) {
            newArray[i] = num2[i];
        }
        for (int i = num2.length; i <= newArray.length - 1; i++) {
            newArray[i] = num1[i - num2.length];
        }
        return newArray;
    }

    private static boolean exValid(int ex, int lenght) {
        return ex >= 0 && ex <= lenght - 1;
    }
}
