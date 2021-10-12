public class SnakeAndLadder{
	static int NO_PLAY = 0;
	static int LADDER = 1;
	static int SNAKE = 2;

	public static void main(String[] args) {
		int player_Position = 0;
		int dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		if (option == NO_PLAY) {
			System.out.println("No play position remains same: "+player_Position);
		} else if (option == LADDER) {
			player_Position=dice+player_Position;
			System.out.println(player_Position);
		}
		else {
			player_Position=player_Position-dice;
			System.out.println(player_Position);
		}
	}

}
