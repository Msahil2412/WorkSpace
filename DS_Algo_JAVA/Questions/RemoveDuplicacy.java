package DS_Algo_JAVA.Questions;

import java.util.Scanner;

public class RemoveDuplicacy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        if(st.length()<1 || st.length()>=1000)
            System.out.println("Invalid String...");

        System.out.println(remDuplicacy(st, st.charAt(0)+"", 1));
    }
    public static String remDuplicacy(String st, String res, int i) {
        if (i == st.length())
            return res ;

        char ch = st.charAt(i);
        if(i+1 == st.length())
            return res+st.charAt(i);
        char ch2 = st.charAt(i + 1);
        char ch3 = st.charAt(i - 1);
        if (ch != ch2 && ch != ch3){
            res+=ch;}
        if(ch==ch3 && ch==ch2)
            res+="";
        if(ch==ch3 && ch!=ch2)
            res+="";
        else{
            System.out.println(ch3+" "+ch+" "+ch2);
            res+=ch;
            i+=1;
        }
        String s = remDuplicacy(st, res, i + 1);
        return s;

    }
}
