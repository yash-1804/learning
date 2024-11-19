package module6;

abstract class parant{
	abstract void message();
}
class FirstSubClass extends parant{

	@Override
	void message() {
	System.out.println("This is first subclass");
		
	}
	class SecondSubClass extends parant{

		@Override
		void message() {
		System.out.println("This is second subclass");
			
		}
}

public class abstractClass {

	public static void main(String[] args) {
		
		FirstSubClass obj=new FirstSubClass();
		obj.message();
	}
		
		SecondSubClass obj1=new SecondSubClass();
//		obj.message();
		

	}
}
		// TODO Auto-generated method stub

	


