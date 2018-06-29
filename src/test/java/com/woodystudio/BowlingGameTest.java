package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {
    @Test
    public void shouldGetEmptyScoresWhenGetFirstScore() {
        BowlingGame bowlingGame = new BowlingGame();

        RoundScore score = bowlingGame.getScoreByRound(0);

        Assert.assertNull(score.getPrevious());
        Assert.assertNull(score.getNext());
        Assert.assertEquals(ScoreType.NONE, score.getFirstScore());
        Assert.assertEquals(ScoreType.NONE, score.getSecondScore());
        Assert.assertEquals(0, score.getTotalScore());
    }

    @Test
    public void shouldGetNullWhenIndexIsOutOfIndex() {
        BowlingGame bowlingGame = new BowlingGame();

        RoundScore score = bowlingGame.getScoreByRound(10);

        Assert.assertNull(score);
    }

    @Test
    public void shouldGetCorrectRoundScoreAfterParseInput() {
        BowlingGame bowlingGame = new BowlingGame();

        bowlingGame.parse("12345123451234512345");

        int score = bowlingGame.getTotalScore();

        Assert.assertEquals(60, score);
    }
}