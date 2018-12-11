import java.util.Scanner;

public class WhileLoopPractice {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer greater than 1: ");
		int number = input.nextInt();
		int count = 0;
	
		while (number < 1)
		{
			System.out.println("Please enter an integer greater than 1: ");
			number = input.nextInt();
		}

		while (number < 100)
		{
			number = number * 2;
			count += 1;
		}
		System.out.println("Your loop ran " + count + " times");

	}

}
