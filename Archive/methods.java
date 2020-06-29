public class methods {
    private static int count;
    public methods(){
        count++;
    }
 
    public static void main(String[] args) {
        for (int i=0;i<10; i++){
            methods i = new methods();
            System.out.println("Object {%d} is created"+i);
        }        
        
        System.out.println(count);
    }
}
