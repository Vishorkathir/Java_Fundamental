
public class Character {

    public static void main(String[] args) {

        char ch1 = args[0].charAt(0);
        char ch2 = args[1].charAt(0);

        if (ch1 < ch2) {
            System.out.println(ch1 + " , " + ch2);
        } else {
            System.out.println(ch2 + " , " + ch1);
        }

    }
}
