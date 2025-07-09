public class Oddoreven{
    public static void main(String[] args) {
        
        int num= Integer.parseInt(args[0]);

        System.out.println((num % 2==0)? "It is Even Number" : "It is Odd Number");
    }
}