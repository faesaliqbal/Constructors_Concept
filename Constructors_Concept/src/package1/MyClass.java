package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructor is called when you create an object using the new key word.
		Vehicle v1 = new Vehicle(); //This will set the vehicle color to red.
		Vehicle v2 = new Vehicle("blue"); //this will call the constructor which will set the color attribute to blue.
		
		/*
		 * Important Note
		 * Java automatically provides a default constructor, so all classes have a constructor, whether one is specifically defined or not.
		 */
	}

}
