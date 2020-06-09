package practice;

public class PlayTest {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.go(2);
		Player p2 = new Player();
		p2.go(4);
		Player p3 = new Player();
		p3.go(2);
		
		PlayerLevel sLevel = new SuperLevel();
		PlayerLevel aLevel = new AdvancedLevel();
		
		p1.upgradeLevel(sLevel);
		p1.go(5);

	}
}
