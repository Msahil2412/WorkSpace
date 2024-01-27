package DS_Algo_JAVA.Oops_Stack_Que_Generic;

public class DynamicStack extends StackInArrays
{
    public DynamicStack()throws Exception
    {
        this(defaultCapacity);
    }
    public DynamicStack(int cap)throws Exception
    {
        super(cap);
    }
    @Override
    public void push(int val)throws Exception
    {
        if(this.size()==this.data.length)
        {
            int []arr=new int[2*this.data.length];
            for( int i=0;i<this.size();i++)
                arr[i]=this.data[i];
            this.data=arr;
        }
        super.push(val);
    }
}