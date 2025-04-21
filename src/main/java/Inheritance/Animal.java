package Inheritance;

public class Animal {
	private final int height;
	private final int weight;
	private final String name;

	public Animal(int height, int weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void animalSound() {
		System.out.println("The animal makes a sound: Bleeeearch");
	}

	@Override
	public String toString() {
		return "Animal [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}
}
