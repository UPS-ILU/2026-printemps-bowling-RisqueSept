package tdd;

public class Game {
	private int score;

	public void roll(int NbQuilles) {
		this.score += NbQuilles;
	}

	public Game() {
		super();
	}

	int score() {
		return score;
	}

}
