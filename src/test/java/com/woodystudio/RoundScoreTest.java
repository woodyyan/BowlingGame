package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class RoundScoreTest {
    @Test
    public void shouldHasNoneScoreWhenInit() {
        RoundScore score = new RoundScore();

        Assert.assertEquals(ScoreType.NONE, score.getFirstScore());
        Assert.assertEquals(ScoreType.NONE, score.getSecondScore());
        Assert.assertEquals(0, score.getTotalScore());
        Assert.assertNull(score.getNext());
        Assert.assertNull(score.getPrevious());
    }
}