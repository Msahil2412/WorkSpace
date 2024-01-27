package DS_Algo_JAVA.Qeues;

import java.util.Stack;

public class Que_Using_Stack_V1
{
    public Stack<Integer> primary = new Stack<>();
    public Stack<Integer> secondry = new Stack<>();
    public void enque(int n)
    {
        primary.push(n);
    }
    public int deque()
    {
        while(primary.size()!=1)
            secondry.push(primary.pop());
        int x=primary.pop();
        while(!secondry.isEmpty())
            primary.push(secondry.pop());
        return x;
    }
    public int front()
    {
        while(primary.size()!=1)
            secondry.push(primary.pop());
        int x=primary.pop();
        primary.push(x);
        while(!secondry.isEmpty())
            primary.push(secondry.pop());
        return x;
    }
    // public void display()
    // {   
    //     Stack<Integer> help=new Stack<>();
    //     revr(primary,help,0);
    // }
}