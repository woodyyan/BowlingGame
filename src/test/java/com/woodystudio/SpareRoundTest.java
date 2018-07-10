package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class SpareRoundTest {
    @Test
    public void shouldReturn15GivenFirstIs2SecondIs8AndNextFirstIs5() {
        Round round = new SpareRound();
        round.setFirstScore(ScoreType.TWO);
        round.setSecondScore(ScoreType.EIGHT);
        Round nextRound = new NormalRound();
        nextRound.setFirstScore(ScoreType.FIVE);
        round.setNext(nextRound);

        Assert.assertEquals(15, round.calculateTotalScore());
    }
}