
public class day01_print {

public static void main(String[] args) {

		System.out.print("Hi");
		System.out.print("dungdung \n");
		
		System.out.println("Hello, JAVA");
		System.out.println("dung");
		
		System.out.printf("decimical num : %d \n", 7);
		
		int a = 5;
		System.out.printf("a = %d \n", a);
		
		double dv = 6.24;
		System.out.printf("%f \n", dv);
		
		float fv = (float)3.14;
		System.out.printf("%f \n", fv);
		System.out.printf("fv_01 = %f \n", fv);
		System.out.printf("fv_02 = %.2f \n", fv);
		System.out.printf("fv_03 = %07.2f \n", fv);
		System.out.printf("fv_04 = %7.2f \n", fv);
		System.out.printf("fv_05 = %-7.2f \n", fv);
		
		char ch = 'A';
		System.out.printf("ch = %c \n", ch);
		System.out.printf("ch = %d \n", (int)ch);
		
		String name = "dung";
		System.out.printf("name = %s \n", name);
		System.out.printf("name = " + name + "\n");

		final double PI = 3.14;
		//PI = 3.14; 상수는 수정 불가...ERROR
		System.out.printf("PI = %.2f \n", PI);
		
		int	s = 15 / 2;
		int p = 13 % 4;
		System.out.printf("s = %d, p = %d\n", s,p);
		
	}

}
