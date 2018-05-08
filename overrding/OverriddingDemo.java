package oopstest.overridding;

class Parent {
	public void goingToSchool() {
		System.out.println("Parent Version.");
	}
}

class Child extends Parent {
	public void goingToSchool() {
		System.out.println("Child Version.");
	}
}

public class OverriddingDemo {

	public static void main(String[] args) {
		Parent parent=new Parent();
		parent.goingToSchool();//Parent Version.
		
		Child child=new Child();
		child.goingToSchool();//Child Version.
		
		Parent parent2=new Child();
		parent2.goingToSchool();//Child Version.
		/* In method overriding method resolution is always taking care by JVM at run time.*/
	}

}
