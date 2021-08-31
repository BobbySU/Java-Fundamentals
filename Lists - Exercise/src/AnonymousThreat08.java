import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String namesInput = scan.nextLine();
        List<String> names = Arrays.stream(namesInput.split("\\s+"))
                .collect(Collectors.toList());

        String command = scan.nextLine();
        while (!command.equals("3:1")) {
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];
            if (commandName.equals("merge")) {
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > names.size() - 1) {
                    endIndex = names.size() - 1;
                }
                boolean isStartIndexValid = indexV(startIndex, names.size());
                boolean isEndIndexValid = indexV(endIndex, names.size());

                if (isStartIndexValid && isEndIndexValid) {
                    StringBuilder resultMerge = new StringBuilder();
                    for (int index = startIndex; index <= endIndex; index++) {
                        resultMerge.append(names.get(index));
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        names.remove(startIndex);
                    }
                    names.add(startIndex, resultMerge.toString());
                }
            } else if (commandName.equals("divide")) {
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);
                String elementForDivide = names.get(index);
                names.remove(index);
                int partSize = elementForDivide.length() / partitions;
                int begin = 0;

                for (int part = 1; part < partitions; part++) {
                    names.add(index, elementForDivide.substring(begin, begin + partSize));
                    index++;
                    begin += partSize;
                }
                names.add(index, elementForDivide.substring(begin));
            }
            command = scan.nextLine();
        }
        System.out.println(String.join(" ", names));
    }

    public static boolean indexV(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}
