
public class day01_prob3 {

	public static void main(String[] args) {

		byte var1=127;
		short var2=128;
		int var3=128;
		long var4=128L;
		var4 = var1;
		System.out.println(var1+ ", " + var2);
		var1 = (byte)var3;
		System.out.println(var1+ ", " + var3);

		float var5=(float)123456.789123;
		double var6=123456.789123;
		var5 =(float)var6;
		System.out.println(var5+ ", " + var6);
		var6 = var5;
		System.out.println(var5+ ", " + var6);
	}
}

