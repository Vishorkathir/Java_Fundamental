public class DataType{
    public static void main(String[] args) {
        
        char Alphabetic = args[0].charAt(0);

        if((Alphabetic >= 'a' && Alphabetic <='z') || (Alphabetic >='A' && Alphabetic <='Z')) {
            System.out.println("It is Alphabetic");
        }else if((Alphabetic >= '0' && Alphabetic <= '9')){
            System.out.println("It is Digit");
        }else {
            System.out.println("It is Special Character");
        }
    }
}