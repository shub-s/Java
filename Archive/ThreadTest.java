class ChildThread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Child Thread.");
        }
    }
}
public class ThreadTest extends Thread{
    public static void main(String[] args) {
        // Getting the Reference oof current Thread.
        Thread t = Thread.currentThread();
        // Getting name of Main Thread.
        System.out.println("Current Thread : "+t.getName());
        // Set and get the name of the Main Thread.
        t.setName("Geeks");
        System.out.println("After Name Changed : "+t.getName());
        // Getting the Priority of Main Thread.
        System.out.println("Main Thread Priority : "+t.getPriority());
        //Setting and Getting the name of the Main Thread.
        t.setPriority(10);
        System.out.println("Main Thread new Priority : "+t.getPriority());
        // Creating Child Thread in Main Thread
        ChildThread ct = new ChildThread();
        // Starting Child Thread
        ct.start();

    }    
}