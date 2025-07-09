
public class LowtoUp{
    public static void main(String[] args) {
        
        char char1 = args[0].charAt(0);

        if ('a' <= char1 && char1 <= 'z'){
            System.out.println((char)(char1 - 32));
        }else if('A' <= char1 && 'Z' >=char1){
            System.out.println((char) (char1 + 32));
        }else{
            System.out.println("Invalid");
        }
        

    }
}