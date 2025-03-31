package pairgeneric;

public class Pair<T, U> {
    private T first;
    private U second;

    public T getFirst() {
        return this.first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return this.second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
