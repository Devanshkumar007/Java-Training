package ExceptionHandling;

class Node{
	int value;
	Node next;
	Node(int value, Node next){
		this.value =value;
		this.next=next;
	}
}


public class ExNullPointer {
	public static void main(String[] args) {
		//handle nullpointer exception
		Node n1 = new Node(10,null);
		Node temp = n1 ;
		try {
		while(true) {
			System.out.println(temp.value);
			temp=temp.next;
		}
		}catch(Exception e) {
//			System.out.println(); 
			e.printStackTrace();
		}
		finally {
			System.out.println("finally eexecuted");
		}
	}
}


//handle classcast exception
