import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week:");
        String day = sc.nextLine();
        sc.close();
        
        switch(day.toLowerCase()){
            case "sunday" : System.out.println("It is Sunday!");
            break;
            case "monday" : System.out.println("It is Monday!");
            break;
            case "tuesday" : System.out.println("It is Tuesday!");
            break;
            case "wednesday" : System.out.println("It is Wednesday!");
            break;
            case "thursday" : System.out.println("It is Thursday!");
            break;
            case "friday" : System.out.println("It is Friday!");
            break;
            case "saturday" : System.out.println("It is Saturday!");
            break;
            default : System.out.println("That is not a day!");
        }

    }
}
