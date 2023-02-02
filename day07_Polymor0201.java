package edu.polymor;

abstract class Mammal{
	public Mammal()
	{ System.out.println("난 Mammal의 기본 생성자~"); }
	
	public void show() 
	{ System.out.println("난 Mammal의 show!"); }
	public void talk() {}
	
	abstract public void moving();
}
	
class Person extends Mammal{  
	
	public Person() 
	{ System.out.println("난 Person 기본 생성자~"); }
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected final int IQ = 140;	
	static char blood = 'A';
	protected String	name = null;
	protected int age = 0;  
	
	public static void display()
	{
			System.out.printf("blood=%c\n",blood);
	}
	
	public void setName(String name) //공개된 setName 매서드를 생성하여 name에 접근 
	{	this.name = name; }
	
	public String getName() //name을 반환하는 공개된 getName 메서드 생성 
	{	return this.name; }
	
	public void setAge(int page)
	{	age = page; 	}
	
	public int getAge()
	{	return age;		}
	
	
	public void talk() // talk 메서드(동작) 생성 _ 반환 값이 없으므로 void
	{ System.out.println("talk 메서드"); }	
	
	
	public void breath()  //breath 메서드 생성
	{ System.out.println("호흡"); }
	
	public void show() 
	{ 	super.show();
		System.out.println("난 person의 show!");
		System.out.printf("name = %s,\t age = %d\n", name, age);
	}
	
	public void moving() {
		System.out.println("Person이 움직인다");
	}
}

class Man extends Person
{	
	final int IQ = 150;
	
	public Man()
	{ System.out.println("나는 man의 기본생성자~"); }
	
	public Man(String name, int age, int money, String job) {
		super(name, age);
		this.money = money;
		this.job = job;
		System.out.println("나는 매개변수 4개인 man의 기본생성자~");
	}

	private int money;
	private String job;
	
	public void setMoney(int money) {
		this.money  = money;
	}
	public int getMoney() {
		return money;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	public void show()
	{	
		super.show();
		System.out.println("난 man의 show!");
		System.out.printf("money = %s,\t job = %s\n", money, job);
		System.out.printf("자식IQ = %d\t 부모IQ = %d\n",IQ, super.IQ);	
	}
	public void work()
	{  System.out.printf("%s이 일한다\n", this.name);  }
	
	public void moving()
	{	System.out.println("Man이 움직인다");   }
	
}

public class Polymor0201 {

	public static void main(String[] args) {
		Man jaesuck = new Man ("유재석", 51, 70000, "국민 MC");
//		Person  jaesuck = new Man("유재석",51,70000,"국민 MC");
//		Mammal jaesuck = new Man("유재석",51,70000,"국민 MC");
		jaesuck.show();    //Person타입으로 설정하여 man의 메서드인 show실행 불가
		jaesuck.talk();
		jaesuck.moving();
		

	}
}

