package oopstest.overridding;
class Parent{
	public void methodOne(){
		System.out.println("Parent Version");
	}
}
class Child extends Parent{
	public void methodOne()throws Exception{
		System.out.println("Child Version");
	}
}
public class OverridingCheckedExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*Compile Time error : Exception Exception is not compatible with throws clause in Parent.methodOne()
 * If child class Overriding method throws any checked Exception , then Parent class Overridden method should
 * throw the same Checked Exception or its Parent otherwise we will get compile time error. 
 *  
 * 
 * */
 */