package ThreadProg;
class NewThread implements Runnable {
    Thread t;
    NewThread(){
        t = new Thread(this,"Demo Thread");
        System.out.println("Child Thread : "+t);
        t.start(); // Start the threads
    }
    @Override
    public void run() {
        try {
            for (int i=0; i<5; i++){
                System.out.println(i+"Child Running...");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}

public class SampleThread {
    public static void main(String[] args) {
        new NewThread(); // Create a new Thread
        try {
            for (int i=0; i<5; i++){
                System.out.println(i+"Main Running...");
                Thread.sleep(100);
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println();
    }
}
