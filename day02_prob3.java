package edu.inha.scanner;

import java.util.Scanner; 

public class day02_prob3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		int r = sc.nextInt();
		System.out.print("원기둥의 높이는? ");
		int h = sc.nextInt();
		double volume = 3.14*r*r*h;
		System.out.printf("원기둥의 부피는 %.1f", volume);
	}

}
