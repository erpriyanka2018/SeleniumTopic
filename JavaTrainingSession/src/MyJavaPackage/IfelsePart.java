package MyJavaPackage;

public class IfelsePart {

	public static void main(String[] args) {

		
		int a = 40;
		int b = 60;
		
		
		
		if (a<b) {
			
			System.out.println("a is greater than b");
			
		}
			
			else 
			{
				System.out.println(" b is greater than a");
		}
			
		
		int p = 70;
		int u = 80;
		
		if (p==u) {
			
			System.out.println("p equal to u");
		}
		else
			
		{
			System.out.println(" p not equal to u");
		}
	
		//nested if else
		
		int o = 200;
		int l = 300;
		int y = 500;
		
		if (o>l & l>y ) 
		{
			System.out.println("o is highest");
		}
		
		else if (l>o & l>y)
		{
			System.out.println("l is highest");
		}
		else
			System.out.println("c is highest");
		
	}
	
	
	
	
	
	

}
