package edu.oopfirst;

import java.util.Scanner;

class Person{  
	
	public Person() //생성자
	{
		System.out.println("난 Person 기본 생성자~");
	}
	
	public Person(String name, int age)
	{	this.name = name;
		this.age = age;
	}
	
	
	private final int IQ = 140;
	
	static char blood = 'A';
	
	private String name = null; // 캡슐화 된 name 필드(상태) 생성
	
	public static void display()
	{
			System.out.printf("blood=%c\n",blood);
//			System.out.printf("name%s\n", name);    //name변수는 객체와 관련된 인스턴스 변수
	}
	
	public void setName(String name) //공개된 setName 매서드를 생성하여 name에 접근 
	{	this.name = name; }
	
	public String getName() //name을 반환하는 공개된 getName 메서드 생성 
	{	return this.name; }

	
	private int age = 0;  //age 필드 생성
	
	public void setAge(int page)
	{	age = page; 	}
	
	public int getAge()
	{	return age;		}
	
	
	public void talk() // talk 메서드(동작) 생성 _ 반환 값이 없으므로 void
	{ System.out.println("말하기 !! "); }	
	
	public void talk(String shouting) // 메서드 이름이 같지만 파라미터로 구분 
	{ System.out.printf(shouting); }
	
	public void talk(String shouting, int page) // 2번째 overloading
	{ System.out.printf("%s\t%d\n",shouting,page); }
	
	public void talk(int page, String shouting)
	{  System.out.printf("%d\t%s\n",page,shouting);  }	
	
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
		dungdung.display();
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
		gildong.talk("공부합시다잉~!\n");
		gildong.talk("길동",gildong.getAge());
		dungdung.talk(dungdung.getAge(),"둥둥이~~");
		gildong.breath();
		
	}

}
