package DS_Algo_JAVA;

public class Replace_pi 
{
    public static void main(String[] args) 
    {
        String r=replace_pi("xpippix", 7);
         System.out.println(r);   
    }
    public static String replace_pi(String st, int l)
    {
        if(l==0)
            return st;
            String rs=st.substring(0,l);
        String re=replace_pi(rs,l-1);
        String re2=replace_pi(rs, l-1);
        if((re+re2)=="pi")
        {
            re=re.substring(0,l)+"3.14";
        }
    }    
    public static subSet(int[] arr, int vi)
    {
        
    }    
}
