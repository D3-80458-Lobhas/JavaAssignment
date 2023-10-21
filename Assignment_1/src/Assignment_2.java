import java.util.Scanner;

public class Assignment_2
{

public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First No");
		if (sc.hasNextDouble())
		{
			double num1 = sc.nextDouble();
			{
				System.out.println("Enter the Second No");
				if (sc.hasNextDouble())
				{
					double num2 = sc.nextDouble();
					double average = (num1 + num2) / 2;
					System.out.println("The Average is :" + average);
				}
				else
				{
					System.out.println("The No is not double");
				}
			}
		}
		else
			System.out.println("The No is not double");
	}
}
