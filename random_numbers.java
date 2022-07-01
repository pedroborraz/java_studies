import java.util.Random;

public class random_numbers {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        int x = random.nextInt(10)+1;
        // same for double and boolean values

        System.out.println(x);

    }

}
