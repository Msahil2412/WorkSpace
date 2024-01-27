package DS_Algo_JAVA.Trees;

public class Check_Trees
{
    public static void main(String[] args) {
        // Generic_Trees gt=new Generic_Trees();
        // gt.display();
        Binary_Tree bt=new Binary_Tree();
        bt.display();
        // // 12 true 24 false false true 42 false false
        // //50 true 12 true 1224 true 11 false false false true 21 false false true 24 true 42 false false true 36 false true 0 false false
        // System.out.println(bt.height());
        // bt.preOrder();
        // System.out.println();
        // bt.inOrder();
        // System.out.println();
        // bt.postOrder();
        // System.out.println();
        // bt.levelOrder();
        // int arr[]={10,20,30,40,50,60,70};
        // BST b=new BST(arr);

        // b.display();
        // System.out.println(b.find(100));// b.find(40);
        // System.out.println(b.max());
        // b.add(100);
        // b.add(5);
        // b.remove(60);
        // b.display();
        //50 true 12 true 1224 true 11 false false false true 21 false false true 24 true 42 false false true 36 false true 0 false false 
        //System.out.println( bt.isBST());
        //bt.itInorder();
        System.out.println( "Leaf Sum= "+bt.sumOfLeaf());
        
    }   
}