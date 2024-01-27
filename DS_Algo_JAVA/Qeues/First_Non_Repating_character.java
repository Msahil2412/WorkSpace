package DS_Algo_JAVA.Qeues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class First_Non_Repating_character 
{
    public static void main(String[] args) 
    {
        HashMap<Character,Integer> hmap=new HashMap<>();
        Queue<Character> que=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Charecters To Check...");
        char ch=s.next().charAt(0);
        
        while(ch!='.')
        {
            que.add(ch);
            if(hmap.containsKey(ch))
            {
                int sz=hmap.get(ch);
                sz=sz+1;
                hmap.put(ch,sz);
            }
            else
            {
                hmap.put(ch, 1);
            }

            while(!que.isEmpty())
            {
                char fc=que.peek();
                if(hmap.get(fc)==1)
                {
                    System.out.println(fc+ "  ");
                    break;
                }
                else
                    que.poll();
            }
            if(que.isEmpty())
                System.out.println("-1");
            ch=s.next().charAt(0);
        }
    }    
}
