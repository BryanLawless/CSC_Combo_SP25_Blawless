package Inheritance;

public class Pig extends Animal {
	private final String color;

	public Pig(int height, int weight, String name, String color) {
		super(height, weight, name);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public void animalSound() {
		System.out.println("The pig makes a sound: Oink!");
	}

	@Override
	public String toString() {
		return super.toString() + " Pig [color=" + color + "]";
	}
}
