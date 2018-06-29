package com.woodystudio;

public class BowlingGame {
    public RoundScore getScoreByRound(int index) {
        if (index > 9) {
            return null;
        }
        RoundScore score = new RoundScore();
        return score;
    }

    public void parse(String input) {

    }

    public int getTotalScore() {
        return 0;
    }
}

// input 123/451234X, output 300.
// as a round score, i have three scores, first score, second score, total score. i have next score and previous score. 10
// as a bowling game, i can init an empty score.
// as a bowling game, i can translate input to round score.
// as a bowling game, i can calculate total score.