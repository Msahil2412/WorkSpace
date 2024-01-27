package DS_Algo_JAVA.Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic_Trees 
{
    private class Node
    {
        int data;
        ArrayList<Node> children;
        Node(int d)
        {
            this.data=d;
            this.children=new ArrayList<>();
        }
    }
    private Node root;
    private int size;
    Generic_Trees()
    {
        Scanner s=new Scanner(System.in);
        this.root=takeInput(s,null,0);
    }
    public Node takeInput(Scanner s, Node n, int i)
    {
        if(n==null)
            System.out.println("Enter The Data Of Root Node...");
        else
            System.out.println("Enter The Data for "+i+"th child Of parent "+n.data);
        
        int ndata=s.nextInt();
        Node newNode=new Node(ndata);
        this.size+=1;
        System.out.println("Enter The No. Of Children of this Node....");
        int nchild=s.nextInt();
        for(int x=0;x<nchild;x++)
        {
            Node child=this.takeInput(s, newNode, x);
            newNode.children.add(child);
        }
        return newNode;
    }
    public void display() {
        this.display(this.root);
    }
    private void display(Node n)
    {
        String st=n.data+":=> ";
        for(int i=0;i<n.children.size();i++)
        {
            st+=n.children.get(i).data+", ";
        }
        st+=" END :)";
        System.out.println(st);
        for(int i=0;i<n.children.size();i++)
        {
            this.display(n.children.get(i));
        }
    }
}
