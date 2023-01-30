package edu.oopfirst;

import java.util.Scanner;

//Person class ; class는 객체를 생산하는 틀
class Person{  
	
	public Person()
	{
		System.out.println("난 Person 기본 생성자~");
	}
	
	public Person(String pname, int page)
	{	name = pname;
		age = page;
		
	}
	
	private String name = null; // 캡슐화 된 name 필드(상태) 생성
	
	public void setName(String pname) //공개된 setName 매서드를 생성하여 name에 접근 
	{	name = pname; }
	
	public String getName() //name을 반환하는 공개된 getName 메서드 생성 
	{	return name; }

	
	private int age = 0;  //age 필드 생성
	
	public void setAge(int page)
	{	age = page; 	}
	
	public int getAge()
	{	return age;		}
	
	
	public void talk() // talk 메서드(동작) 생성 _ 반환 값이 없으므로 void
	{ System.out.println("말하기 !! "); }
	
	public void breath()  //breath 메서드 생성
	{ System.out.println("호흡"); }
}

public class OOP0130 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String myname = null;
		int myage = 0;
		System.out.print("이름 입력 : ");
		myname = sc.nextLine();
		System.out.print("나이 입력 : ");
		myage = sc.nextInt();
		Person mansu = new Person(myname, myage);
		System.out.printf("mansu 이름 : %s\n", mansu.getName());
		System.out.printf("mansu 나이 : %d\n", mansu.getAge());
		
		
		Person dungdung = new Person("둥이", 13);
		System.out.printf("dungdung 이름 = %s\n", dungdung.getName());
		System.out.printf("dungdung 나이 = %d\n", dungdung.getAge());
		dungdung.breath();
		
		Person gildong = new Person();   //gildong 객체 생성
		//gildong.name = "고길동"
		//System.out.printf("이름 = %s\n", gildong.name);
		gildong.setName("엄길동");  //setName으로 이름 설정
		System.out.printf("gildong 이름 = %s\n", gildong.getName()); //getName으로 이름 받아오기
		
		//gildong.age = 23;
		//System.out.printf("나이 = %s\n", gildong.age);
		gildong.setAge(25);
		System.out.printf("gildong 나이 = %d\n", gildong.getAge());
		
		gildong.talk();
		gildong.breath();
	}

}
