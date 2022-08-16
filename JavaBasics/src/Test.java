class xyz {
	void show() {
		System.out.println("xyz");
	}

}

public class Test extends xyz  {

	void show(int a) {
		System.out.println("Test");
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.show('5');
		xyz ob = new xyz();
		ob.show();

	}

}
