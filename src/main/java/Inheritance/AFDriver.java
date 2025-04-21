package Inheritance;

import java.util.ArrayList;

public class AFDriver {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();

		Animal animal = new Animal(70, 200, "Annie");
		animal.animalSound();
		animals.add(animal);

		Animal pig = new Pig(30, 150, "Peter", "pink");
		pig.animalSound();
		animals.add(pig);

		Animal cow = new Cow(100, 1200, "Cleo");
		cow.animalSound();
		animals.add(cow);

		System.out.println("Bryan's Animal Farm");
		prettyPrint(animals);
	}

	public static void prettyPrint(ArrayList<Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal.getName() + ":");
			System.out.println("Height: " + animal.getHeight());
			System.out.println("Weight: " + animal.getHeight());

			if (animal instanceof Pig pig) System.out.println("Color: " + pig.getColor());
			animal.animalSound();

			System.out.println();
		}
	}
}
