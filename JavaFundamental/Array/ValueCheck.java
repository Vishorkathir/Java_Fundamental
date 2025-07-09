import java.util.Scanner;
public class ValueCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = sc.nextInt();
        System.out.println("Enter the arr:  ");
        int[] arr = new int[size];
        
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the findvalue:  ");
        int findval = sc.nextInt();

        
        // int arr[] = {1,4,34,56,7};
        // int count=0;
        // for(int i:arr){
        //     if(i == findval){
        //         System.out.println(count);
        //         break;
        //     }
        //     count++;
        // }



        for(int i= 0;i<arr.length;i++){
            if(arr[i] == findval){
                System.out.println(i);
            }
            if(arr[i] != findval){
                System.out.println("-1");
            }
        }


        //  boolean flag=true;
        // for(int i= 0;i<arr.length;i++){
        //     if(arr[i] == findval){
        //         flag=false;
        //         System.out.println(i);
        //         break;
        //     }
        // }
        // if(flag){
        //         System.out.println("-1");
        //     }
    }
}