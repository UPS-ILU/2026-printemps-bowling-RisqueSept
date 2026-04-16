package tdd;

public class Game {
	private int score;

	void roll(int NbQuilles) {
		this.score += NbQuilles;
	}

	public Game() {
		super();
		this.score = score;
	}

	int score() {
		return score;
	}

}
