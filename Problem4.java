import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number = -782;
		//String numberAsString = Integer.toString(number);
		//System.out.println(numberAsString);
		int a = 900;
		int b = 900;
		int c =0 ;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(a<=999) {
			b= 900;
			while(b<=999) {
				c = a*b ;
				if(palindrome(c)) {
					list.add(c);
					
				}
				b++;
			}
			a++;
			
		}
		System.out.println(list);
		
		
		

	}
	
	public static boolean palindrome(int a) {
		String str1 = Integer.toString(a);
		StringBuffer str2 = new StringBuffer();
		
		
		for(int i = str1.length() -1; i>= 0; i--) {
			
			str2.append(str1.charAt(i));
			
		}
		
		if(str2.toString().equals(str1.toString())) {
			return true;
		} else {
			return false;
		}
		
		
		
		
	}

}
