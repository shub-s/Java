public class StringDemo{
    public static void main(String[] args) {
        String _hasdhasd;
            add obj = new add();
            obj.addNum();
        }
    }

class add extends Thread{
    public void addNum(){
        for(int i = 0; i<10; i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}