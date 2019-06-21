import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("entr the size of array");
        int n=in.nextInt();
//        declaring array
        int[] arr=new int[n];
//        taking input
        System.out.println("entr the value of the array : ");

        for (int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }

//        sorting mechanism using insertion algorithm

        for(int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }


       for (Integer i:arr){
           System.out.println(i);
       }

    }
}
