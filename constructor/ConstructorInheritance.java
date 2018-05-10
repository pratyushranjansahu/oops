package oopstest.constructor;

class Parent {
	public Parent(int n) {
		System.out.println("Parent Constructor.");
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Child Constructor.");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
/*
 * If the Parent class contains any argument constructors while writing Child
 * classes we should takes special care with respect to constructors.
 * 
 * Whenever we are writing any argument constructor it is highly recommended to
 * write no argument constructor also.
 */