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
import java.util.Scanner;

public class MainApplication {
	
	static int PARK_SIZE = 15; // park capacity
	static DogPark dogPark = new DogPark(PARK_SIZE); // create dog park
	
	
	public static void main(String[] args) {
		
		
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

		while (true) {
			menu();
		}
		

	}
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("\nWelcome to Elbi Dog Park!\n");
		
		System.out.println("[1] Add dog to park");
		System.out.println("[2] Show list of current dogs");
		System.out.println("[3] Start dog play interaction");
		System.out.println("[0] Exit park");
		
		System.out.print("\nEnter choice: ");
		
		choice = sc.nextInt();
		
		switch(choice) {
			
		case 1: // add dog to park
			if (Dog.population < 15)
			{
				String dogName, dogBreed;
				int dogAge;
				System.out.println("Enter dog name: ");
				dogName = sc.next();
				System.out.println("Enter dog age: ");
				dogAge = sc.nextInt();
				System.out.println("Enter dog breed: ");
				dogBreed = sc.next();
				Dog new_dog = new Dog(dogName, dogAge, dogBreed);
				dogPark.dogs[Dog.population-1] = new_dog;
			} else {
				System.out.println("The Park is full! Cannot add any more dogs");
			}
			break;
		
		case 2: // show list of current dogs
			dogPark.displayDogs(); // show all dogs
			break;
			
		case 3: // make dogs play
			dogPark.play(); // dogs play in pairs
			break;
			
		case 0: // exit
			System.out.println("You have exited the dog park.");
			sc.close();
			System.exit(0);
			
		default: // base case
			System.out.println("Invalid input!");
		}
	}
}


