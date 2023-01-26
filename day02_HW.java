package day02_HW;

import java.util.Scanner;

public class day02_HW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요!!\n");
		String name = sc.nextLine();

		System.out.print("학과명을 입력하세요!!\n");
		String subject = sc.nextLine();
		
		System.out.print("영어 점수 입력: ");
		int english = sc.nextInt();
		
		System.out.print("물리학 점수 입력: ");
		int physics = sc.nextInt();
		
		System.out.print("미적분학 점수 입력: ");
		int diff = sc.nextInt();
		
		int sum = english + physics + diff;
		double mid = sum/3.0;
		
		String a = sc.nextLine();
		
		System.out.print("주소를 입력하세요!!\n");
		String address = sc.nextLine();
		
		System.out.printf("이름 = %s, 학과명 = %s \n영어 = %d, 물리학 = %d, 미적분학 = %d \n총점 = %d, 평균 = %.1f\n주소 = %s", name, subject,english,physics,diff,sum,mid,address);
		
	}

}
