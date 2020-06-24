package _12_badgers;

public class Main {
	
	/*
	 * Use for loops (you will need more than one) to print the following lyrics from the 
	 * Badger Song. You can only use the words “Badger”, “Mushroom” and “Snake” once each in your code.
	 *
	 *	Print 2 verses of the song as follows:
	 *	----
	 *	Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger, Badger, Badger
	 *	Mushroom, Mushroom
	 *	
	 *	Badger, Badger, Badger,Badger, Badger, Badger, Badger,Badger, Badger, Badger, Badger, Badger
	 *	Mushroom, Mushroom
	 *	
	 *	A Snake!!!
	 *	----
	 */
	
	public static void main(String[] args)
	{
		
		/*
		System.out.println("Badger Badger Badger Badger, "
				+ "Badger, Badger, Badger, Badger, "
				+ "Badger, Badger,Badger, Badger,"
				+ "Badger, Badger, Badger\n" + 
				" Mushroom, Mushroom\n" + 
				" \n" + 
				" Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger, Badger, Badger, Badger\n" + 
				" Mushroom, Mushroom\n" + 
				" \n" + 
				" A Snake!!!");
		*/
		// HINT: surround the existing loops within another loop.
		
		
		//---
		for(int j = 0; j < 2; j++)
		{
			
			for(int i = 0; i < 15; i++)
			{
				System.out.print("BADGER,");
				
				//Modulus! A lesson for another day.
				if( i % 4 == 0)
				{
					System.out.println();
				}
				
			}
			
			System.out.println();
			
			for(int i = 0; i < 2; i++)
			{
				System.out.print("MUSHROOM, ");
			}
			
			
			System.out.println();
		}
	}
}















