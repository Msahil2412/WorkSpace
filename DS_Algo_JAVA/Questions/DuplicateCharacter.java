package DS_Algo_JAVA.Questions;

import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        if(st.length()<1)
            System.out.println("Invalid String...");

        System.out.println(duplicacy(st, "", 0));

    }
    public static String duplicacy(String st, String res, int i)
    {
        if(i==st.length()-1)
            return res+st.charAt(i);
        
        char ch=st.charAt(i);
        res+=ch;
        char ch2=st.charAt(i+1);
        if(ch==ch2)
            res+='*';
        
        String s=duplicacy(st, res, i+1);
        return s;

    }
}
