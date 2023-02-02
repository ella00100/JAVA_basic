package ksk.edu.MultithreadExample4_zero;

public class MultithreadExample4_zero {	
	public static void main(String[] args) {
		CalcThread th1 = new CalcThread();
        PrintThread th2 = new PrintThread();
        SharedArea obj = new SharedArea();
        th1.sharedArea = obj;
        th2.sharedArea = obj;
        th1.start();
        th2.start();
	}
}
