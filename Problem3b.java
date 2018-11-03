import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	long val = 600851475143L;
		int a = (int) Math.round(Math.sqrt(val));
		int[] t1 = new int[20];
		int comp = 0;
		for(int i = a ; i>2; i--) {
			if(premier(i) == 0) {
				t1[comp] = i;
				comp++;
				
			}
		}
		System.out.println(Arrays.toString(t1));
		
		System.out.println(premier(1));*/
		
		long val = 600851475143L;
		int a = (int) Math.round(Math.sqrt(val));
		
		List<Integer> list = new ArrayList<Integer>() ;
		
		for(int i = 1; i< a; i= i+2) {
			if((premier(i) == 0) && (val % i == 0)) {
				list.add(i);
			}
		}
		System.out.println(list);

	}
	
	public static int premier(int a) {
		for(int i = 3 ; i<Math.sqrt(a) +1 ; i= i+2) {
			if( a % i == 0) {
				return 1;
				
			}
			
		}
		return 0;
		
	}

}
