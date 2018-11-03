
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sum = 0; 

		for(int i = 1; i< 2000000; i++) {
			if(premier(i)) {
				sum = sum + i;
			}
		}
		System.out.println("somme =" +sum);

	}
	
	public static boolean premier(int a) {
		if(a ==1) {
			return false;
		}
		else if (a == 2 ) {
			return true;
		}
		else if (a%2==0) {
			return false;
		}
		
		else {
		for(int i = 3 ; i<Math.sqrt(a) +1 ; i= i+2) {
			if( a % i == 0) {
				return false;
				
			}
	}
		}
		return true;
		

}

}
