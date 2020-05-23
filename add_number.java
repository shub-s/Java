import java.util.*;
import java.util.Scanner;

class add_number{
    public static void print(Object msg){
        System.out.println(String.valueOf(msg));
    }
    public static void main(String[] args) {
        int a,b;
        java.util.Scanner in = new Scanner(System.in);
        print("Enter the Value for a: ");
        a = in.nextInt();
        print("Enter the Value for a: ");
        b = in.nextInt();
        int c = a + b;
        print("Addition of "+a+" and "+b+" is: "+c);
        in.close();
    }
}