package module6;

public class multipleDemon {

	public static void main(String[] args) {
		
		try {
			int a[]=new int [5];
			System.out.println(a[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds Exception occurs");
		}
		catch(Exception e) {
			System.out.println("parent Exception occurs");
			
		}
		System.out.println("rest of the code ");
		// TODO Auto-generated method stub

	}

}
