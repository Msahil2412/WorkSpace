package DS_Algo_JAVA.Oops_Stack_Que_Generic;

public class DynamicQeue extends QeueInArrays
{
    public DynamicQeue()throws Exception
    {
        this(defaultCapacity);
    }
    public DynamicQeue(int cap)throws Exception
    {
        super(cap);
    }
    @Override
    public void push(int val)throws Exception
    {
        if(this.size()==this.qdata.length)
        {
            int arr[]=new int[2*this.qdata.length];
            for(int i=0;i<this.qdata.length;i++)
                arr[i]=this.qdata[i];
            this.qdata=arr;
        }
        super.push(val);
    }    
}
