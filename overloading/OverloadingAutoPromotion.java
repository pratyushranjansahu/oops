package oopstest.overloading;

public class OverloadingAutoPromotion {
	public void methodOne(int i) {
		System.out.println("int-arg method");
	}

	public void methodOne(float f) // overloaded methods
	{
		System.out.println("float-arg method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingAutoPromotion overLoadingAutoPromotion = new OverloadingAutoPromotion();
		overLoadingAutoPromotion.methodOne('p');// int-arg method
		overLoadingAutoPromotion.methodOne(101);// int-arg method
		// overLoadingAutoPromotion.methodOne(10.5);//Compile Time Error
	}
}
/*
 * In method overloading compiler promotes the argument to the next level and
 * checks whether the matched method is available or not if it is available then
 * that method will be considered if it is not available then compiler promotes
 * the argument once again to the next level. This process will be continued
 * until all possible promotions still if the matched method is not available
 * then we will get compile time error. This process is called automatic
 * promotion in overloading.
 */
