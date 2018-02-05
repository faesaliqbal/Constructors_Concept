package package1;

public class Vehicle {
	private String color;
	
	/*
	 * Constructors are special methods invoked when an object is created and are used to initialize them.
	 * A constructor can be used to provide initial values for object attributes.
	 * A constructor name must be same as its class name.
	 * A constructor must have no explicit return type.
	 */
	
	//This is a constructor for our class.
	//Whenever an object of this class is created. the color attribute will be set to red.
	Vehicle(){
		color = "red";
	}
		
	//A constructor can also take parameters to initialize attributes
	Vehicle(String c){
		this.setColor(c);
	}

		
	/*
	 * A single class can have multiple constructors with different number of parameters.
	 * The setter methods inside the constructors can be used to set the attributes values.
	 */

		
	//Setter
	public void setColor(String c){
		this.color = c;
	}

}
