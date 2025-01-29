import java.util.Scanner;

public class InteractiveGreeter {
  public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
          System.out.println("What is your name? ");
          String name = input.nextLine();

		System.out.println("Where are you from? ");
		String location = input.nextLine();

		System.out.println("How old are you? ");
		int age = input.nextInt();

		System.out.println("Hello " + name + " from " + location + ". You are " + age + " years old.");
		  
		input.nextLine(); // Consume newline character (kinda hacky)

		System.out.println("Whats something you like to do? ");
		String hobby = input.nextLine();

		System.out.println("Have fun the next time you " + hobby + "!");

		System.out.println("How much would you like to donate today? ");
		double donation = input.nextDouble();
		
		System.out.printf("You will donate $%.2f today. Yay!%n", donation);
      }
  }
}