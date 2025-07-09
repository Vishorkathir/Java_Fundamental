import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = Sc.nextInt();
        int original = num;
        int rev = 0;
        int newnum;

        while(num != 0){
            newnum = num %10;
            rev= rev * 10+newnum;
            num= num/10;  
        }
        if(original == rev){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }
        Sc.close();

    }
}