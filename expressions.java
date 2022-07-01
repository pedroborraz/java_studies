public class expressions {

    public static void main(String[] args) {

        int num = 20;

        num = num++; // num = 21
        num = num--; // num = 20
        num = num + num; //num = 40
        num = num - (num/2); // num = 20
        num = num * num; // num = 400
        num = num / num; // num = 1
        num = num % num; // num = 0

        System.out.println("num = " + num);

    }
    
}
