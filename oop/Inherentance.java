package oop;

class A{
    void show(){
        System.out.println("Class A");
    }
}

class B{
    public void display(){
        System.out.println("Class B");
    }
}

class Inherentance{
    public static void main(String[] args) {
        System.out.println("Inheretance In Java");
        B obj = new B();
        obj.show();
        obj.display();
    }
}