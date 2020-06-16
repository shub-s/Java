public class poly{
    int add(int i, int j){
        return "Addition of "+i+ " and "+j+ " is "+(i+j);
    }
    public static void main(String[] args) {
        poly a = new poly();
        String display = a.add(10,20);
        System.out.println(display);
    }
}