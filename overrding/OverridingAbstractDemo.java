package oopstest.overridding;

abstract class Parent {
	public abstract void methodOne();
}

class Child extends Parent {

	@Override
	public void methodOne() {

		System.out.println("Child Version.");
	}

}

public class OverridingAbstractDemo {

	public static void main(String[] args) {

	}

}
/*Different scenario for abstract and non abstract.
 * abstract - abstract
 * non-abstract - non-abstract 
 * abstract - non-abstract
 * non-abstract - abstract
 * 
 * All are valid
 */
