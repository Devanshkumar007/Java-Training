package Day12_Polymorphism;

class Level1{
	int level1 = 10;
}
class Level2 extends Level1{
	int level2 = 20;
}
class Level3 extends Level2{
	int level3 = 30;
}
class Level4 extends Level3{
	int level4 = 40;
}


public class UpAndDownCastingExample {
	public static void main(String[] args) {
		System.out.println("Upcasting--- Level1 obj = new Level4();");
		Level1 obj = new Level4();
		System.out.println("Access to members of Level 1 "+obj.level1);
		
		System.out.println("Downcasting to level 2 --- Level2 obj2 = (Level2) obj;");
		Level2 obj2 = (Level2) obj;
		System.out.println("Access to members of Level 1 & Level 2 "+ obj2.level1 +" "+obj2.level2);
		
		System.out.println("Downcasting to level 3 --- Level3 obj3 = (Level3) obj;");
		Level3 obj3 = (Level3) obj;
		System.out.println("Access to members of Level 1, Level 2 & Level 3 "+ obj3.level1 +" "+obj3.level2+" "+obj3.level3);
		
		System.out.println("Downcasting to level 4 --- Level4 obj4 = (Level4) obj;");
		Level4 obj4 = (Level4) obj;
		System.out.println("Access to members of Level 1, Level 2, Level 3 & Level 4 "+ obj4.level1 +" "+obj4.level2 + " "+ obj4.level3+" "+obj4.level4);
		
	}
}
