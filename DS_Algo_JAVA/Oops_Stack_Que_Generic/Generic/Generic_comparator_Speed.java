package DS_Algo_JAVA.Oops_Stack_Que_Generic.Generic;

import java.util.Comparator;

public class Generic_comparator_Speed implements Comparator<Generic_Test_Class> 
{
    @Override
    public int compare(Generic_Test_Class ts, Generic_Test_Class ot)
    {
        return ts.speed-ot.speed;
    }
}
