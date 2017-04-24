import java.util.InputMismatchException;
import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		
		SwapNumbers obj = new SwapNumbers();
		
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter the value of a: ");
			int a = scanner.nextInt();
			System.out.print("Enter the value of b: ");
			int b = scanner.nextInt();
			obj.swapNum(a, b);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only integer values");
		}
			
		scanner.close();		
		
	}
	
	private void swapNum(int x, int y)
	{
		System.out.println("value of a and b before swapping, a: " + x + " b: " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("value of a and b after swapping, a: " + x + " b: " + y);
	}

}
