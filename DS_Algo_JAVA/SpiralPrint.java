package DS_Algo_JAVA;

public class SpiralPrint
{
    public static void main(String[] args) 
    {
        int j=0;
        int arr[][]={{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        int lt=0,rt=arr.length-1,tp=0,bt=arr.length-1,count=(rt+1)*(bt+1),dir=1;
        while(lt<=rt && tp<=bt)
        {
            if(count>0)
            {
                if(dir==1)
                {
                    for(int i=lt;i<=rt;i++)
                    {
                        System.out.print(arr[tp][i]+" , ");
                        count--;
                    }
                    tp++;
                    dir=2;
                }
            }
           
            if(count>0)
            {
                if(dir==2)
                {
                    for(int i=tp;i<=bt;i++)
                    {
                        System.out.print(arr[i][rt]+" , ");
                        count--;
                    }
                    rt--;
                    dir=3;
                }
            }
            
            if(count>0)
            {
                if(dir==3)
                {
                    for(int i=rt;i>=lt;i--)
                    {
                        System.out.print(arr[bt][i]+" , ");
                        count--;
                    }
                    bt--;
                    dir=4;
                }
            }
            
            if(count>0)
            {
                if(dir==4)
                {
                    for(int i=bt;i>=tp;i--)
                    {
                        System.out.print(arr[i][lt]+" , ");
                        count--;
                    }
                    lt++;
                    dir=1;
                }
            }
        }
    }   
 }    