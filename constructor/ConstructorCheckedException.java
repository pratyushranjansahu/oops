package oopstest.constructor;

class Parent {
	Parent() throws java.io.IOException {
	}
}

class Child {
	Child() throws Exception {
		super();
	}
}

public class ConstructorCheckedException {

	public static void main(String[] args) {

	}
}
/*
 * If Parent class constructor throws some checked exception compulsory Child
 * class constructor should throw the same checked exception (or) its Parent.
 */
