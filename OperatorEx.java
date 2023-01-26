
public class OperatorEx {

	public static void main(String[] args) {
		
		int a = 1;
		System.out.printf("a = %d\n", a);
		a = a+1;
		System.out.printf("a+1 결과 = %d\n", a);
		++a ;
		System.out.printf("a++ 결과 = %d\n", a);
		a++ ;
		System.out.printf("++a 결과 = %d\n", a);
		
		System.out.printf("++a 후 a = %d\n", ++a);  //더한 뒤 출력
		System.out.printf("a++ 후 a = %d\n", a++);  //출력한 뒤 더함
		System.out.printf("final a = %d\n", a);    //위에서 더해진 a 출력 
		
		int b = 9;
		System.out.printf("b = %d\n", b);
		b = b-1;
		System.out.printf("b-1 결과 = %d \n", b);
		--b ;
		System.out.printf("--b 결과 = %d\n", b);
		b-- ;
		System.out.printf("b-- 결과 = %d\n", b);
		
		int c = 8, d = 27;
		
	}

}
