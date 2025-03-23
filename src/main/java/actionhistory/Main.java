package actionhistory;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> actions = new ArrayDeque<>();
        actions.push("Start");
        actions.push("Pause");
        actions.push("Play");
        actions.push("Stop");
        System.out.println(actions);

        ArrayDeque<String> actionsTwo = new ArrayDeque<>();

        String removeAction = actions.poll();
        actionsTwo.push(removeAction);
        System.out.println(actionsTwo);

        actions.push(removeAction);
        System.out.println(actions);

    }
}
