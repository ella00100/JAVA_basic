package edu.forex;

public class gugudan {

	public static void main(String[] args) {
		for (int count = 2; count <= 9; count+=4) {
			for (int column = 1; column <= 9; ++column) {
				for (int row = count; row <4+count; ++row) {
					int res = row*column;
					System.out.printf("%d * %d = %d\t", row, column, res);
				}System.out.print("\n");
			}System.out.println();
		}	
	}
}

