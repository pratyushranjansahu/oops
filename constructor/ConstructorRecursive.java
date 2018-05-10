package oopstest.constructor;

public class ConstructorRecursive {
	ConstructorRecursive() {
		this(10);
	}

	ConstructorRecursive(int n) {
		this();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/* Compile Time Error : Recursive constructor invocation */
