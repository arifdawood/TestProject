package practice;

public class StringBuilder_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Selenium";
		StringBuffer sbuf = new StringBuffer(s);
		StringBuilder s2 = new StringBuilder(s);
		
		System.out.println(sbuf.reverse());
		System.out.println(s2.reverse());
		
	}

}
