package DS_Algo_JAVA.Qeues;

import java.util.Stack;

public class Que_Using_Stack_V2 {
    public Stack<Integer> primary = new Stack<>();
    public Stack<Integer> secondry = new Stack<>();

    public void enque(int n) 
    {
        while (primary.size() != 0)
            secondry.push(primary.pop());
        primary.push(n);
        while (!secondry.isEmpty())
            primary.push(secondry.pop());
    }
    public int deque()
    {   
        return primary.pop();
    }

    public int front()
    {
        int x = primary.pop();
        primary.push(x);
        return x;
    }
    // public void display()
    // {
    // Stack<Integer> help=new Stack<>();
    // revr(primary,help,0);
    // }
}