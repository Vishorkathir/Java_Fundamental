import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array values:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newarr = new int[size];
        int newarrcount = 0;

        for(int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            // check current arr[i] with already stored newarr[]
            for(int j = 0; j < newarrcount; j++) {
                if(arr[i] == newarr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                newarr[newarrcount] = arr[i];
                newarrcount++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < newarrcount; i++) {
            System.out.print(newarr[i] + " ");
        }

        sc.close();
    }
}
