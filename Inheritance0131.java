package edu.inheri;


class Person{  
	
	public Person() 
	{
		System.out.println("난 Person 기본 생성자~");
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

class Man extends Person
{
	private int money;
	private String job;
	
	public Man()
	{ System.out.println("나는 man의 기본생성자~"); }

	public void show()
	{	System.out.printf("name = %s\n", name);
		System.out.printf("money = %s\n", money);
		
	}
	public void work()
	{  System.out.printf("%s이 일한다\n", this.name);  }
}

public class Inheritance0131 {

	public static void main(String[] args) {
		Person chulsu = new Person();
		chulsu.name = "철수";
		System.out.printf("chulsu.name = %s\n", chulsu.name);
		
		Man wonbin = new Man();
		wonbin.setName("원빈");
		wonbin.work();
		System.out.printf("wonbin.name=%s\n", wonbin.getName());
		
	
	}
}


