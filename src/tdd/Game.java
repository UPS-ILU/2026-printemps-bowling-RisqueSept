package tdd;

public class Game {
	private int[] score = new int[21];
	private int tour = 0;

	public void roll(int NbQuilles) {
		score[tour] = NbQuilles;
		if(tour >=1 && tour%2 == 1) {
			int tab = tour/2;
			if(this.score[2*tab] + this.score[2*tab+1] == 10) {
				this.score[2*tab] += NbQuilles;
			}
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
