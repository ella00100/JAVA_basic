package edu.oopfirst;





public class OOPEx2 {
	public static void main (String[] args) {
		
		//int val[] = new int[] {10, 20, 30};
		
		int val[] = new int[3];
		val[0] = 10; val[1] = 20; val[2] = 30;
		for (int i = 0; i<=2; i++) {
			System.out.printf("val[%d] = %d\n", i, val[i]);
		}
		
		int num[] = {1,2,3};
		for (int j= 0; j<=2; j++) { 
			System.out.printf("num[%d] = %d\n", j, num[j]);}
	}

}
