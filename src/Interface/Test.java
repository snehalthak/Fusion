package Interface;

public class Test {
int b =10;    //  global variable / instance
static int c = 20;  // static variable
 
	public static void main(String[] args) {
		System.out.println("Hi.......");
		System.out.println(c);
		Test aa = new Test();
		aa.print();
	}
	
	
	public void print() {
		int a = 10;    //local variable
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}

}
