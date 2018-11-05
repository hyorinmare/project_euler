import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BigInteger d = new BigInteger("100");
		//System.out.println(factoriel(d));
		String str = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
		//System.out.println(str.charAt(157));//158
		int sum = 0;
		for(int i = 0; i<= 157; i++) {
			sum += Character.getNumericValue(str.charAt(i));
			
		}
		System.out.println(sum);
		
		
	}
	
	public static BigInteger factoriel(BigInteger n) {
	      if (n.intValue() == 1) return BigInteger.valueOf(1);

	      return n.multiply(factoriel(n.subtract(BigInteger.valueOf(1))));
	  }

}

// en langage J problem 20 peut etre résolu par : +/"."0":!100x 

