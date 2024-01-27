package DS_Algo_JAVA.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree 
{
    private class Node
    {
        private Node left;
        private Node right;
        private int data;

        Node(int data, Node left, Node right)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }    
    private Node root=null;
    private int size=0;

    Binary_Tree()
    {
        Scanner s=new Scanner(System.in);
        this.root=takeInput(s,null, false );
    }

    public Node takeInput(Scanner s, Node parent, boolean b)
    {
        if(parent==null)
        {
            System.out.println("Enter the Data for Root Node...");
        }
        else if(b)
            System.out.println("Enter the Left Data of "+parent.data);
        else
            System.out.println("Enter the Right Data of "+parent.data);

        int nodeData=s.nextInt();
        Node n=new Node(nodeData,null,null);
        this.size+=1;

        System.out.println("Do You Want left Data of "+nodeData);
        boolean ch=s.nextBoolean();
        if(ch)
            n.left=takeInput(s, n, true);
        
        System.out.println("Do You Want right Data of "+nodeData);
        ch=s.nextBoolean();
        if(ch)
            n.right=takeInput(s, n, false);

        return n;
    }
    public void display()
    {
        this.display(this.root);
    }
    private void display(Node r)
    {
        String str="";
        if(r.left!=null)
            str+=r.left.data+"=>";
        else
            str+="End=>";
        str+=r.data;
        if(r.right!=null)
            str+="<="+r.right.data;
        else
            str+="<=End";
        System.out.println(str);
        if(r.left!=null)
            this.display(r.left);
        if(r.right!=null)
            this.display(r.right);
    }
    public int height()
    {
        return this.height(this.root);
    }
    private int height(Node n)
    {
        if(n==null)
            return -1;
        int lh=height(n.left);
        int rh=height(n.right);

        int h=Math.max(lh, rh)+1;
        return h;
    }
    public void preOrder()
    {
        this.preOrder(this.root);
    }
    private void preOrder(Node n)
    {
        if(n==null)
            return;

        System.out.print(n.data+", ");

        preOrder(n.left);
        preOrder(n.right);
    }
    public void inOrder()
    {
        this.inOrder(this.root);
    }
    private void inOrder(Node n)
    {
        if(n==null)
            return;

        inOrder(n.left);
        System.out.print(n.data+", ");
        inOrder(n.right);
    }
    public void postOrder()
    {
        this.postOrder(this.root);
    }
    private void postOrder(Node n)
    {
        if(n==null)
            return;

        postOrder(n.left);
        postOrder(n.right);
        
        System.out.print(n.data+", ");
    }
    public void levelOrder()
    {
        this.levelOrder(this.root);
    }
    private void levelOrder(Node n)
    {
        LinkedList<Node> q=new LinkedList<>();
        q.add(n);
        while(!q.isEmpty())
        {
            Node t=q.remove();
            System.out.print(t.data+", ");
            if(t.left!=null)
                q.add(t.left);
            if(t.right!=null)
                q.add(t.right);
        }
    }
    public boolean isBST()
    {
        return isBST(this.root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    private boolean isBST(Node n, int x, int y)
    {
        if(n==null)
            return true;
        if(n.data>x || n.data<y)
            return false;
        else if(!this.isBST(n.left, n.data, y))
            return false;
        else if(!this.isBST(n.right, x, n.data))
            return false;
        return true;
    }
    public void itInorder()
    {
        itInorder(this.root);
    }
    private void itInorder(Node n)
    {
        if(n==null)
            return;
        
        while(n.left!=null)
        {

        }
        // itInorder(n.left,st);
        // System.out.println(n.data);
        //  itInorder(n.right, st);
        // // System.out.println(n.data)
    }
    public int sumOfLeaf()
    {
        return(sumOfLeaf(this.root, 0));
    }
    private int sumOfLeaf(Node n, int s)
    {
        if(n==null){
            return s;
        }
        if(n.left==null && n.right==null){
        s=s+n.data;
        System.out.println(s);
        }
            
        sumOfLeaf(n.left, s);
        sumOfLeaf(n.right, s);

        return s;
    }
}