import java.util.Scanner;

class String_Ex{
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        int l1 = s1.length();
        int l2 = s2.length();
        System.out.println("String 1 Length :"+l1);
        System.out.println("String 1 Length :"+l2);

        String s3 = s1 + s2;

        System.out.println("Result of Concatiation "+s3);

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        System.out.println("String in UpperCase :"+s1);
        System.out.println("String in UpperCase :"+s2);

        char[] arr = s1.toCharArray();
        int len = arr.length;
        System.out.println("Array Length : "+len);

        for(int i = 0; i<arr.length; i++){
            char ch = arr[i];
            if(Char.UpperCase(ch)){
                System.err.println(Char.toLowerCase(ch));
            }else{
                System.err.println(Char.toUpperCase(ch));
            }

        }

    }
}
