import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the Number");
		num=sc.nextInt();
		System.out.println("The Binary Number is "+ Integer.toBinaryString(num));
		System.out.println("The Binary Number is "+ Integer.toOctalString(num));
		System.out.println("The Binary Number is "+ Integer.toHexString(num));
			
	}

}
