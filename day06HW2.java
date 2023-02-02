package day06HW;

public class day06HW2 {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i<=9; i++) {
			if (i%2 == 0) 
				num[i] = num[i+1];
			else 
				num[i] = num[i-1]-1;
		}
		for (int k = 0; k <= 9; k++) {
			System.out.print(num[k]);
		}
		
	}

}
