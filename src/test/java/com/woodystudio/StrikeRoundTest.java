package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class StrikeRoundTest {
    @Test
    public void shouldReturn16GivenFirstIs10AndNextFirstIs1AndSecondIs5() {
        Round round = new StrikeRound();
        round.setFirstScore(ScoreType.X);
        round.setSecondScore(ScoreType.NONE);
        Round nextRound = new NormalRound();
        nextRound.setFirstScore(ScoreType.ONE);
        nextRound.setSecondScore(ScoreType.FIVE);
        round.setNext(nextRound);

        Assert.assertEquals(16, round.calculateTotalScore());
    }

    @Test
    public void shouldReturn10GivenNextIsNull() {
        Round round = new StrikeRound();
        round.setFirstScore(ScoreType.X);
        round.setSecondScore(ScoreType.NONE);

        Assert.assertEquals(10, round.calculateTotalScore());
    }
}