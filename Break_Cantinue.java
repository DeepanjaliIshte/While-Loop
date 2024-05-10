
// While loop using beak  and continue program in java


import java.util.Scanner;
public class Break_Cantinue
{

	public static void main(String[] args)
	{
		String name;
		Scanner sn=new Scanner(System.in);
		while(true)
		{
			System.out.println("Input your name : ");
			name=sn.next();
				if(name != "deepa")
				{
					System.out.println("You Entered "+name);
					System.out.println(" ");
					continue;
				}
				else
				{
					break;
				}
			}
	}

}
