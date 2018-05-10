package oopstest.overloading;

public class OverloadingVarArgs {
	public void methodOne(int i) {
		System.out.println("general method");
	}

	public void methodOne(int... i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		OverloadingVarArgs overloadingVarArgs = new OverloadingVarArgs();
		overloadingVarArgs.methodOne();// var-arg method
		overloadingVarArgs.methodOne(10, 20);// var-arg method
		overloadingVarArgs.methodOne(10);// general method

	}

}
/*
 * In general var-arg method will get less priority that is if no other method
 * matched then only var-arg method will get chance for execution
 */
