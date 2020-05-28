package oop;

class A{
    void show(){
        System.out.println("This is Class A");
    }
}
class  B extends A{
    void show(){
        System.out.println("This is Class B");
    }
}

class C extends B{
    void show(){
        System.out.println("This is Class C");
    }
}
public class apps {
    public static void main(String[] args) {
        System.out.println("Hellow World");
        C obj = new C();
        obj.show();

    }
}
