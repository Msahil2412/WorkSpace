package DS_Algo_JAVA.Qeues;

import java.util.LinkedList;
import java.util.Queue;

public class First_Negative 
{
    public static void main(String[] args) 
    {
        int[] arr={12,1,7,8,-15,30,9,28};
        getNegative(arr, 4);
    }
    public static void getNegative(int[] arr, int k)
    {
        int i=0;
        Queue<Integer> que=new LinkedList<>();
        for(i=0;i<k;i++)
        {
            if(arr[i]<0)
                que.add(i);
        }
        for(;i<arr.length;i++)
        {
            if(!que.isEmpty())
                System.out.println(arr[que.peek()]);
            else
                System.out.println("0");
            while(!que.isEmpty() && que.peek()<=(i-k))
            {
                que.remove();
            }
            if(arr[i]<0)
                que.add(i);
        }
        if(!que.isEmpty())
            System.out.println(arr[que.peek()]);
        else
            System.out.println("0");
    }    
}
