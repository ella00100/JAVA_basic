package edu.Interface;

interface Ivehicle{
	//int makeYear = 2022;      //상수
	//final int makeYear = 2022;
	//public final int makeYear = 2022;
	public static final int makeYear = 2022;
	
	//void start();			//추상 메서드
	//abstract void start();
	public abstract void start();
	
	default public void stop() //디폴트 메서드 
	{ System.out.println("정지한다"); }
	
	private void show()	//비공개 메서드 
	{ System.out.println("makeYear = " + makeYear); }
	
	public static void turn()
	{ System.out.println("방향 전환한다"); }
	
	static class Price{     //정적 클래스 
		int salePercent = 10;
	}
}

class Car implements Ivehicle{
	@Override
	public void start() {
		System.out.println("Car가 출발한다");
	}
}
public class InterfaceOne0201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
