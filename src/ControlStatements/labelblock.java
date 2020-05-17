package ControlStatements;

public class labelblock {

	public static void main(String[] args) {
		int x=10;
		l1:
		{
		System.out.println("block begins" );
		
		if(x==20)
		{
			break l1;
		}
		System.out.println("block ends" );
	}
		System.out.println(" out of loop" );
}
}