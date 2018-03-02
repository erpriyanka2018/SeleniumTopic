package MyJavaPackage;

public class DemoInheritance {

	
		   int num = 20;

		   // display method of superclass
		   public void display() {
		      System.out.println("This is the display method of superclass");
		   }
		}

final class Sub_class extends DemoInheritance {
		   int num = 10;

		   // display method of sub class
		   public void display() {
		      System.out.println("This is the display method of subclass");
		   }

		   public  void mainMethod() {
		      // Instantiating subclass
		      Sub_class sub = new Sub_class();

		      // Invoking the display() method of sub class
		      sub.display();

		      // Invoking the display() method of superclass
		      super.display();

		      // printing the value of variable num of subclass
		      System.out.println("value of the variable named num in sub class:"+ sub.num);

		      // printing the value of variable num of superclass
		      System.out.println("value of the variable named num in super class:"+ super.num);
		   }

		  public static void main ( String[] args) {
		      Sub_class obj = new Sub_class();
		      obj.mainMethod();
		   }
		
		 }
