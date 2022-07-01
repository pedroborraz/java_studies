import java.util.Scanner;

public class if_statement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.close();

        if (age==60) {
            System.out.println("You are old");
            } else if (age>=18){
                System.out.println("You are an adult");
        } else if (age>=13){
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a child");
        }

    }

}
