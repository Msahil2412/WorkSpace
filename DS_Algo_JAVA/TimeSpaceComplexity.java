 package DS_Algo_JAVA;

import java.util.Arrays;

public class TimeSpaceComplexity 
{
    public static void main(String[] args) 
    {
        int []arr={1,3,6,9,10,12,16,18,22};
        int []arr2={20,22,26,36,59,69,78,89,102,1000};
        int mr[]={65,0,2,69,87,32,1};
        // System.out.println(Arrays.toString(mergeTwoArray(arr,arr2)));
        //System.out.println(Arrays.toString(mergeSort(mr, 0, mr.length-1)));
        //quickSort(mr, 0, mr.length-1);
        //System.out.println(Arrays.toString(mr));
        int a[]={1,1,0,2,1,0,2};
        //System.out.println(Arrays.toString(dutchNationalFlag(a)));
        //powerFunction(2, 4);
        //seiveOfEratosthenis(25);
        replaceString("xpippix", "", 7, 0);
    } 
    public static int[] mergeTwoArray(int ar[], int ar2[])
    {
        int i=0;
        int j=0;
        int k=0;
        int arr[]=new int[ar.length+ar2.length];
        while(i<ar.length && j<ar2.length)
        {
            if(ar[i]>ar2[j])
            {
                arr[k]=ar2[j];
                k++;
                j++;
            }
            else
            {
                arr[k]=ar[i];
                i++;
                k++;
            }
        }
        if(i==ar.length)
        {
            while(j<ar2.length)
            {
                arr[k]=ar2[j];
                k++;
                j++;
            }
        }
        if(j==ar2.length)
        {
            while(i<ar.length)
            {
                arr[k]=ar[i];
                i++;
                k++;
            }
        }
        return arr;
    }
    public static int[] mergeSort(int arr[], int lo, int hi)
    {
        if(lo==hi)
        {
            int bc[]=new int[1];
            bc[0]=arr[lo];
            return bc;
        }
        int mid=(lo+hi)/2;
        int []fh= mergeSort(arr,lo,mid);
        int []sh= mergeSort(arr,mid+1,hi);

        int[] merge=mergeTwoArray(fh, sh);
        return merge;
    }
    public static void quickSort(int[] arr, int lo, int hi)
    {
        if(lo>=hi)
        {
//            System.out.println(Arrays.toString(arr));
            return;
        }
        int left=lo;
        int right=hi;
        int mid=(left+right)/2;
        int p=arr[mid];
        
        while(left<=right)
        {
            while(arr[left]<p)
            {
                left++;
            }
            while(arr[right]>p)
            {
                right--;
            }
            if(left<=right)
            {
                int t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left++;
                right--;
            }
        }
        quickSort(arr, lo, right);
        quickSort(arr, left, hi);
         return;
    }
    public static int[] dutchNationalFlag(int[] arr)
    {
        int lo=0;
        int mid=0;
        int hi=arr.length-1;
        while(mid<=hi)
        {
            if(arr[mid]==0)
            {
                arr=swap(arr,lo,mid);
                lo++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else //if(arr[mid]==2)
            {
                arr=swap(arr,hi,mid);
                System.out.println(Arrays.toString(arr));
                //mid--;
                hi--;
            }
        }
        return arr;
    }
    public static int[] swap(int[] ar, int x, int y)
    {
        int temp=ar[x];
        ar[x]=ar[y];
        ar[y]=temp;
        return ar;
    }
    public static void powerFunction(int x, int n)
    {
        int p=1;
        if(n%2==0)
        {
            for(int i=1;i<=n/2;i++)
            {
                p*=x*x;
            }
            //p*=x;
            System.out.println("power ="+p);
        }
        else
        {
            for(int i=1;i<=n/2;i++)
                p*=x*x;
            p*=x;
            System.out.println("power ="+ p);
        }

    }
    public static void seiveOfEratosthenis(int n)
    {
        boolean []b=new boolean[n+1];
        Arrays.fill(b, true);

        b[0]=b[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(b[i]==false)
                continue;
            for(int j=2;j*i<=n;j++)
            {
                b[j*i]=false;
            }
        }
        System.out.println("Your Prime No. Are.....");
        for(int i=0;i<n;i++)
            if(b[i]==true)
            System.out.println(i);
    }
    public static void replaceString(String str, String str2, int len, int k)
    {
            if(len==1)
            {
                System.out.println(str2);
                return;
            }
            char ch=str.charAt(k);
            char ch2= str.charAt(k+1);
            String st1="";
            st1+=ch;st1+=ch2;
            System.out.println(st1);
            if(st1.equals("pi"))
            {
                str2+="3.14";
                k++;
            }
            else
            str2+=ch;
            replaceString(str, str2, len-1, k+1);

        }
}