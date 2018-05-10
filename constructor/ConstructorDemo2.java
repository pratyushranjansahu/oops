package oopstest.constructor;

public class ConstructorDemo2 {
	ConstructorDemo2() {
		super();
		this();// Compile Time Error : Call to this must be first statement in
				// constructor.
	}
}
