import java.util.Scanner;

public class whileloop {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String age = "";

        while (age.isBlank()) {
            System.out.print("Enter your age:");
            age = sc.nextLine();
        }

        sc.close();
        System.out.println("Here is your age: "+age+" years old");

    }

}
