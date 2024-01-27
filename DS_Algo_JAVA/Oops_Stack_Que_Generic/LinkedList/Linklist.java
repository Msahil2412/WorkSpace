package DS_Algo_JAVA.Oops_Stack_Que_Generic.LinkedList;

public class Linklist
{
    private class Node
    {
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    
    public void addLast(int n)
    {
        Node nn=new Node();
        nn.data=n;
        nn.next=null;
        
        if(this.size>=1)
            this.tail.next=nn;
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size = +1;
        }
        else
        {
            this.tail=nn;
            this.size+=1;
        }
    }
    public void addFirst(int n)
    {
        Node nn=new Node();
        nn.data=n;
        nn.next=this.head;

            this.head=nn;
            this.size+=1;
    }
    public int getLast()throws Exception
    {
        if (this.size == 0)
            throw new Exception("Empty LinkedList...");
        return this.tail.data;
    }
    public int getFFirst()throws Exception
    {
        if (this.size == 0)
            throw new Exception("Empty LinkedList...");
        return this.head.data;
    }
    public int getAt(int n)throws Exception
    {
        if(this.size==0)
            throw new Exception("Empty LinkedList...");
        if(n<0 || n>=size)
            throw new Exception("Invalid Index...");
        
        Node temp=new Node();
        temp=this.head;
        int i=0;
        while(i!=n)
        {
            temp=temp.next;
            i++;
        }
        return temp.data;
    }
    public int len()throws Exception
    {
        if(this.size==0)
            throw new Exception("Empty LinkedList...");
        return this.size;
    }
    private Node getNodeAt(int n)throws Exception
    {
        if (this.size == 0)
            throw new Exception("Empty LinkedList...");
        if (n < 0 || n >= size)
            throw new Exception("Invalid Index...");

        Node temp = new Node();
        temp = this.head;
        int i = 0;
        while (i != n) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
    public void addNoadeAt(int n, int d)throws Exception
    {
        if (this.size == 0)
            throw new Exception("Empty LinkedList...");
        if (n < 0 || n >= size)
            throw new Exception("Invalid Index...");
        if(n==0)
            this.addFirst(n);
        if(n==this.size)
            this.addLast(n);
        else
        {
            Node nn=new Node();
            nn.data=d;
            nn.next=this.getNodeAt(n);
            Node nn2=this.getNodeAt(n-1);
            nn2.next=nn;
            this.size+=1;
        }
    }
    public int removeFirst()throws Exception
    {
        if (this.size == 0)
            throw new Exception("Empty LinkedList...");
        int t=this.head.data;
        this.head=this.head.next;
        if(this.head==null)
            this.tail=null;
        this.size-=1;
        return t;
    }
    public int removeLast()throws Exception
    {
        if (this.size == 0)
            throw new Exception("Empty LinkedList...");
        int t=0;
        if(this.size==1)
        {
            t=this.tail.data;
            this.tail=this.head=null;
            this.size-=1;
        }
        else
        {
            t=this.tail.data;
            this.tail=this.getNodeAt(this.size-2);
            this.tail.next=null;
            this.size-=1;
        }
            return t;
    }
    public int removeAt(int n)throws Exception
    {
        if(this.size==0)
            throw new Exception("Empty LinkedList...");
        if(n==0)
            this.removeFirst();
        int t=0;
        if(n==this.size-1)
            this.removeLast();
        else
        {
            Node nn=getNodeAt(n);
            t=nn.data;
            Node nn2=getNodeAt(n-1);
            nn2.next=nn.next;
            this.size-=1;
        }
        return t;
    }
    public void reverseData()throws Exception
    {
        int ln=0;
        int rn=this.size -1;
        while(ln<rn)
        {
            int t=this.getNodeAt(ln).data;
            this.getNodeAt(ln).data=this.getNodeAt(rn).data;
            this.getNodeAt(rn).data=t;
            ln++;
            rn--;
        }
    }
    public void reversePointer()
    {
        Node pre=this.head;
        Node cur=pre.next;

        while(cur!=null)
        {
            Node ahead =cur.next;
            cur.next=pre;
            pre=cur;
            cur=ahead;
        }
        Node t=this.head;
        this.head= this.tail;
        this.tail=t;
        t.next=null;
    }
    public void midNode()throws Exception
    {
        Node slow=this.head;
        Node fast=this.head;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public int endthNode(int n)
    {
        Node t=new Node();
        t=this.tail;
        int x=n;
        while(x!=1)
        {
            t=t.
        }
    }
    public void display()throws Exception
    {
        if (this.size == 0)
            throw new Exception("Empty LinkedList...");
        Node nn=new Node();
        nn=this.head;
        while(nn!=null)
        {
            System.out.println(nn.data);
            nn=nn.next;
        }
        System.out.println("Size:=> "+this.size);
    }

}