package DS_Algo_JAVA;
import java.util.ArrayList;

public class ArrayListRec 
{
    public static void main(String[] args) 
    {
        //System.out.println(getss("abc"));
        //System.out.println(permut("abc"));
        //System.out.println(boardPath(0, 10));
        //System.out.println(mazePath(0,0,4,5));
        System.out.println(mazePathDiagonal(0,0,2,2));
    }   
    public static ArrayList<String> getss(String st)
    {
        if(st=="")
        {
            ArrayList<String> bs=new ArrayList<>();
            bs.add("");
            return bs;
        }
        char ch=st.charAt(0);
        String st2=st.substring(1);
        ArrayList<String> result=new ArrayList<>();
        ArrayList<String> re= new ArrayList<>(getss(st2));
        for(int i=0;i<re.size();i++)
        {
            result.add(re.get(i));
            result.add((int)ch+re.get(i));
            /*char c=re.get(i).charAt(i);
            int as=(int)c;
            // System.out.println(as);
            String s=Integer.toString(as);*/
            //
            //result.add();
            result.add(ch+re.get(i));
        }
        return result;
    }
    public static ArrayList<String> permut(String st)
    {
        if(st=="")
        {
            ArrayList<String> st2=new ArrayList<>();
            st2.add("");
            return st2;
        }
        char ch=st.charAt(0);
        ArrayList<String> recr=new ArrayList<>(permut(st.substring(1)));
        ArrayList<String> myr =new ArrayList<>();
        for(String rrs : recr)
        {
            for(int i=0;i<=rrs.length();i++)
            {
                myr.add(rrs.substring(0,i)+ch+rrs.substring(i));
            }
        }
        return myr;
    }
    public static ArrayList<String> boardPath(int cur, int end)
    {
        if(cur==end)
        {
            ArrayList<String> bc=new ArrayList<>();
            bc.add("");
            return bc;
        }
        if(cur>end)
        {
            ArrayList<String> bc=new ArrayList<>();
         //   bc.add("");
            return bc;
        }
        ArrayList<String> myr=new ArrayList<>();
        for(int dice=1;dice<=6;dice++)
        {
            ArrayList<String> recr=new ArrayList<>(boardPath(cur+dice, end));

            for(String rr : recr)
            {
                myr.add(dice+rr);
            }
        }
        return myr;
    }
    public static ArrayList<String> mazePath(int cr, int cc, int er, int ec)
    {
        if(cr==er && cc==ec)
        {
            ArrayList<String> bc=new ArrayList<>();
            bc.add("");
            return bc;
        }
        if(cr>er || cc>ec)
        {
            return new ArrayList<String>();
        }
        ArrayList<String> myr=new ArrayList<>();
        ArrayList<String> recrh =new ArrayList<>(mazePath(cr+1,cc,er,ec));
        ArrayList<String> recrv =new ArrayList<>(mazePath(cr,cc+1,er,ec));
        for(String str: recrh)
        {
            myr.add("H"+str);
        }
        for(String str : recrv)
        {
            myr.add("V"+str);
        }
        return myr;
    }
    public static ArrayList<String> mazePathDiagonal(int cr, int cc, int er, int ec)
    {
        if(cr==er && cc==ec)
        {
            ArrayList<String> bc=new ArrayList<>();
            bc.add("");
            return bc;
        }
        if(cr>er || cc>ec)
        {
            return new ArrayList<String>();
        }
        ArrayList<String> myr=new ArrayList<>();
        ArrayList<String> recrh =new ArrayList<>(mazePathDiagonal(cr+1,cc,er,ec));
        ArrayList<String> recrv =new ArrayList<>(mazePathDiagonal(cr,cc+1,er,ec));
        ArrayList<String> recrd =new ArrayList<>(mazePathDiagonal(cr+1,cc+1,er,ec));
        for(String str: recrh)
        {
            myr.add("H"+str);
        }
        for(String str : recrv)
        {
            myr.add("V"+str);
        }
        for(String str : recrd)
        {
            myr.add("D"+str);
        }
        return myr;
    }
}