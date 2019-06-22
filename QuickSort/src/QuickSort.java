import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("entr the size of the array");
        int n=in.nextInt();
        int[] ar=new int[n];
        for (int i=0;i<ar.length;i++){
            ar[i]=in.nextInt();

        }
        partition_fun(ar,0, ar.length-1);
        for (Integer i:ar){
            System.out.println(i);
        }
    }
    public static void partition_fun(int[] ar,int low,int high){
        low=0;
        high=ar.length-1;
        if(low<high){
            int pivot=pivot_finder(ar,low,high);
            partition_fun(ar,low,pivot-1);
            partition_fun(ar,pivot+1,high);
        }
    }
    public static int  pivot_finder(int[] ar,int low,int high){
        int pivot=high;
        int j=low;
        for(int i=low;i<=high;i++){
            if(ar[i]<=ar[pivot]){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                j++;
            }
        }
        int temp=ar[pivot];
        ar[pivot]=ar[j];
        ar[j]=temp;
        pivot=j;
        return pivot;
    }
}
