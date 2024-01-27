package DS_Algo_JAVA.Questions;

import java.util.*;
public class FindLast {
    public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		int M = s.nextInt();
		System.out.println(indexAt(arr, 0, M));
    }
	public static int indexAt(int arr[], int index, int M)
	{
		if(index==arr.length)
        {
			return -1;
        }

		int i= indexAt(arr, index+1, M); 
		if(i == -1)
        {              
			if(arr[index]==M)
			{
				// System.out.println(index);
				return index;
			}
			else
				return -1;	
        }
		else{
			return i;}
	}
}