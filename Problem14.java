
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long max =0;
		long temp =0;
		long start = 0;
		for(long i = 1; i<1000000; i++) {
			temp =collatz(i,0);
			if (temp > max) {
				max = temp;
				start = i;
				
			}
			
		}
		System.out.println("variable départ =" + start + " longueur chaine =" + max );
	}
	
/*	public static int cottaz(int a) {
		int compt = 0 ;  
		while(a!= 1) {
			if(a%2 ==0) {
				a = a/2;
			}else 
			{ a  = 3 * a +1;
			}
			compt ++;
		}
		return compt+1;
	}*/
/*	public static int collatz(int a) {
		int compteur =0;
		if( a== 1) {
			return compteur;
		} else if(a%2==0) {collatz(a/2); compteur++;}
		else {collatz(3*a +1) ; compteur ++;
	}

}*/
/*	public static int collatz(int a , int b) {
		b++;
		if(a==1) {
			return b;
		}
		else if (a%2 == 0) { 
			collatz(a/2 , b); }
		else {
			collatz(3*a +1,b );}
		return b;
		
	}*/
	
    public static long collatz(long n, long b) {
    	b++;
        //System.out.println(n + " " + b );
        if (n == 1) return b;
        else if (n % 2 == 0) return collatz(n / 2 , b);
        else return collatz(3*n + 1 , b);

    }
	}
//difficulté : récusivité pour collatz au lieu d'un truc itérative(trop long) + utiliser des long
