package DS_Algo_JAVA.Oops_Stack_Que_Generic;

public class StackInArrays implements interFace
{
    protected int[] data;
    protected int top;
    public static final int defaultCapacity=10;
    public StackInArrays() throws Exception
    {
        this(defaultCapacity);
    }
    public StackInArrays(int cap)throws Exception
    {
        if(cap<1)
            throw new Exception("Invalid Capacity");
        this.data=new int[cap];
        this.top=-1;
    }
    public int size()
    {
        return this.top+1;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    @Override
    public void push(int val)throws Exception
    {
        if(this.size()==this.data.length)
            throw new Exception("Stack Full!...");
        this.top+=1;
        this.data[this.top]=val;
    }
    public void display()throws Exception
    {
        if(this.size()==0)
            throw new Exception("Stack Empty!...");
        for(int i=this.top;i>=0;i--)
            System.out.print(this.data[i]+" ");
        System.out.print("end!...");
    }
    @Override
    public int pop()throws Exception
    {   
        if(this.size()==0)
            throw new Exception("Stack Empty!...");
        int sr=this.data[this.top];
        this.data[this.top]=0;
        this.top-=1;
        return sr;
    }
    public int top()throws Exception
    {
        if(this.size()==0)
            throw new Exception("Stack Empty!...");
        return this.data[this.top];
    }
}
