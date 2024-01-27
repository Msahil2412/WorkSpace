package DS_Algo_JAVA.Oops_Stack_Que_Generic.LinkedList;

public class LinkedTree
{
    private class Node<G>
    {
        G data;
        Node left;
        Node right;
    }
    private Node root;
    private Node working;

    public <G>void addLast(G n)
    {
        Node<G> nn = new Node<>();
        nn.data  = n;
        System.out.println(nn.data);
        nn.right = null;
        nn.left = null;
        if(this.root==null)
        {
            this.root=nn;
            this.working=this.root;
            return ;
        }
        if(this.working.left==null)
        {
            System.out.println("Add Leaf At Branch left");
            this.working.left=nn;
            return;
        }
        if(this.working.right==null)
        {
            System.out.println("Add Leaf At Branch right");
            this.working.right=nn;
            return;
        }
        else
        {
            System.out.println("Changing Branch");
            this.working=this.root;
            this.root.right=nn;
        }
    }
    public void display()
    {
        this.traverse(this.root);
    }
    public void traverse(Node p)
    {
        if(p!=null)
        {
            traverse(p.left);
            System.out.println(p.data);
            traverse(p.right);
        }
    }
    // public void addFirst(int n) {
    //     Node nn = new Node();
    //     nn.data = n;
    //     nn.next = this.head;

    //     this.head = nn;
    //     this.size += 1;
    // }

    // public int getLast() throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     return this.tail.data;
    // }

    // public int getFFirst() throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     return this.head.data;
    // }

    // public int getAt(int n) throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     if (n < 0 || n >= size)
    //         throw new Exception("Invalid Index...");

    //     Node temp = new Node();
    //     temp = this.head;
    //     int i = 0;
    //     while (i != n) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     return temp.data;
    // }

    // public int len() throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     return this.size;
    // }

    // private Node getNodeAt(int n) throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     if (n < 0 || n >= size)
    //         throw new Exception("Invalid Index...");

    //     Node temp = new Node();
    //     temp = this.head;
    //     int i = 0;
    //     while (i != n) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     return temp;
    // }

    // public void addNoadeAt(int n, int d) throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     if (n < 0 || n >= size)
    //         throw new Exception("Invalid Index...");
    //     if (n == 0)
    //         this.addFirst(n);
    //     if (n == this.size)
    //         this.addLast(n);
    //     else {
    //         Node nn = new Node();
    //         nn.data = d;
    //         nn.next = this.getNodeAt(n);
    //         Node nn2 = this.getNodeAt(n - 1);
    //         nn2.next = nn;
    //         this.size += 1;
    //     }
    // }

    // public int removeFirst() throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     int t = this.head.data;
    //     this.head = this.head.next;
    //     if (this.head == null)
    //         this.tail = null;
    //     this.size -= 1;
    //     return t;
    // }

    // public int removeLast() throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     int t = 0;
    //     if (this.size == 1) {
    //         t = this.tail.data;
    //         this.tail = this.head = null;
    //         this.size -= 1;
    //     } else {
    //         t = this.tail.data;
    //         this.tail = this.getNodeAt(this.size - 2);
    //         this.tail.next = null;
    //         this.size -= 1;
    //     }
    //     return t;
    // }

    // public int removeAt(int n) throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     if (n == 0)
    //         this.removeFirst();
    //     int t = 0;
    //     if (n == this.size - 1)
    //         this.removeLast();
    //     else {
    //         Node nn = getNodeAt(n);
    //         t = nn.data;
    //         Node nn2 = getNodeAt(n - 1);
    //         nn2.next = nn.next;
    //         this.size -= 1;
    //     }
    //     return t;
    // }

    // public void display() throws Exception {
    //     if (this.size == 0)
    //         throw new Exception("Empty LinkedList...");
    //     Node nn = new Node();
    //     nn = this.head;
    //     while (nn != null) {
    //         System.out.println(nn.data);
    //         nn = nn.next;
    //     }
    //     System.out.println("Size:=> " + this.size);
    // }

}