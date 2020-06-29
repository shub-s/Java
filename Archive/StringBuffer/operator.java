import java.util.Scanner;
class operator{
    public static void main(String[] args) {                
        // Input for the current time and action
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Current Hours : ");
        int hh = in.nextInt();
        System.out.println("Enter the Action : ");
        String action = in.next();

        //Condition for the Greetings
        if(hh >= 00 && hh < 12){
            System.out.println("Good Morning");
        }else if(hh >= 12 && hh <= 16){
            System.out.println("Good Afternoon");
        }else if(hh > 16 && hh <=12){
            if(action.equals("Sleeping")){
                System.out.println("Good Night");
            }else{
                System.out.println("Good Evening");
            }
        }
    }
}