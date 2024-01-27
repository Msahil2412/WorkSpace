package DS_Algo_JAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        //rec(5);
        //rec2(5);
        //System.out.println(facto(5));
        //System.out.println(fiborec(5));
        //System.out.println(powe(2,2));
        int arr[]={12,56,7,9,6,9,3};
        //System.out.println(firstIndex(arr,6,0));
        //System.out.println(lastIndex(arr,9,0));
        //System.out.println(Arrays.toString(inDex(arr, 9, 0,0)));
        //pat(5,1,1);
        //bubbleSort(arr, 0, arr.length-1);
        boolean[][] b=new boolean[4][4];
        //System.out.println(//Arrays.toString(b));
        //System.out.println(nQueens(b, 0));
        //replaceString("xpippix ", "", 7, 0);
        //System.out.println(replace_pi("xpippix", 0));
    }
    public static void rec(int n) 
    {
        if(n==0)
            return;
        System.out.println(n);
        rec(n-1);
        System.out.println(n);
    }
    public static void rec2(int n)
    {
        if(n==0)
            return;
        if(n%2!=0)
            System.out.println(n);
        rec2(n-1);
        if(n%2==0)
        System.out.println(n);
    }
    public static int facto(int n)
    {
        if(n==0)
            return 1;
            int f=facto(n-1)*n;
        return f;
    }
    public static int fiborec(int n)
    {
        if(n==1)
            return n;
        if(n==0)
            return n;
        int fib=fiborec(n-1)+fiborec(n-2);
        return fib;
    }
    public static int powe(int x, int y)
    {
        if(y==0)
            return 1;
        x=x*powe(x,y-1);
        return x;
    }
    public static boolean isArrayIsSorted(int[] ar)
    {
        
        System.out.println("ki");
    }   
    public static int firstIndex(int arr[], int f, int i)
    {
        if(i==arr.length-1)
            return -1;
        if(arr[i]==f)
            return i;
        else 
        {
            int m=firstIndex(arr,f,i+1);
            return m;
        }    
    }
    public static int lastIndex(int[] ar, int f, int i)
    {
       
        if(i==ar.length-1)
            return-1;
        //if(i==ar.length-1 &&  j!=0)
          //  return j;
          int j=lastIndex(ar,f,i+1);
        if(j==-1)
        if(ar[i]==f)
            return i;
        else
           return -1;
        else
            return j;
    }
    public static int[] inDex(int[] ar, int f, int i, int count)
    {
        /*ArrayList arr=new ArrayList<Integer>();
        int j[]=null;
        if(i==ar.length-1 && arr.size()==0)
            return null;
            if(i==ar.length-1 && arr.size()!=0)
            return arr;
        if(ar[i]==f)
        {   
            arr.add(i);
            j=inDex(ar, f, i+1);
        }
        else
            j=inDex(ar, f, i+1);*/
        if(i==ar.length)
        {
            int []arr=new int[count];
            return arr;
        }
        int []j=null;
        if(ar[i]==f)
            j=inDex(ar, f, i+1, count+1);
        else
            j=inDex(ar, f, i+1, count);
        if(ar[i]==f)
            j[count]=i;
        return j;
    }
    public static void pat(int k, int r, int c)
    {
        if(r==k)
        {   
            System.out.println(Arrays.toString(ar));
            return;   
        }
        if(c>r)
        {
            System.out.println();
            pat(k,r+1,1);
            return;
        }
        System.out.print("*");
        pat(k,r,c+1);
    }
    public static void bubbleSort(int ar[], int i, int l)
    {
        if(l==0)
        {
            System.out.println(Arrays.toString(ar));
            return;
        }
        
        if(i==l)
        {
            bubbleSort(ar, 0,l-1);
            return;
        }
        if(ar[i]>ar[i+1])
        {
            int t=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=t;
           // System.out.println(Arrays.toString(ar));
        }
            bubbleSort(ar, i+1, l);
    }
    public static int nQueens(boolean [][]board, int row)
    {
        if(row==board.length)
            return 1;
        int count =0;
        for(int col=0;col<board[row].length;col++)
        {
            if(isItSafe(board,row,col))
            {
                board[row][col]=true;
                count+=nQueens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    public static boolean isItSafe(boolean [][] board,int row, int col)
    {
        //boolean b=true;
        for(int i=row;i>=0;i--)
        {
            if(board[i][col]==true)
                return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j])
                return false;
        }
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++)
            {
                if(board[i][j])
                    return false;
            }
        return true;
    }
    public static void replaceString(String str, String str2, int len, int k)
    {
            if(len==1)
            {
                System.out.println(str2);
                return;
            }
            char ch=st.charAt(k)
            char ch2= st.charAt(k+1);
            String st1="";
            st1+=ch;st1+=ch2;
            if(st1=="pi")
            str2+="3.14";
            else
            str2+=ch;
            replaceString(str, str2, len-1, k+1);

        }
    public static String replace_pi(String st, int l)
    {
        if(st.length()<=1)
            return st;
            String rs=st.substring(0,l)
        String re=replace_pi(rs,l-1);
        /*if((re=="pi")
        {
            re=re.substring(0,l)+"3.14";
        }*/
    }    
    }
}
