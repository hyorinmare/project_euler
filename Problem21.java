import java.util.ArrayList;
import java.util.Arrays;

public class Problem21 {
	
/*	Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
	If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

	For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

	Evaluate the sum of all the amicable numbers under 10000.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(factor(284));
		long sum =0l;

		for(int i = 3; i<=10000; i++) {
			int a = somme(factor(i));
			int b = somme(factor(a));
			if(i == b && i !=a){
				System.out.println(i);
				System.out.println(a);
				//System.out.println(b);
				System.out.println("     ");

				sum+= i;
				System.out.println("somme : " +sum);
				System.out.println("     ");
				




			}
		}
		System.out.println(sum);

		
		

	}
	
	public static int somme(ArrayList<Integer> a) {
		int sum = 0;
		for(int i = 0; i<a.size(); i++) {
			sum += a.get(i);
		}
		return sum;
		
	}
	
	public static ArrayList<Integer> factor(int a) {
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for(int i = 2; i<Math.sqrt(a); i++) {
			if(a%i ==0) {
				if(a/i == i) {
				b.add(i);
				}else {
				b.add(i);
				b.add(a/i);	
			}
		}	}
		b.add(1);
		return b;
	}

}
