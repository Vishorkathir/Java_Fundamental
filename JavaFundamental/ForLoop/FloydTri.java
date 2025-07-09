import java.util.Scanner;
public class FloydTri{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        int input = sc.nextInt();
        int count = 1;

        for(int i = 0 ;i<input;i++){
            for(int j = 0;j<=i;j++){
                
                System.out.print(count+" ");
                count++;
            }
        System.out.println();
        }
    }
}