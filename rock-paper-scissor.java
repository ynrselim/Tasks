import java.util.Scanner;

public class IEEE_task2 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String user1 = TakingName(console, "User1"); // Taking name from 1st user
		String user2 = TakingName(console, "User2"); // Taking name from 2nd user

		int score1 = 0; // Score of 1st user
		int score2 = 0; // Score of 2nd user

		while ((score1 != 3) && (score2 != 3)) { // Checking a situation not to get score than 3
			int status1 = choices(console, user1); // Taking his/her choice from 1st user
			int status2 = choices(console, user2); // Taking his/her choice from 2nd user

			if (status1 == 1 && status2 == 2) { // From 19th line to 35th line, checking their scores
				score2 += 1;
			} else if (status1 == 1 && status2 == 3) {
				score1 += 1;
			} else if (status1 == 2 && status2 == 1) {
				score1 += 1;
			} else if (status1 == 2 && status2 == 3) {
				score2 += 1;
			} else if (status1 == 3 && status2 == 1) {
				score2 += 1;
			} else if (status1 == 3 && status2 == 2) {
				score1 += 1;
			} else if (status1 == status2) {
				System.out.println("Both of users chose same option !!!");
				score1 += 0;
				score2 += 0;
			}

			System.out.println(user1.toUpperCase() + " : " + score1); // Writing score of user1
			System.out.println(user2.toUpperCase() + " : " + score2); // Writing score of user2
		}
		if (score1 > score2) {
			System.out.println("Winner is " + user1.toUpperCase() + "!!!!"); // Saying that user1 is winner
		} else if (score1 < score2) {
			System.out.println("Winner is " + user2.toUpperCase() + "!!!!"); // Saying that user2 is winner
		}

	}

	public static String TakingName(Scanner console, String namee) { // Method that determines users' nickname
		System.out.println(namee + " please type your nickname");
		String name = console.nextLine();
		return name;
	}

	public static int choices(Scanner console, String name) { // Method that determines users' choices
		System.out.println("1 = Rock");
		System.out.println("2 = Paper");
		System.out.println("3 = Scissors");
		System.out.println("Please type your choice " + name.toUpperCase());
		int choice = console.nextInt();
		if ((choice != 1) && (choice != 2) && (choice != 3)) { // Checking if his/her choice is equal to 1,2,3 or not
			System.out.println("The number that you type is not acceptable!!. Please try again!!");
			System.out.println("Please type a number 1,2 or 3 !!");
			int choice1 = console.nextInt();
			return choice1;
		}

		return choice;
	}
}
