package edu.oopfirst;

import java.util.Scanner;

class Car{
	private int velocity = 0;
	private int number = 0;
	private String name = null;
	private String color = null;
	private String address = null;
	
	public void setVelocity(int pv) 
	{	velocity = pv; }
	public int getVelocity() 
	{	return velocity; }
	
	public void setNumber(int pn) 
	{	number = pn; }
	public int getNumber() 
	{	return number; }
	
	public void setName(String pname) 
	{	name = pname; }
	public String getName() 
	{	return name; }
	
	public void setColor(String pc) 
	{	color = pc; }
	public String getColor() 
	{	return color; }
	
	public void setAddress(String pa) 
	{	address = pa; }
	public String getAddress() 
	{	return address; }
	
}

public class day04HW2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car user = new Car();
				
		System.out.print("차 이름을 입력하시오. : ");
		String iname = sc.nextLine();
		user.setName(iname);
		
		System.out.print("차 색을 입력하시오. : ");
		String ic = sc.nextLine();
		user.setColor(ic);
		
		System.out.print("차량 번호를 입력하시오. : ");
		int in = sc.nextInt();
		user.setNumber(in);
		
		String x = sc.nextLine();
		
		System.out.print("운전자 주소를 입력하시오. : ");
		String ia = sc.nextLine();
		user.setAddress(ia);
		
		System.out.print("속도를 입력하시오. : ");
		int iv = sc.nextInt();
		user.setVelocity(iv);
		
		System.out.printf("\n차 이름 : %s\n", user.getName());
		System.out.printf("차 색 : %s\n", user.getColor());
		System.out.printf("차량 번호 : %d\n", user.getNumber());
		System.out.printf("운전자 주소 : %s\n", user.getAddress());
		System.out.printf("속도 : %d\n", user.getVelocity());
		
	}

}
