public class math_class {
    
    public static void main(String[] args) {
        
        double x = 5.25;
        double y = -14.5;

        double max = Math.max(x, y);
        double min = Math.min(x, y);
        double abs = Math.abs(y);
        double sqrt = Math.sqrt(x);
        double round = Math.round(x);
        double ceil = Math.ceil(x);
        double floor = Math.floor(x);

        System.out.println(max+"\n"+min+"\n"+abs+"\n"+sqrt+"\n"+round+"\n"+ceil+"\n"+floor);

    }

}
