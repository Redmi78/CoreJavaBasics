package ControlStatements;

public class IterateStatements {

	public static void main(String[] args) {
//while
		int a= 5;
		while(a<=10)
		{
			System.out.println("while loop" + " " + a);
			a++;
		}
		
		// do while
		do
		{
			System.out.println("do while inside loop");
		}while(a<10);
		//for loop
		for(a=9;a<=10;a++)
		{
		
			System.out.println(" for loop " + " " + a);
	}
		//break
		for(a=6;a<=10;a++)
		{
			if(a==7)
			{
				System.out.println(" inside for loop"  + " "+a);
				break;
			}
			
		}
		System.out.println(" out of loop" );
		
		//Continue
		for(int i =0;i<=5;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println("continue"  + " " + i );
			
		}
	}
}
