package edu.staticex;

public class StaticEx0127 {

	public static void main(String[] args) {
		int a = 3, b = 5, res = 0;
		res = sum(a,b);
		System.out.printf("res = %d\n", res);
		
	}//end of main()
	
	public static int sum(int pa, int pb) {
		int tot = 0;
		tot = pa + pb;
		return tot;

	}

}
