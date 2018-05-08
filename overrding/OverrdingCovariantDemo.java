package oopstest.overridding;

class Parent {
	public Object methodOne() {
		System.out.println("Parent Version");
		return null;
	}
}

class Child extends Parent {
	public String methodOne() {
		System.out.println("Child Version");
		return null;
	}
}

public class OverrdingCovariantDemo {

	public static void main(String[] args) {

	}

}
/*
 * Child class method return type need not be same as Parent class method return
 * type, Its child type also allowed. For example In the above program Parent
 * has method with Object return type but child has override that method with
 * String return type.(Object is Parent for String)
 */
