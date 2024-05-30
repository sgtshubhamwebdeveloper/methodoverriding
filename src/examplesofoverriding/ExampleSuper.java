package examplesofoverriding;

public class ExampleSuper {
	  protected String type="Snack";
	}
	class Menu extends ExampleSuper {
	  public String type="abcd";

	  public void printType() {
	    System.out.println("I am a " +type);
	    System.out.println("I am an " + super.type);
	  }
	}
	class Card {
	  public static void main(String[] args) {
	    Menu m = new Menu();
	    m.printType();
	  }
	}