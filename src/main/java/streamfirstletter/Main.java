package streamfirstletter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      List<String> newStringsss = Arrays.asList("Anna", "Chad", "Brus", "Alice", "Cintia", "Bobby", "Kamila");

      Map<Character, List<String>> theStrings = newStringsss.stream()
              .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(theStrings);

    }
}
