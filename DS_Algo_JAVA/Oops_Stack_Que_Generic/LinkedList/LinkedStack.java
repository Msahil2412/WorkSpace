package DS_Algo_JAVA.Oops_Stack_Que_Generic.LinkedList;

public class LinkedStack 
{
    private Linklist stack;
    public LinkedStack()
    {
        stack=new Linklist();
    }
    public void push(int n)
    {
        this.stack.addLast(n);
    }
    public int pop()throws Exception
    {
        return this.stack.removeLast();
    }
    public int size()throws Exception
    {
        return this.stack.len();
    }
    public void display()throws Exception
    {
        this.stack.display();
    }
    public int top()throws Exception
    {
        return this.stack.getLast();
    }
    public boolean isEmpty()throws Exception
    {
        return (this.stack.len()==0);
    }
}