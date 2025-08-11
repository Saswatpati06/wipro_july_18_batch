package Games;

public class AccessGame {

	public static void main(String[] args) {
		
		Game g = new Game("Cricket", 01, "Outdoor Games");

        // Access default members
		g.displayGameInfo();

        
        System.out.println("Accessing game name directly: " + g.gameName);
	}

}
