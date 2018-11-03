
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a = 2mn
		// b = m^2 - n^2 
		// c = m^2 + n^2
		// n = (500- m^2) / m
		// m!= 0 
		// https://www.youtube.com/watch?v=n6vL2KiWrD4
		
		int m =24 ;
		int c;
		int b;
		int a = b = c = 0; 
		
		while((a + b + c != 1000)  ) {
			int n = (500 - m*m)/ m ; // domaine de défininition de (-inf, -23)U(0,24)
			 a = 2*m*n ;
			 b = m*m - n*n ;
			 c = m*m + n *n ;
			 m--;
			 if(a+b+c == 1000) {
				
				 System.out.println("a =" + a + " b = " + b + " c = "+ c);
			 System.out.println(a*b*c);
			 }
			
			 
		}

	}

}
