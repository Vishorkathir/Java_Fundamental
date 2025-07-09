public class ColorCode{
    public static void main(String[] args) {
        

        char Char1 = args[0].charAt(0);

        switch (Char1) {
            case 'G' :
                System.out.println("Green");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'M':
                System.out.println("Invalid code");
                break;
            case 'R':
                System.out.println("Red");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                throw new AssertionError();
        }
    }
}