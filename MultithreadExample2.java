
public class MultithreadExample2 {
	public static void main(String args[]) {
        Thread thread1 = new DigitThread();
        Thread thread2 = new DigitThread();
        Thread thread3 = new AlphabetThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
