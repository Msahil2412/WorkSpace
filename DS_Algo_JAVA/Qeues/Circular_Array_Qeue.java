package DS_Algo_JAVA.Qeues;

public class Circular_Array_Qeue 
{
    private int[] arr;
    private int cs;
    private int ms;
    private int front;
    private int rear;
    public static int default_capacity=10;
    public Circular_Array_Qeue()throws Exception
    {
        this(default_capacity);
    }
    public Circular_Array_Qeue(int cap)throws Exception
    {
        if(cap==0)
            throw new Exception("Size Can't be ZERO...");
        this.arr=new int[cap];
        this.cs=0;
        this.ms=cap;
        this.front=0;
        this.rear=cap-1;
    }
    public boolean isFull()
    {
        return cs==ms;
    }
    public boolean isEmpty()
    {
        return cs==0;
    }
    public void inque(int n)throws Exception
    {
        if(!isFull())
        {
            this.rear = (rear + 1) % this.arr.length;
            this.arr[this.rear]=n;
            this.cs+=1;
        }
        else
            throw new Exception("Qeue Is Full...");
    }
    public int deqeue()throws Exception
    {
        if(isEmpty())
            throw new Exception("Qeue Is Emplty...");
        if (this.front > this.arr.length-1)
            this.front = 0;
        int t=this.arr[this.front];
        this.arr[this.front]=0;
        this.cs-=1;
        this.front+=1;
        return t;
    }
    public void display()throws Exception
    {
        if(isEmpty())
            throw new Exception("Qeue Is Empty...");
        //System.out.println(this.front);
        for(int i=0;i<this.arr.length;i++)
        {
            if(this.arr[i]==0)
                    continue;
                else
                    System.out.println(this.arr[i]);
        }
    }    
}