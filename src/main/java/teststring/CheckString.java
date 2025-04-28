package teststring;

public class CheckString {
    public int countWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Sentence cannot be null");
        }

        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
