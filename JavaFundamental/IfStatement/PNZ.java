public class PNZ{
    public static void main(String[] args) {
        
        int num1=Integer.parseInt(args[0]);

        if(num1 > 0){
            System.out.println(num1+ " is Positive Number");
        }else if(num1 < 0){
            System.out.println(num1 + " is Negative Number");
        }else{
            System.out.println(num1 + " is Zero");
        }
    }
}