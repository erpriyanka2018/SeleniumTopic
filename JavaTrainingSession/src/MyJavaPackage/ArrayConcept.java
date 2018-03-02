package MyJavaPackage;

public class ArrayConcept {

	public static void main(String[] args) {

		
		int i [] = new int [5];
	    int j;
		
		i [0] = 10;
		i [1] = 20;
		i [2] = 30;
		i [3] = 40;
		i [4] = 50;
		
		
		System.out.println(i.length);
		
		for ( j = 0 ; j<4 ; j++)
		
		
		System.out.println(i[j]); 
		
		
		double d []= new double [2];
		
		d [1] =5.77;
		
		System.out.println(d.length);
		System.out.println(d[0]);
		
		char c [] = new char [4];
		c [0] = 'v';
		c [1] = 'b';
		c [2] = 'l' ;
		
		System.out.println(c.length);
		
		String s [] = new String [5];
		s [0] = "Hello";
		
		System.out.println(s[0]);
		System.out.println(s.length);
		
		// object class is super class where we can use different type of data in single program
		
		Object ob [] = new Object [5];
		
		ob [0] = "Tom";
		ob [1] = 'M' ;
		ob [2] = 12.33;
		ob [3] = "London";
		ob [4] = "9255244578";
		
		
		
		for (int p = 0; p<5; p++)
			
		{ System.out.print(ob [p]+ " ");
		
		}
		
		
		
		
		
		
		
	}
	}
