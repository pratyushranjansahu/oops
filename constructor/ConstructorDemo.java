package oopstest.constructor;

public class ConstructorDemo {
	ConstructorDemo() {
		System.out.println("constructor");
		super(); // Compile Time Error . Call to super must be first statement
					// in constructor
	}
}

