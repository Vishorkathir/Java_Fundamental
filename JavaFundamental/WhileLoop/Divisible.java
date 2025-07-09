// import java.util.Scanner;

public class Divisible{
    public static void main(String[] args) {
        
        int count = 0;
        int num = 1;

        while(count<5){
            if(num%2 == 0 && num%3==0 && num%5==0){
                System.out.println(num);
                count ++;
            }
            num ++;
        }
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value : ");
        // int num = sc.nextInt();

        // if(num%2==0){
        //     System.out.println("It is divisible by 2");
        // }
        // if(num%3==0){
        //     System.out.println("It is divisible by 3");
        // }
        // if(num%5==0){
        //     System.out.println("It is divisible by 5");
        // }

    }
}