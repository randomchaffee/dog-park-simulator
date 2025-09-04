/************************************************************
 * This program implements a java application for a dog park.
 * It creates dog instances, adds them to the park, display
 * and also makes them play in pairs.
 * 
 * @author Evan C. Gregorio
 * @date_created 04/09/2025 14:18
 * 
 ************************************************************/

package mainpackage;

public class MainApplication {
	public static void main(String[] args) {
		final int PARK_SIZE = 5; // park capacity
		DogPark dogPark = new DogPark(PARK_SIZE); // create dog park
		
		// dog instances then add to park	
		Dog d1 = new Dog("Pochi", 10, Dog.SHIH_TZU);
		dogPark.dogs[Dog.population-1] = d1;
		Dog d2 = new Dog("Momo", 5, Dog.LABRADOR_RETRIEVER);
		dogPark.dogs[Dog.population-1] = d2;
		Dog d3 = new Dog("Luna", 7, Dog.BORDER_COLLIE);
		dogPark.dogs[Dog.population-1] = d3;
		Dog d4 = new Dog("Jake", 4, Dog.GOLDEN_RETRIEVER);
		dogPark.dogs[Dog.population-1] = d4;
		Dog d5 = new Dog("Buddy", 4, Dog.POMERANIAN);
		dogPark.dogs[Dog.population-1] = d5;
		
		dogPark.displayDogs(); // show all dogs
		dogPark.play(); // dogs play in pairs
		

	}
}
