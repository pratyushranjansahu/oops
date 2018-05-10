package oopstest.overloading;

public class OverloadingSibling {
	public void methodOne(String s) {
		System.out.println("String version");
	}

	public void methodOne(StringBuffer s) {
		System.out.println("StringBuffer version");
	}

	public static void main(String[] args) {
		OverloadingSibling overloadingSibling = new OverloadingSibling();
		overloadingSibling.methodOne("arun");// String version
		overloadingSibling.methodOne(new StringBuffer("sai"));// StringBuffer version
		// overloadingSibling.methodOne(null);//CE : reference to m1() is ambiguous

	}
}
/*
 * There is no relation between String and StringBuffer . so we will get compile
 * time error while on commenting overloadingSibling.methodOne(null) .
 */
