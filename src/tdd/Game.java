package tdd;

public class Game {
	private int[] score = new int[21];
	private int tour = 0;

	public void roll(int NbQuilles) {
		score[tour] = NbQuilles;
		if(tour >=2 && tour%2 != 0) {
			int tourPrec = tour-1;
			if(this.score[tourPrec] + this.score[tourPrec] == 10) {
				this.score[tour-1] += NbQuilles;
			}
		}
		else {
			this.score[tour] = NbQuilles;
		}
		tour ++;
	}


	int score() {
		int total = 0;
		for(int i=0; i<tour; i++) {
			total += score[i];
		}
		return total;
	}

}
