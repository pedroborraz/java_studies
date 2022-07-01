import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?:");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();

        System.out.println("Hello "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your favorite food is "+food);
        sc.close();

    }
}
