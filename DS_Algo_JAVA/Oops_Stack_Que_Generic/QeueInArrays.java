package DS_Algo_JAVA.Oops_Stack_Que_Generic;

public class QeueInArrays
{
    int ft;
    int qdata[];
    public static final int defaultCapacity=10;
    public QeueInArrays()throws Exception
    {
        this(defaultCapacity);
    }
    public QeueInArrays(int cap)throws Exception
    {
        if(cap<1)
            throw new Exception("Invalid Capacity");
        this.qdata=new int[cap];
        ft=-1;
    }
    public int size()
    {
        return this.ft+1;
    }
    public boolean isEmpty()
    {
        return (this.size()<=0);
    }
    public void push(int val)throws Exception
    {
        if(this.size()==this.qdata.length)
            throw new Exception("Qeue Is Full!...");
        this.ft+=1;
        this.qdata[this.ft]=val;
    } 
    public int get()throws Exception
    {
        if(this.size()==0)
            throw new Exception("QeueIs Empty!...");
        int rn=this.qdata[0];
        int arr[]=new int[this.qdata.length-1];
        int t=1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=this.qdata[t];
            t++;
        }
        if(this.qdata.length==1)
        {
            this.ft=-1;
            this.qdata=new int[10];
        }
        this.qdata=arr;
        return rn;
    }
    public void display()throws Exception
    {
        if(this.isEmpty())
            throw new Exception("Array Is Empty");
        for (int i=0;i<this.qdata.length;i++)
            System.out.print(this.qdata[i]+" ");
        System.out.println();
    }
}
