package DS_Algo_JAVA;

public class Backtracking_Algo 
{
    public static void main(String[] args) 
    {
        boolean br[]={false,false,false,false};
        //Arrays.fill(br, false);
        //queenPermute(br, 4, 0, "");
        //queenComb(br , 2, 0, "", -1);
        int []arr={1,2,3};
        //coinChange(arr, 10, "", 0);
        //queenCombBox(br, 2, 0, "",0);
        //coinChangeDenomination(arr, 0, 4, "");
        boolean b[][]=new boolean[2][2];
        queenCombBox2DBox( b, 0, 0, "", 2, 0);
    }
    public static void queenPermute(boolean[] br, int tq, int tqf, String ans)
    {
        if(tq==tqf)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<br.length;i++)
        {
            if(br[i]==false)
            {
                br[i]=true;
                queenPermute(br, tq, tqf+1, ans+"q"+tqf+"b"+i);
            }
            br[i]=false;
        }
    }
    public static void queenComb(boolean[] br, int tq, int tqf, String ans, int lb)
    {
        if(tq==tqf)
        {
            System.out.println(ans);
            return;
        }
        for(int i=lb+1;i<br.length;i++)
        {
            if(br[i]==false)
            {
                br[i]=true;
                queenComb(br, tq, tqf+1, ans+"q"+tqf+"b"+i,i);
            }
            br[i]=false;
        }
    }  
    public static void coinChange(int []arr, int amt, String st , int li)
    {
        if(amt==0)
        {
            System.out.println(st);
            return ;
        }
        for(int i=li;i<arr.length;i++)
        {
            if(arr[i]<=amt)
              coinChange(arr, amt-arr[i], st+arr[i], 0);
            
        }  
    } 
    public static void queenCombBox(boolean []br, int tq, int tqu, String ans, int c)
    {
        if(tq==tqu)
        {
            System.out.println(ans);
            return;
        }
        if(c==br.length)
            return;
        br[c]=true;
        queenCombBox(br, tq, tqu+1, ans+"b"+c,c+1);
        br[c]=false;
        queenCombBox(br, tq, tqu, ans, c+1);
    }
    public static void coinChangeDenomination(int []arr, int cu, int amt, String ans)
    {
        if(amt==0)
        {
            System.out.println(ans);
            return;
        }
        if(amt<0)
            return;
        if(cu==arr.length)
            return;
        coinChangeDenomination(arr, cu, amt-arr[cu], ans+arr[cu]);
        coinChangeDenomination(arr, cu+1, amt, ans);
    }
    public static void queenCombBox2DBox(boolean br[][], int r, int c , String ans, int tq, int tqu )
    {   
        f(tqu==tq)
        {
            System.out.println(ans);
            return;
        }
        if(c>1)
        {    r++;
             c=0;
        }
        if(r> 1)
            return;
        br[r][c]=true;
        queenCombBox2DBox(br, r, c+1, ans+"r"+r+"c"+c+" ", tq, tqu+1);
        br[r][c]=false;
        queenCombBox2DBox(br, r, c+1, ans, tq, tqu);
    }
}
