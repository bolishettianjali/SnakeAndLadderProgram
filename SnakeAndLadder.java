public class SnakeAndLadder{
	static int NO_PLAY = 0;
	static int LADDER = 1;
	static int SNAKE = 2;
	static int count;

	public static void main(String[] args) {
		int player1 = 0;
		int player2 = 0;
		while (player1 < 100 && player2 < 100) {
			count++;
			player1 = game(player1, "player-1");
			player2 = game(player2, "player-2");
		}
		if (player1 == 100) {
			System.out.println("player-1 won the match and position is : " + player1);
		} else if (player2 == 100) {
			System.out.println("player-2 won the match and position is : " + player2);
		}
		System.out.println("No.of times the dice rolled:" + count);
	}

	public static int game(int player_Position, String player) {
		System.out.println("\n" + player + " TURN: ");
		System.out.println(player + " Present position: " + player_Position);
		int dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		if (option == NO_PLAY) {
			System.out.println("No play position remains same: " + player_Position);
		} else if (option == LADDER) {
			int temp = player_Position;
			player_Position = dice + player_Position;
			if (player_Position > 100) {
				player_Position = temp;
				System.out.println("you got higher than required, position remains same: " + player_Position);
			} else {
				System.out.println("you got ladder and moved forward to position: " + player_Position);
			}
		} else {
			player_Position = player_Position - dice;
			if (player_Position < 0) {
				player_Position = 0;
				System.out.println("You got snake, restarted from 0 position");
			}
			System.out.println("You got snake moved backward position: " + player_Position);
		}
		return player_Position;
	}
}
