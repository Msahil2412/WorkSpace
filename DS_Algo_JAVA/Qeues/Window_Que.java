package DS_Algo_JAVA.Qeues;

import java.util.Deque;
import java.util.LinkedList;

public class Window_Que 
{
    public static void main(String[] args)
    {
        int[] arr={1,6,9,4,6,2,7,88};
        window(3, arr);    
    }
    public static void window(int n, int arr[]) 
        {
            Deque<Integer> dq=new LinkedList<>();
            int i;
            for(i=0;i<n;i++)
            {
                while(!dq.isEmpty() && arr[i]>arr[dq.getLast()])
                    dq.removeLast();
                dq.addLast(i);
            }
            for(;i<arr.length;i++)
            {
                   while (!dq.isEmpty() && arr[i] > arr[dq.getLast()])
                    dq.removeLast();
            }
            while (!dq.isEmpty()) {
                System.err.println(arr[dq.getFirst()]);
            }
        }    
}
