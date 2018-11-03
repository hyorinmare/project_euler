
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] liste = new int[10000];
		int compteur = 0;
		int iter =1;
		while(compteur< 10010) {
			iter++;
			if(premier(iter) == true) {
				compteur++;
				if(compteur ==10001) {
					System.out.println(iter);
					break;
				}
		}

	}
		System.out.println(premier(44708));
		System.out.println(premier(20000));
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

//mdr j'ai réussi l'exo 3 alors que la méthode premier marchait pas 
