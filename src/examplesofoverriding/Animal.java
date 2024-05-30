package examplesofoverriding;

public class Animal  {
	   public void display() {
		      System.out.println("I am an animal.");
		   }
		}
	class Cow extends Animal {
		   @Override
		   public void display() {
		      System.out.println("I am a Cow.");
		   }
		}
	class Main { 
		   public static void main(String[] args) {
		      Cow c = new Cow();
		      c.display();
		   }
		}