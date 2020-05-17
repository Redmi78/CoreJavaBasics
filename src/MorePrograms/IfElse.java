package MorePrograms;

public class IfElse {

	public static void main(String[] args) {
		
		String choice= "checkbalance";
		
		if(choice.equals("check balance"))
		{
			System.out.println(" check balance" );
		}
		else if (choice.equals("change pin"))
				{
			System.out.println(" change pin" );
	}
		else if (choice.equals("deposit"))
		{
	System.out.println(" depoist" );
}
		else if (choice.equals("withdraw"))
		{
	System.out.println(" withdraw ");
}
		else
		{
			System.out.println("timeout");
		}
	}

}
