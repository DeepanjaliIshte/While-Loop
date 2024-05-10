import java.util.Scanner;

public class Break 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sn  =new Scanner(System.in);
		while(true)
		{
			System.out.println("Input an integer");
			n=sn.nextInt();
			if(n==0)
			break;
			{
				System.out.println("You Entered ="+n);
			}
		}
	}
}

