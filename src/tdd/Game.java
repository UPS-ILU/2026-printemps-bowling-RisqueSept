package tdd;

public class Game {
    private int[] score = new int[21];
    private int lancer = 0;

    public void roll(int NbQuilles) {
        score[lancer] = NbQuilles;
        lancer++;
    }
    private boolean isStrike(int lancerIndex) {
        return score[lancerIndex] == 10;
    }

    private boolean isSpare(int lancerIndex) {
        return score[lancerIndex] + score[lancerIndex + 1] == 10;
    }

    private int bonusStrike(int lancerIndex) {
        return score[lancerIndex + 1] + score[lancerIndex + 2];
    }

    
    
    private int bonusSpare(int lancerIndex) {
        return score[lancerIndex + 2];
    }

    public int score() {
        int total = 0;
        int lancerIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(lancerIndex)) {
                total += 10 + bonusStrike(lancerIndex);
                lancerIndex++;
            } else if (isSpare(lancerIndex)) {
                total += 10 + bonusSpare(lancerIndex);
                lancerIndex += 2;
            } else {
                total += score[lancerIndex] + score[lancerIndex + 1];
                lancerIndex += 2;
            }
        }
        return total;
    }
}