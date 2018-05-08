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
/*Compile Time Error :  Cannot override the final method from Parent
Parent Final method we can't override with non final, but parent class
Non final method we can override as final method.

Different cscenario for final and non-final method
final - final : Compile Time Error
final - non-final : Compile Time Error
non-final - final : Valid

*/
