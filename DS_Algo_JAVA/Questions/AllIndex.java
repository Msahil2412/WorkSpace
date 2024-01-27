package DS_Algo_JAVA.Questions;

import java.util.Scanner;
import java.util.Arrays;

public class AllIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=s.nextInt();
		int M=s.nextInt();
        int a[]=new int[N];
        a=allIndices(arr,a, 0, 0, M);
        System.out.print(a[0]+" ");
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=0)
                System.out.print(a[i]+" ");
        }
    }
    public static int[] allIndices(int arr[], int res[], int i, int j, int M)
	{
		if(i==arr.length)
			return res;

		if(arr[i]==M)
		{
			res[j]=i;
			j++;
		}
		i++;

		int a[]=allIndices(arr,res,i,j,M);
		return a;
	}
    
}
