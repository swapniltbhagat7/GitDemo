
public class StaticDemo {
 /*Static Block is executed before Main method
	This is due to the fact that the class has to be loaded 
	into the main memory before its usage, 
	and static block is executed 
	during the loading of the class.
	*/
	static {
		System.out.println("Static Block");
	}
	public static void main(String[] args) {
		
		System.out.println("Main Block");
	}

}
