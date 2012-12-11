package example;

public class A {

	private int intValue;
	private C c;


	public A() {
		intValue = 9001;
	}

	public A(int i, C c) {
		intValue = i;
		this.c = c;
	}

	public A (C c) {
		intValue = 42;
		this.c = c;
	}

	public void useC() {
		c.doStuff();
	}

	public int getInt() {
		return intValue;
	}

	public void inc() {
		intValue++;
	}
	
}
