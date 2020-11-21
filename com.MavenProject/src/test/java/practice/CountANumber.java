package practice;

public class CountANumber {

	public static void main(String[] args) {
	
		int num = 123494859;
		int cnt = 0;
		
		while(num!=0) {
			num = num/10;
			cnt = cnt+1;
		}
		System.out.println(cnt);
		

	}

}
