package ExceptionHandling;


class A { }
class B extends A{ }

public class ExClassCast {
    public static void main(String[] args) {
        
    	A obj = new A();
        try {
        	B b = (B) obj;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
        System.out.println("Main END");
        
    }
}
