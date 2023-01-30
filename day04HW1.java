package edu.oopfirst;

import java.util.Scanner;

public class day04HW1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[6];
		int input[] = new int[6];
		
		for (int i = 0; i<=5; i++) {
			System.out.print("로또번호 입력 : ");
			input[i] = sc.nextInt();
			num[i] = input[i];
			for (int k = 0; k<i; k++) {
				if(input[i] == num[k]) {
					System.out.print("같은 번호가 있습니다!\n");
					i--;
				}		
			}
		}
		System.out.printf("입력된 로또번호 :\t%d \t", num[0]);
		for (int j = 1; j<= 5; j++) {
			System.out.printf("%d \t", num[j]);
		}
	}
}
