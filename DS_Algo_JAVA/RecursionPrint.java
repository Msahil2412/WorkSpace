package DS_Algo_JAVA;

import javax.lang.model.util.ElementScanner14;

public class RecursionPrint 
{
    public static void main(String[] args)
    {
        //subSequencesPrint("abc","");
        //permutPrint("abc","");
        //boardPathPrint(0, 10, "");
        //mazePathPrint(0, 0, 2, 2, "");
        //mazePathDiagonalPrint(0, 0, 2, 2, "");
        boolean[][] b=new boolean[4][4];
        nQueensPrint(b, 0,"");
    }
    public static void subSequencesPrint(String str, String str2)
    {
        if(str=="")
        {
            System.out.println(str2);
            return;
        }
        char ch=str.charAt(0);
        String st=str.substring(1);
        subSequencesPrint(st, str2);
        subSequencesPrint(st, str2+ch);
    }
    public static void permutPrint(String str,String st2)
    {
        if(str=="")
        {
            System.out.println(st2);
            //System.out.println;
            return ;
        }
        for(int i=0;i<str.length();i++)
        {
            String st=str.substring(0,i)+str.substring(i+1);
            char ch=str.charAt(i);
            permutPrint(st, st2+ch);
        }
    }
    public static void boardPathPrint(int cur, int end, String str)
    {
        if(cur==end)
        {
            System.out.println(str);
            return;
        }
        if(cur>end)
            return;
        for(int i=1;i<=6;i++)
            boardPathPrint(cur+i, end, str+i);
    }
    public static void mazePathPrint(int cc, int cr, int ec, int er, String str)
    {
        if(cc==ec && cr==er)
        {
            System.out.println(str);
            return;
        }
        if(cr>er || cc>ec)
            return;
        mazePathPrint(cc+1, cr, ec, er, str+"H");
        mazePathPrint(cc, cr+1, ec, er, str+"V");
    }
    public static void mazePathDiagonalPrint(int cc, int cr, int ec, int er, String str)
    {
        if(cc==ec && cr==er)
        {
            System.out.println(str);
            return;
        }
        if(cr>er || cc>ec)
            return;
        mazePathDiagonalPrint(cc+1, cr, ec, er, str+"H");
        mazePathDiagonalPrint(cc, cr+1, ec, er, str+"V");
        mazePathDiagonalPrint(cc+1, cr+1, ec, er, str+"D");
    }
    /*public static void nQueensPrint(boolean[][] board, int row)
    {
        if(row==board.length)
        {
            System.out.println("1");
            return ;
        }
        int count =0;
        for(int col=0;col<board[row].length;col++)
        {
            if(isItSafe(board,row,col))
            {
                board[row][col]=true;
                nQueensPrint(board, row+1);
                count ++;
                board[row][col]=false;
            }
        }
        //System.out.println(count);
        return ;
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
    }*/
    public static void nQueensPrint(boolean [][]board, int row, String st)
    {
        if(row==board.length)
        {
            System.out.println(st);
            return ;
        }
        //int count =0;
        for(int col=0;col<board[row].length;col++)
        {
            if(isItSafe(board,row,col))
            {
                board[row][col]=true;
                st+="{"+(row+1)+"-"+(col+1)+"}"+" ,";
                nQueensPrint(board, row+1,st);
                board[row][col]=false;
            }
        }
    }
    public static boolean isItSafe(boolean [][] board,int row, int col)
    {
        //boolean b=true;
        for(int i=row;i>=0;i--)
        {
            if(board[i][col])
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
}
