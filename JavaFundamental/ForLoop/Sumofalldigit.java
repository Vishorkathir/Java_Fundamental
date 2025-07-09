import java.util.Scanner;
public class Sumofalldigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int value1 = sc.nextInt();
        int sum = 0;
         int digit;
        
        for(;value1!=0;value1/=10){
            digit = value1 % 10;
            sum+=digit;
        }
System.out.println(sum);

        // while(value1!=0) {
        //     int Digit = value1 % 10; //1234  //4
        //     sum +=Digit;
// value1/=10;


            
        // }
        
    sc.close();
    }
}