package DS_Algo_JAVA;

public class WavePrint_RowWise
{
    public static void main(String[] args) {
        //int arr[][];
        int arr[][]={{1,2,3,4},{11,12,13,14},{21,22,23,24},{31,32,33,34}};
        int j=0;
        for(int i=0;i<4;i++)
        {   if(j<4)
            {
                for(j=0;j<4;j++)
                {
                    System.out.println(arr[i][j]+" ");
                }
                j=4;
            }
            else
            {
                for(j=3;j>=0;j--)
                    System.out.println(arr[i][j]+" ");
                j=0;
            }
        }
    }
}