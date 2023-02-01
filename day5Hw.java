package edu.ihr;

import java.util.Scanner;

class Car{
	protected int velocity = 0;
	protected int number = 0;
	protected String name = null;
	protected String color = null;
	protected String address = null;
	
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
	private int fare;
	private String comp;
	
	public void setFare(int fare)
	{	this.fare = fare; }
	public int getFare()
	{	return fare; }
	
	public void setComp(String comp)
	{	this.comp = comp;}
	public String getComp()
	{	return comp; }
		
}


public class day5Hw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LentCar user = new LentCar();
				
		System.out.print("자동차종류 입력하시오. : ");
		String iname = sc.nextLine();
		user.setName(iname);
		
		System.out.print("자동차색깔 입력하시오. : ");
		String ic = sc.nextLine();
		user.setColor(ic);
		
		System.out.print("자동차번호 입력하시오. : ");
		int in = sc.nextInt();
		user.setNumber(in);
		
		String x = sc.nextLine();
		
		System.out.print("운전자주소 입력하시오. : ");
		String ia = sc.nextLine();
		user.setAddress(ia);
		
		System.out.print("자동차속도 입력하시오. : ");
		int iv = sc.nextInt();
		user.setVelocity(iv);
		
		System.out.print("렌트비를 입력하시오 : ");
		int ifare = sc.nextInt();
		user.setFare(ifare);
		
		System.out.print("렌트회사를 입력하시오 : ");
		String icomp = sc.nextLine();
		user.setComp(icomp);
		
		System.out.printf("\n자동차종류 : %s\n", user.getName());
		System.out.printf("자동차색깔 : %s\n", user.getColor());
		System.out.printf("자동차번호 : %d\n", user.getNumber());
		System.out.printf("운전자주소 : %s\n", user.getAddress());
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h 입니다.\n", user.getVelocity());
		System.out.printf("렌트요금 : %d\n", user.getFare());
		System.out.printf("렌트회사명 : %s\n", user.getComp());
		
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
