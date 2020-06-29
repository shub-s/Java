class array{
    public static void main(String[] args){
        String[] arr = new String[10];
        for(int i=0; i<10; i++){
            arr[i]=String.valueOf(i);
            System.out.println("Value inserted is : "+i);
        }
        System.out.println("Array Inserted Complete!");
        System.out.println("Displaying Array");
        for(int i=0; i<10; i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}