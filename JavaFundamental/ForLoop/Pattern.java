import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=rows - i -1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // int count =0;

        // for (int i = 1; i <= rows; i++) {
        //     // Print spaces for centering
        //     for (int j = rows; j >= i; j--) {
        //         System.out.print(" ");
        //     }
        //     // Print stars
        //     for (int k = 1; k <= i; k++,count++) {
        //         System.out.print( "*");
        //     }
        //     System.out.println(); // Move to the next line
        // }
        sc.close();
    }
}