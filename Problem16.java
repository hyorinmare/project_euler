import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger as = new BigInteger("2");
		as = as.pow(1000);
		System.out.println(as);
		
		String str = "10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376";
		System.out.println(str.length());
		System.out.println(str.charAt(301));
		int sum = 0;
		for(int i =0; i<302 ; i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println(sum);
		//long a = Math.pow(2, 1000);
		//System.out.println(a);
		
		


	}

}
