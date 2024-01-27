package DS_Algo_JAVA.Questions;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String num=s.next();
        if(num.length()<1 || num.length()>10)
            System.out.println("Invalid String Lenght...");
            System.out.println();
        System.out.println("\n"+stringInteger(num,0, 0));
        // stringInteger(num,0, 0);
        
    }
    public static int stringInteger(String num, int N, int i)
    {
        if(i==num.length())
            return N;
        else{
        char ch=num.charAt(i);
        N*=10;
        N+=ch-'0';
        // System.out.println(ch+" "+(int)ch);
        System.out.println(N);
        int x=stringInteger(num, N, i+1);
        return x;}
    }
    
}
