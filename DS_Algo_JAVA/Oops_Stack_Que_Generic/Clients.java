package DS_Algo_JAVA.Oops_Stack_Que_Generic;

public class Clients
{
    public static void main(String[] args)throws Exception 
    {
    //     Person p=new Person();
    //     System.out.println(p.name);    
    //     System.out.println(p.age);
        // Person p2=new Person("Ayush");
        // // p2.name="Kajal";
        // // p2.age=22;
        // p2.setName("Kajal");
        // p2.setAge(22);
        // System.out.println(p2.getName());
        // System.out.println(p2.getAge());
        // Student s=new Student();
        // s.name="Sahil";
        // Student s=new Student();
        // try
        // {
        //     s.setAge(-12);
        // }
        // catch(Exception e)
        // {
        //     System.out.println("In Catch Block:=> "+e);
        // }
        // System.out.println(s.getAge());
        // StackInArrays stack=new StackInArrays(6);
        // System.out.println(stack.isEmpty());
        // stack.push(25);
        // //stack.display();
        // stack.pop();
        // System.out.println(stack.top());
        // DynStackChild ds=new DynStackChild();// Only DynStack Funcstion and variables are Available nd shown...
        // //StackInArrays sa =new StackInArrays();
        // System.out.println(ds.d);// At The Time Of Execution JVM Go to the Child class As It Found The d Variable at the child class...
        // System.out.println(ds.d3);//At the Excution Time The JVM Go to the Parent Class Because BEcause It Does Not Found Any D3 Variable in child Class...
        // ds.func();
        // ((DynStackParent)ds).func();//after typecasting It Does Not go to the parent class because it already found the func function in chlid class so it does not move to parent class as execution of function is different ... 
        // ds.func3();
        // System.out.println(((DynStackParent)ds).d);//here JVM Go to the Parent class because it is type casted...
        // DynStackParent ds2=new DynStackChild();
        // ds2.func();//here the JVM does not go to the parent class because it found the func function in child class....
        // ds2.func3();//here JVM Go through the parent class because child does not have  func3 function
        // System.out.println(ds2.d);
        // System.out.println(ds2.d3);
        //System.out.println(sa.isEmpty());
        //DynStack ds3=new DynStack2(); In Java it is not applicable because at the time of execution The Memory not allocateed for the child class thats why its a runtime error...
        //In java To access Parent Class Function we have to create Prent class instance....
        DynamicStack dS=new DynamicStack(10);
        for(int i=0;i<10;i++)
           dS.push(i+1);
        dS.push(24);
        // for(int i=0;i<10;i++)
        //     System.out.println(dS.pop());
        System.out.println();
        DynamicStack help=new DynamicStack(10);
        reverseStack(dS,help,0);
        // System.out.println(help.pop()+"Help pop");
        dS.display();
        // int arr[]={2,1,3,8,6,7,5};
        // nextGreater(arr);
        // QeueInArrays qd=new QeueInArrays();
        // System.out.println(qd.isEmpty());
        // qd.push(24);
        // qd.push(35);
        // qd.display();
        // // System.out.println(qd.isEmpty());
        // System.out.println(qd.get());
        // System.out.println(qd.get());
        // DynamicQeue qe=new DynamicQeue(5);
       
        // for(int i=0;i<5;i++)
        //     qe.push(i+1);
        // //reverseQeue(qe);
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(qe.get());
         
        // }
        // System.out.println(qe.isEmpty());
        // qe.push(24);
        // System.out.println(qe.isEmpty());
        
    }  
    public static void reverseStack(DynamicStack stack, DynamicStack help, int i)throws Exception
    {
        if(stack.isEmpty()==true)
            return;
        int item=stack.pop();
        reverseStack(stack,help,i+1);
        help.push(item);
        if(i==0)
        while(!help.isEmpty())
        {
            stack.push(help.pop());
            // System.out.println(stack.pop());
        }
}
    // public static void nextGreater(int arr[])throws Exception
    // {
    //     DynamicStack stack=new DynamicStack();
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         while(!stack.isEmpty() && arr[i]>stack.top())
    //         {
    //             int r=stack.pop();
    //             System.out.println(r+" -> "+arr[i]);
    //         }
    //         stack.push(arr[i]);
    //     }
    //     while(!stack.isEmpty())
    //     {
    //         System.out.println(stack.pop()+" -> "+-1);
    //     }
    // }
    // public static void reverseQeue(DynamicQeue qe)throws Exception
    // {
    //     if(qe.isEmpty())
    //         return;
    //     int rt=qe.get();
    //     reverseQeue(qe);
    //     qe.push(rt);
    // } 
}