import java.util.Scanner;

public class Assignment_4a {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Lines");
			int	num = sc.nextInt();
		for (int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if((i+j)>=num+1)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
				}
			}	
			System.out.println(" ");	
		}
	}
}