import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();
      
        int rev = 0;
        int num;

        while (value !=0) {
            num = value%10; // 12345%10 // 1234%10
            rev = rev*10+num; // 0*10+5  //5 // 5*10+4 //54
            value/=10; //1234 
        }
        System.out.println(rev);
        sc.close();
    }
}