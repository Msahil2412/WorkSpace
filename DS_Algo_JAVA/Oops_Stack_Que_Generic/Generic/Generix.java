package DS_Algo_JAVA.Oops_Stack_Que_Generic.Generic;

import java.util.Comparator;

public class Generix 
{
    public static void main(String[] args) 
    {
    Integer[] arr={1,3,4,5,6,7,};
    String[] stt={"gello","sahil","Kajal"};    
    // display(stt);
    // display(arr);
    Generic_Test_Class[] cars=new Generic_Test_Class[3];
    cars[0]=new Generic_Test_Class(100, 24000, "Black");
    cars[1]=new Generic_Test_Class(700, 34000, "Black_pink");
    cars[2]=new Generic_Test_Class(300, 44000, "Black_yellow");
    display(cars);
    System.out.println();

    bubbleSort(cars, new Generic_Comparator_Color());
    display(cars);
    }    
    public static <X> void display(X[] arr)
    {
        for(X val :arr)
            System.out.println(val+" ");
    }
    public static <X extends Comparable<X>> void bubbleSort(X[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            if(arr[j].compareTo(arr[j+1])>0)
            {
                X t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
    }
    public static <X> void bubbleSort(X[] arr, Comparator<X> compar)
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - 1; j++)
                if (compar.compare(arr[j],arr[j+1]) < 0)
                {
                    X t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
        }
    }
}