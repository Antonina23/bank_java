package character;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String text = "(){}[]";
        Stack<Character> symbolsss = new Stack<>();

        for (char c : text.toCharArray()) {
            symbolsss.push(c);
        }

        if (symbolsss.pop() == ']' &&
                symbolsss.pop() == '[' &&
                symbolsss.pop() == '}' &&
                symbolsss.pop() == '{' &&
                symbolsss.pop() == ')' &&
                symbolsss.pop() == '('
        ) {
            System.out.println("Correct");
        }
    }
}
