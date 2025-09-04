/************************************************************
 * This class represents a dog park where dog objects can be stored,
 * displayed, and play together in random pairs.
 * 
 * @author Evan C. Gregorio
 * @date_created 04/09/2025 14:18
 * 
 ************************************************************/

package mainpackage;
import java.util.Random;

public class DogPark {
	
	Random rand = new Random(); // random int generator
	int dogCount;
	int size; // park size
	Dog[] dogs; // array of dog objects
	
	static int population = 0;
	
	// constructor
	DogPark(int size) {
		
		this.dogs = new Dog[size];
	}
	
	// print all dogs in console
	void displayDogs() {
		if (Dog.population == 0) {
			System.out.println("There are currently no dogs in the park.");
			return;
		} else {
			System.out.println("-------------------");
			System.out.println("Dogs in the park:");
			System.out.println("-------------------");
			for (int i = 0; i < Dog.population; i++) {
				System.out.print((i+1) + ". ");
				System.out.println(this.dogs[i].name + " is " + this.dogs[i].age + 
						" year(s) old, and the breed is " + this.dogs[i].breed);
			}
			System.out.println("Total no. of dogs: " + Dog.population);
		}
	}
	
	// make dogs play in random order
	void play() {
        System.out.println();
        System.out.println("Dogs are playing in pairs...");
        if (Dog.population < 2) {
            System.out.println("Not enough dogs to play.");
            return;
        }

        // make index array
        int[] indexes = new int[Dog.population];
        for (int i = 0; i < Dog.population; i++) {
            indexes[i] = i;
        }

        // shuffle the indexes
        for (int i = 0; i < Dog.population; i++) {
            int j = rand.nextInt(Dog.population);
            int temp = indexes[i];
            indexes[i] = indexes[j];
            indexes[j] = temp;
        }

        // make pairs
        int i = 0;
        while (i + 1 < Dog.population) {
            Dog d1 = this.dogs[indexes[i]];
            Dog d2 = this.dogs[indexes[i + 1]];
            d1.play(d2); // method is in Dog.java
            i += 2;
        }

        // if size odd, last one is unpaired
        if (Dog.population % 2 != 0) {
            Dog lastDog = this.dogs[indexes[Dog.population - 1]];
            System.out.println("Dog " + lastDog.name + " does not have anyone to play with.");
        }
    }
}

