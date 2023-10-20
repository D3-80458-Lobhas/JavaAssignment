
public class Assignment_4b
{

public static void main(String[] args)
    {

        int number = 7;
        int i, j;

        for (i = 1; i <= number; i++)
        {

            for (j = 1; j <= number - i; j++)
            {
                System.out.print(" ");
            }

            for (j = 1; j <= i * 2 - 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for (i = number - 1; i > 0; i--)
        {

            for (j = 1; j <= number - i; j++)
            {
                System.out.print(" ");
            }

            for (j = 1; j <= i * 2 - 1; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}

