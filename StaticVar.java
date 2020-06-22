public class StaticVar {
    private static int a = 10;
    static {System.out.println(a);}
    public static void main(String[] args) {
        System.out.println("This will print next");
    }
    
}