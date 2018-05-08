package oopstest.overridding;

class Parent {
	public void methodOne() {
		System.out.println("Parent version.");
	}
}

class Child extends Parent {
	private void methodOne() {
		System.out.println("Parent version.");
	}
}

public class OverridingAccessSpecifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * Lower access specifier to higher access specifier is possible in overriding.
 * But lower to higher access specifier is not possible.
 */
