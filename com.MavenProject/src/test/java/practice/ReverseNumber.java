package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 1234;
		int rev = 0;
		/*while(num!=0) {
			// moduler will be remaining which is last digit
			rev = rev * 10 + num%10;
			num = num / 10;
		}*/
		
		// StringBuffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		System.out.println(sb.reverse());

	}

}
