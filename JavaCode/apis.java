import java.util.*;

class apis{
    public static void main(String[] args){
        for(char j=97; j<=102; j++){
            System.out.println(String.valueOf(j).toUpperCase());
        }
        //Creating Arrays and Playing with it
        int [] numbers = {6,9,1};
        Arrays.sort(numbers);
        System.out.println(numbers);
        // Normal For Loop
        System.out.println("Normal For Loop");
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]+" ");
        }
        //Enhanced for loop
        System.out.println("Enhanced for loop");
        String[] strings = {"10","9","100"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string+" ");
        }

    }
}