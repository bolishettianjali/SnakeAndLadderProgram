public class SnakeAndLadder{
	static int NO_PLAY = 0;
	static int LADDER = 1;
	static int SNAKE = 2;
	static int count;

	public static void main(String[] args) {
		int player_Position = 0;
		while (player_Position < 100) {
			count++;
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
		}
	}
}