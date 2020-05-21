import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        int a,b;
        java.util.Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value for a: ");
        a = in.nextInt();
        System.out.print("Enter the Value for a: ");
        b = in.nextInt();
        int c = a + b;
        System.out.print("Addition of "+a+" and "+b+" is: "+c);
    }
}