class A{
	public void show(){
		System.out.println("Class A");	
	}
	
}

class B extends A{
	public void display(){
		System.out.println("Class B");
	}
}

public class print{
	public static void main(String[] args){
		System.out.println("Main Class");
		B obj = new B();
		obj.show();
		obj.display();
	}
}