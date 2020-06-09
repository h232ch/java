package practice;

public class Player {

	PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.ment();
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.ment();
	}
	
	public void go(int numOfJump) {
		level.go(numOfJump);
	}
}
