package week06Final;

public class Player {
	
	public String name;
	public int score = 0;
	
	public Player(String name){
		this.name = name;
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getscore() {
		return score;
	}
	
	public void addScore() {
		score++;
	}

}//end of public class player
