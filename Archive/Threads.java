class MultithreadingDemo extends Thread{
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception is Cought.");
        }
    }
}

public class Threads{
    public static void main(String[] args) {
        for(int i=0; i<8; i++){
            MultithreadingDemo obj = new MultithreadingDemo();
            obj.start();
        }
    }
}