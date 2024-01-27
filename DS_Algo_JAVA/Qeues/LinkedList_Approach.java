package DS_Algo_JAVA.Qeues;

import java.util.LinkedList;

public class LinkedList_Approach 
{
    LinkedList<Integer> que;
    LinkedList_Approach()
    {
        que = new LinkedList<>();
    }
    public boolean isEmpty()
    {
        return que.isEmpty();
    }
    public void inqueue(int data)
    {
        que.addLast(data);
    }
    public int deque()
    {
        int t=que.getFirst();
        que.removeFirst();
        return t;
    }
    public int getFront()
    {
        return que.getFirst();
    }
}
