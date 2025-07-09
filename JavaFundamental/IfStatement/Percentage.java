
public class Percentage {

    public static void main(String[] args) {

        String Name = args[0];
        int Age = Integer.parseInt(args[1]);

        if (Name.equals("female") && (Age >= 1 && Age <= 58)) {
            System.out.println("The percentage intrest is 8.2%");
        }else if(Name.equals("female") && (Age >=59 && Age <=100)){
            System.out.println("The Percentage intrest is 9.2%");
        }else if(Name.equals("male") && (Age >= 1 && Age <= 58)){
            System.out.println("The percentage intrest is 8.4%");
        }else if(Name.equals("male") && (Age >=59 && Age <=100)){
            System.out.println("The Percentage intrest is 10.5%");
        }else{
            System.out.println("Invalid item");
        }
    }
}
