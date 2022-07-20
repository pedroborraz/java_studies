import java.util.Scanner;

public class logicaloperators {
    public static void main(String[] args) {
        
        int temp = 25;

        if (temp>30) {
            System.out.println("It is hot outside");
        }else if (temp>=20 && temp<=30) {
            System.out.println("It is warm outside");
        }else {
            System.out.println("It is cold outside");
        }
        
        Scanner sc = new Scanner(System.in);

        System.out.println("To kill press q or Q!");
        String kill = sc.nextLine();

        if (kill.equals("Q") || kill.equals("q")) {
            System.out.println("You quit");
        }else{
            System.out.println("You stay here");
        }

        //or 

        if (!kill.equals("Q") && !kill.equals("q")) {
            System.out.println("You stay here");
        }else{
            System.out.println("You quit");
        }
        sc.close();

    }
}
