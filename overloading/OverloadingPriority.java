package oopstest.overloading;

public class OverloadingPriority {
	public void methodOne(Object object) {
		System.out.println("Object Version.");
	}

	public void methodOne(String str) {
		System.out.println("String Version.");
	}

	public static void main(String[] args) {
		OverloadingPriority overloadingPriority = new OverloadingPriority();
		overloadingPriority.methodOne(new Object());// Object Version.
		overloadingPriority.methodOne("Pratyush");// String Version.
		overloadingPriority.methodOne(null);// String Version.
	}

}
/*
 * While resolving overloaded methods exact match will always get high priority,
 * While resolving overloaded methods child class will get the more priority
 * than parent class
 */