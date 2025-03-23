package splittext;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String texttt = "Hello world how are you doing world Hello";
        String[] words = texttt.split(" ");
        HashSet<String> newText = new HashSet<>();

        for(String word : words) {
            newText.add(word);
        }

        System.out.println(newText);

        System.out.println(newText.size());


    }
}
