class Pen {

	void show() {
		System.out.println("1");
	}
}

class xyz extends Pen {

	void show() {
		System.out.println("2");
	}

	public static void main(String arg[]) {
		Pen t = new Pen();
		t.show();

		xyz ob = new xyz();
		ob.show();
	}
}