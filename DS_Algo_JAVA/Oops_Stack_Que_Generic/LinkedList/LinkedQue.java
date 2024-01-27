package DS_Algo_JAVA.Oops_Stack_Que_Generic.LinkedList;

public class LinkedQue 
{
    private Linklist que;
    public LinkedQue()
    {
        que=new Linklist();
    }    
    public int size()throws Exception
    {
        return this.que.len();
    }
    public void enque(int n)
    {
        this.que.addLast(n);
    }
    public int deque()throws Exception
    {
        return this.que.removeFirst();
    }
    public void display()throws Exception
    {
        this.que.display();
    }
}
