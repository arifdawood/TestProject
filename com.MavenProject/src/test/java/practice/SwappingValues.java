package practice;

public class SwappingValues {

	public static void main(String[] args) {
	int a = 10, b=20;
	
	System.out.println("Before swap = "+ a + " - " + b);
	
	int t = a;
	a = b;
	b = t;
	System.out.println("After swap = "+ a + " - " + b);
	
	}

}
