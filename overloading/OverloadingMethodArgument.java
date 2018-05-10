package oopstest.overloading;

public class OverloadingMethodArgument {
	public void methodOne(int i,float f) {
		System.out.println("int-float method");
		}
		public void methodOne(float f,int i) {
		System.out.println("float-int method");
		}
	public static void main(String[] args) {
		OverloadingMethodArgument overloadingMethodArgument=new OverloadingMethodArgument();
		overloadingMethodArgument.methodOne(10,10.5f);//int-float method
		overloadingMethodArgument.methodOne(10.5f,10);//float-int method
		//overloadingMethodArgument.methodOne(10,10); //Compile Time Error 
		//overloadingMethodArgument.methodOne(10.5f,10.5f);//Compile Time Error

	}

}
