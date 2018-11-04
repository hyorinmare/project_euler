
public class Problem12 {
	//https://www.geeksforgeeks.org/find-divisors-natural-number-set-1/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		long nbrfact = 0;
		long iter =1;
		while(nbrfact <500) {
			nbrfact= factor(triangle(iter)) ;
			if( nbrfact >=500) {
				System.out.println(iter);
				System.out.println(triangle(iter));
			}
			iter++;
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Temps écoulé : " +(totalTime*Math.pow(10, -9) +" s"));
	}
	
	public static long factor(long a) { //rien que cette méthode sauve tout l'algo. L'algo native/bruteforce ne marche pas
		int comp = 0;
		for(int i = 1; i<Math.sqrt(a); i++) {
			if(a%i ==0) {
				if(a/i == i) {
				comp++;
				}else {
					comp+= 2;
				
			}
		}	}
		return comp;
	}
	
	public static long triangle(long a) {
		int sum = 0;
		for(int i = 0 ; i<= a; i++) {
			sum += i;
		}
		return sum;
		
	

}
}
