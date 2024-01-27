package DS_Algo_JAVA.Qeues;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Que_V2 {
    public static void main(String[] args) {

    }

    Queue<Integer> primary = new LinkedList<>();
    Queue<Integer> secondry = new LinkedList<>();

    public void push(int n) {
        while (!primary.isEmpty())
            secondry.add(primary.remove());
        primary.add(n);
        while (!secondry.isEmpty())
            primary.add(secondry.remove());
    }

    public int pop() {
        return primary.remove();
    }

    public int top() {
        //int x = primary.remove();
        return primary.peek();
    }
}
