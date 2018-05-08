package oopstest.overridding;
class Parent{
	public final void methodOne(){
		System.out.println("Parent Version.");
	}
}
class Child extends Parent{
	public void methodOne(){
		System.out.println("Child Version.");
	}
}
public class OverrideFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*Compile Time Error :  Cannot override the final method from Parent*/