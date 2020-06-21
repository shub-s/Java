class printer extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Priting Document/s "+i);
            try {Thread.sleep(100); } catch (Exception e) {}  
        }
    }
}

class display extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Documents Display #"+i);
            try {Thread.sleep(100); } catch (Exception e) {}  
        }
    }
}

class Threads{
    public static void main(String[] args) {
        printer p = new printer();
        display d = new display();
        p.start();
        try {Thread.sleep(10); } catch (Exception e) {}        
        d.start();
        
    }
}