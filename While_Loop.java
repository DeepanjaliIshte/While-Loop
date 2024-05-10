import java.util.Scanner;

//While loop program in java

public class While_Loop
{

	public static void main(String[] args)
	{
	int n;
	Scanner sn = new  Scanner(System.in);
		System.out.println("input an integer");
	while((n=sn.nextInt())!=0)
	{
		System.out.println("You entered : "+n);
		System.out.println("Input an integer ");
	}
	System.out.println("Out of Loop");

	}

}
