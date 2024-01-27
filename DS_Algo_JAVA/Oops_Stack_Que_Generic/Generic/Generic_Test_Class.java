package DS_Algo_JAVA.Oops_Stack_Que_Generic.Generic;

public class Generic_Test_Class// implements Comparable<Generic_Test_Class>
{
    int speed, price;
    String Color;
    public Generic_Test_Class(int s, int p, String st)
    {
        this.speed=s;
        this.Color=st;
        this.price=p;
    }       
    @Override
    public String  toString()
    {
        return "Speed: "+ this.speed+ "\n Price:  "+this.price+ "\n Color: "+this.Color+" \n";
    }
    // @Override
    // public int compareTo(Generic_Test_Class other)
    // {
    //     return this.speed-other.speed;
    // }
}
