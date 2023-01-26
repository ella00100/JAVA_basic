package edu.inha.scanner;

import java.util.Scanner;

public class day02_prob5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자를 입력하세요 : ");
		char c = sc.next().charAt(0);
		int upper_count = (int)'A' - (int)'a';
		int C = (int)c + upper_count;
		System.out.printf("%s의 대문자는 %s입니다.", c, (char)C);

	}

}
