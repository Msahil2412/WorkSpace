package DS_Algo_JAVA.Qeues;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Que_V1
{
    public static void main(String[] args) {
        
    }
    Queue<Integer> primary=new LinkedList<>();
    Queue<Integer> secondry=new LinkedList<>();
    public void push(int n)   
    {
        primary.add(n);
    } 
    public int pop()
    {
        while(primary.size()!=1)
            secondry.add(primary.remove());
        int x=primary.remove();
        while(!secondry.isEmpty())
            primary.add(secondry.remove());
        return x;
    }
    public int peek()
    {
        while (primary.size()!= 1)
            secondry.add(primary.remove());
        int x = primary.remove();
        while (!secondry.isEmpty())
            primary.add(secondry.remove());
        primary.add(x);
        return x;
    }
}
