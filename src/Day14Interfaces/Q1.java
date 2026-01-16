package Day14Interfaces;

class Person{
	public void showRole() {
		System.out.println("I am a person");
	}
}

class Student extends Person{
	public void showRole() {
		System.out.println("I am a Student");
	}
}

class Teacher extends Person{
	public void showRole() {
		System.out.println("I am a Teacher");
	}
}

interface Sports{
	void play();
}

interface Cultural{
	void perform();
}

class CollegeStudent extends Student implements Sports, Cultural {
	@Override
	public void perform() {
		System.out.println("Cultural Student Performing");
	}

	@Override
	public void play() {
		System.out.println("Sports Student Playing");
	}
	
}
public class Q1 {
	public static void main(String[] args) {
		Person p =new CollegeStudent();
		Sports s =new CollegeStudent();
		Cultural c =new CollegeStudent();
		CollegeStudent cs =new CollegeStudent();
		
		System.out.println("Person");
		p.showRole();
//		p.play();
//		p.perform();
		
		
		System.out.println();
		System.out.println("Sports");
		s.play();
		
		System.out.println();
		System.out.println("Cultural");
		
		c.perform();
		
		System.out.println();
		System.out.println("College Student");
		cs.showRole();
		cs.play();
		cs.perform();
		
	}
}


//1. Create a base class Person with method:
//	showRole() → prints "I am a person"
//
//2. Create two child classes:
//	Student extends Person
//	Teacher extends Person
//
//3. Create two interfaces:
//	Sports → method play()
//	Cultural → method perform()
//
//4. Create a class CollegeStudent that:
//	Extends Student
//	Implements both Sports and Cultural
//
//5. In main():
//	Create object of CollegeStudent
//	Call all methods