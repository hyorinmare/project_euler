
public class tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "9009";
		StringBuffer str2 = new StringBuffer();
		
		
		for(int i = str1.length() -1; i>= 0; i--) {
			
			str2.append(str1.charAt(i));
			
		}
		if(str2.toString().equals(str1.toString())) {
			System.out.println("true");
		} else {
System.out.println("false");		}

	}

}
