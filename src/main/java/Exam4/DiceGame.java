package src.main.java.Exam4;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		try (Scanner input  = new Scanner(System.in)) {
			System.out.println("Enter amount of dice sides: ");
			int diceSides = input.nextInt();

			System.out.println("How many people are playing?");
			int players = input.nextInt();

			Player[] playerList = new Player[players];
			for (int i = 0; i < players; i++) {
				System.out.println("Enter player name: ");
				String name = input.next();
				Die die = new Die(diceSides);
				playerList[i] = new Player(name, die);
			}

			System.out.println("Rolling the dice for every player...");

			for (int i = 0; i < players; i++) {
				playerList[i].getDie().roll();
				System.out.println(playerList[i].getName() + " rolled a " + playerList[i].getDie().getValue() + " on a " + playerList[i].getDie().getNumSides() + " sided die.");
			}

			System.out.println(); // Newline

			int[] winnersIndexes = decideWinners(playerList);
			StringBuilder winners = new StringBuilder();
			for (int i = 0; i < winnersIndexes.length; i++) {
				if (winnersIndexes[i] != 0) winners.append(playerList[i].getName()).append(" ");
			}

			System.out.println(winners + "won the game!");
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			System.out.println("Game Over");
		}
	}

	public static int[] decideWinners(Player[] playerList) {
		int max = 0;
		int[] winnersIndexes = new int[playerList.length];

        for (Player playerList1 : playerList) {
            if (playerList1.getDie().getValue() > max) max = playerList1.getDie().getValue();
        }

		for (int i = 0; i < playerList.length; i++) {
			if (playerList[i].getDie().getValue() == max) winnersIndexes[i] = 1;
		}

		return winnersIndexes;
	}
}
