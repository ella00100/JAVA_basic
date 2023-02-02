package day06HW;

import java.util.Scanner;

class Car{
	
	protected int velocity = 0;
	protected int number = 0;
	protected String name = null;
	protected String color = null;
	protected String address = null;
	
	public void show() {
		System.out.printf("\n현재 속도 : %d\n",velocity);
		System.out.printf("차량 이름 : %s\n", name);
		System.out.printf("차량 번호 : %s\n", number);
		System.out.printf("차량 색깔 : %s\n", color);
		System.out.printf("운전자 주소 : %s\n", address);
	}
	
	public Car(int velocity, int number, String name, String color, String address) {
		this.velocity = velocity;
		this.number = number;
		this.name = name;
		this.color = color;
		this.address = address;
	}
	
	public void setVelocity(int velocity) 
	{	this.velocity = velocity; }
	public int getVelocity() 
	{	return velocity; }
	
	public void setNumber(int number) 
	{	this.number = number; }
	public int getNumber() 
	{	return number; }
	
	public void setName(String name) 
	{	this.name = name; }
	public String getName() 
	{	return name; }
	
	public void setColor(String color) 
	{	this.color = color; }
	public String getColor() 
	{	return color; }
	
	public void setAddress(String address) 
	{	this.address = address; }
	public String getAddress() 
	{	return address; }
}

class LentCar extends Car{
	
	protected int fare = 0;
	protected String comp = null;
	
	public LentCar(String name, String color, int number, String address, int velocity, 
				   int fare, String comp) {
		super(velocity, number, name, color, address);
		this.fare = fare;
		this.comp = comp;
	}

	public void setFare(int fare)
	{	this.fare = fare; }
	public int getFare()
	{	return fare; }
	
	public void setComp(String comp)
	{	this.comp = comp;}
	public String getComp()
	{	return comp; }
	
	public void show() {
		System.out.printf("\n현재 속도 : %d\n",velocity);
		System.out.printf("차량 이름 : %s\n", name);
		System.out.printf("차량 번호 : %s\n", number);
		System.out.printf("차량 색깔 : %s\n", color);
		System.out.printf("운전자 주소 : %s\n", address);
		System.out.printf("렌트요금 : %d\n", fare);
		System.out.printf("렌트회사명 : %s\n", comp);
	}
}

public class day06HW1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("차량 이름을 입력하세요 : ");
		String iname = sc.nextLine();
		System.out.print("차량 색깔을 입력하세요 : ");
		String ic = sc.nextLine();
		System.out.print("차량 번호를 입력하세요 : ");
		int in = sc.nextInt();
		String x = sc.nextLine();
		System.out.print("운전자 주소를 입력하세요 : ");
		String ia = sc.nextLine();
		System.out.print("현재 속도를 입력하세요 : ");
		int iv = sc.nextInt();
		System.out.print("렌트비를 입력하세요 : ");
		int ifare = sc.nextInt();
		String z = sc.nextLine();
		System.out.print("렌트회사를 입력하시오 : ");
		String icomp = sc.nextLine();
		
		LentCar user = new LentCar(iname, ic, in, ia, iv, ifare, icomp);
		user.show();
		
		System.out.print("속도를 얼마나 올리시겠습니까 : ");
		int upcount = sc.nextInt();
		int sumv = iv + upcount;
		user.setVelocity(sumv);
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h 입니다.\n", user.getVelocity());
		
		System.out.print("속도를 얼마나 내리시겠습니까 : ");
		int downcount = sc.nextInt();
		user.setVelocity(sumv-downcount);
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h 입니다.\n", user.getVelocity());
	

	}

}
