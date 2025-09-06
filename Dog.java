/************************************************************
 * This class represents a dog with attributes name,
 * age, and breed. It also defines (prints) how dogs play with 
 * each other inside the dog park.
 * 
 * @author Evan C. Gregorio
 * @date_created 04/09/2025 14:18
 * 
 ************************************************************/

package mainpackage;
import java.util.Random;

public class Dog {
	Random rand = new Random();
	String name;
	int age;
	String breed;
	static int population = 0; // total dogs created
	Dog dog; // dog this dog is playing with
	
	// dog breed constants
	final static String BORDER_COLLIE = "Border Collie";
	final static String CHOW_CHOW = "Chow Chow";
	final static String GOLDEN_RETRIEVER = "Golden Retriever";
	final static String LABRADOR_RETRIEVER = "Labrador Retriever";
	final static String POMERANIAN = "Pomeranian";
	final static String POODLE = "Poodle";
	final static String SHIH_TZU = "Shih Tzu";
	final static String SIBERIAN_HUSKY = "Siberian Husky";
	
	Dog(String name, int age, String breed) { // dog constructor
		this.name = name;
		this.age = age;
		this.breed = breed;
		population++;
	}
	
	void play(Dog d) { // method to make dog play with other dog
		this.dog = d;
		System.out.println("Dog " + this.name + " is playing with Dog " + d.name + "!");
		
	}
}
