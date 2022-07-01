public class swap_variables {

    public static void main(String[] args) {
        String x = "Potato";
        String y = "Carrot";
        String temp;

        temp = x;
        x = y;
        y = temp;
        
        System.out.println("x:"+x);
        System.out.println("y:"+y);

    }
}