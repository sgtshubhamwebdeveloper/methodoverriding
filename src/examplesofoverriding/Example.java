package examplesofoverriding;

public class Example {
	   public void disp() {
		      System.out.println("I am Hundai");
		   }
		}
		class Myexample extends Example {
		   public void displayInfo() {
		      super.disp();
		      System.out.println("I am a Cretta");
		   }
		} 
		class New {
		   public static void main(String[] args) {
		      Example e = new Example();
		      e.disp();
		   }
		}