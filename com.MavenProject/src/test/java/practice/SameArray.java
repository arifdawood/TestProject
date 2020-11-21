package practice;

public class SameArray {

	public static void main(String[] args) {
		int[] first =  {2,4,6,8,10};
		int[] second = {2,4,6,8,11};
				
		if (verifyArray(first, second)) {
			System.out.println("Same array");
		} else {
			System.out.println("Different array");
		}
	}

	public static boolean verifyArray(int[] first, int[] second) {
		if(first.length != second.length) {
			return false;
		}
		
		for (int i = 0; i<first.length; i++) {
			if(first[i] != second[i]) {
				return false;
			}
		}
		
		return true;
	}

}
