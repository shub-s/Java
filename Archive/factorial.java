import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        int fact = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number for Factorial : ");
        int n = in.nextInt();

        for(int i = 1; i<=n; i++){            
                fact = fact * i;
                System.out.println(fact);
        }
        System.out.println("Total Factorial is "+fact);
    }
}