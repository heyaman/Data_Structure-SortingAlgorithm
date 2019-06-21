import java.util.Scanner;

public class Selection {

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

        for(int i=0;i< arr.length-1;i++){
           int small=i+1;
           for(int j=i+1;j<arr.length;j++){
               if(arr[small]>arr[j]){
                  small=j;
               }

            }

           if(arr[small]<arr[i]){
               int temp=arr[small];
               arr[small]=arr[i];
               arr[i]=temp;
           }

        }

        for (Integer i:arr){
            System.out.println(i);
        }


    }
}
