package DS_Algo_JAVA.Trees;

public class BST extends Binary_Tree
{
    private class Node
    {
        int data;
        Node left;
        Node right;
    }
    
    private Node root;

    public BST(int arr[])
    {
        this.root =construct(arr,0, arr.length-1);
    }

    private Node construct( int arr[], int l, int r)
    {
        if(l>r)
            return null;
        int mid=(l+r)/2;
         
        Node nn=new Node();
        nn.data=arr[mid];

        nn.left=construct(arr,l,mid-1);
        nn.right=construct(arr, mid+1, r);

        return nn;
    }
    public void display()
    {
        dis(this.root);
    }
    private void dis(Node rt)
    {
        if(rt==null)
            return ;
            
        if (rt.left == null && rt.right == null)
            System.out.println("X" + "-> " + rt.data + " <-" + "X");
        else if(rt.left==null)
            System.out.println("X" + "-> " + rt.data + " <-" + rt.right.data);
        else if(rt.right==null)
            System.out.println(rt.left.data + "-> " + rt.data + " <-" + "X");
        else
            System.out.println(rt.left.data+"-> "+rt.data+" <-"+rt.right.data);

        dis(rt.left);
        dis(rt.right);
    }
    public boolean find(int n)
    {
        return find(this.root,n);
    }
    private boolean find(Node n, int f)
    {
        if(f==n.data)
            return true;
        if(f>n.data && n.right!=null)
            return find(n.right,f);
        else if(f<n.data && n.left!=null)
            return find(n.left,f);
        else
            return false;
    }
    public int max()
    {
        return max(this.root.right,this.root.data);
    }
    private int max(Node n,int m)
    {
        if(n==null)
            return m;
        if(n.data>m)
        {
            m=n.data;
            return max(n.right,m);
        }
        else
            return m;
        
        // here root node will be passed in max parameters...
        // if(n.right==null)
        //     return n.data;

        // return max(n.right);
    }
    public void add(int n)
    {
        add(this.root, n);    
    }
    private void add(Node n, int a)
    {
        // if(n==null)
        // {
        //     Node nx=new Node();
        //     nx.data=a;
        //     nx.left=null;
        //     nx.right=null;
        //     n=nx;
        // }
        if(a>n.data)
        {   
            if(n.right==null)
            {
                Node nx=new Node();
                nx.data=a;
                n.right=nx;
            }
            add(n.right,a);
        }
        else if(a<n.data)
        {
            if(n.left==null)
            {
                Node nx=new Node();
                nx.data=a;
                n.left=nx;
            }
            add(n.left,a);
        }
    }
    public void remove(int n)
    {
        remove(n,false,root,null);
    }
    private void remove(int n, boolean c, Node rt, Node p)
    {
        if(rt==null)
            return;
        if(n>rt.data)
            remove(n,false,rt.right,rt);
        else if(n<rt.data)
            remove(n,true,rt.left,rt);
        else
        {
            if(rt.left==null && rt.right==null)
                if(c==true)
                    p.left=null;
                else
                    p.right=null;
            else if(rt.left==null && rt.right!=null)
                if(c==true)
                    p.left=rt.right;
                else
                    p.right=rt.right;
            else if(rt.left!=null && rt.right==null)
                if(c==true)
                    p.left=rt.left;
                else
                    p.right=rt.left;
            else
            {    int mx = max(rt.left,rt.left.data);
                rt.data=mx;
                System.out.println(mx);
                remove(mx, true, rt.left, rt);
            }
        }
    }
}