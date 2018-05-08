package oopstest.overridding;

class Parent {
	public static void methodOne() {
		System.out.println("Parent Method.");
	}
}

class Child extends Parent {
	public void methodOne() {
		System.out.println("Child Method.");
	}
}

public class OverrdingWithStaticMethod {

	public static void main(String[] args) {
		Child child=new Child();
		//Compile Time Error
		/*This instance method cannot override the static method from Parent.
		ststic method can't be overridden as non static and vice versa
		*/

	}

}
