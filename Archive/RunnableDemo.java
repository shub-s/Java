class ThreadRunnable implements Runnable{
    public void run(){
        try {
            System.out.println("Runnable Thread Object : "+Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception is Cought.");
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        for(int i=0; i<8; i++){
            Thread obj = new Thread(new ThreadRunnable());
            obj.start();
        }
    }
    
}