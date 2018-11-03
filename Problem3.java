import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1; i<100; i= i+2) {
			System.out.println(i);
		}*/
		
		/*int[] t1 = new int[10];
		for(int i =0 ; i<10 ; i++) {
			t1[i] = i;
		}
		System.out.println(Arrays.toString(t1));*/
		
		long val = 600851475143L;
		int a = (int) Math.round(Math.sqrt(val));
		//System.out.println(a);
		int b = a/2;
		int[] t1 = new int[b+5];
		int comp = 0;
		for(int i= 3 ; i<a; i = i+2 ) {
			
			t1[comp] = i;
			comp ++;
		}
		//System.out.println(Arrays.toString(t1));
		//System.out.println(t1.length);
		
		int [] t2 = new int[b+5];
		for( int aa = 0 ; aa<t1.length; aa++ ) {
			for(int aaa = aa + 1 ; aaa<t1.length; aaa++) {
				if((t1[aaa]%t1[aa] != 0)) {
					t2[aaa] = t1[aaa];
				}else {
					t2[aaa] = 0;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(t2));
		
		/*t1[5] = t1[6];
		System.out.println(t1[5]);
		System.out.println(t1[6]);*/
		

		
		
		
		
		
	}

}
