package com.woodystudio;

import org.junit.Assert;
import org.junit.Test;

public class ScoreTypeTest {
    @Test
    public void shouldParse1ToOne() {
        ScoreType scoreType = ScoreType.parse('1');

        Assert.assertEquals(ScoreType.ONE, scoreType);
    }

    @Test
    public void shouldParse2ToTwo() {
        ScoreType scoreType = ScoreType.parse('2');

        Assert.assertEquals(ScoreType.TWO, scoreType);
    }

    @Test
    public void shouldParse3ToThree() {
        ScoreType scoreType = ScoreType.parse('3');

        Assert.assertEquals(ScoreType.THREE, scoreType);
    }

    @Test
    public void shouldParse4ToFour() {
        ScoreType scoreType = ScoreType.parse('4');

        Assert.assertEquals(ScoreType.FOUR, scoreType);
    }

    @Test
    public void shouldParse5ToFive() {
        ScoreType scoreType = ScoreType.parse('5');

        Assert.assertEquals(ScoreType.FIVE, scoreType);
    }

    @Test
    public void shouldParse6ToSix() {
        ScoreType scoreType = ScoreType.parse('6');

        Assert.assertEquals(ScoreType.SIX, scoreType);
    }

    @Test
    public void shouldParse7ToSeven() {
        ScoreType scoreType = ScoreType.parse('7');

        Assert.assertEquals(ScoreType.SEVEN, scoreType);
    }

    @Test
    public void shouldParse8ToEight() {
        ScoreType scoreType = ScoreType.parse('8');

        Assert.assertEquals(ScoreType.EIGHT, scoreType);
    }

    @Test
    public void shouldParse9ToNine() {
        ScoreType scoreType = ScoreType.parse('9');

        Assert.assertEquals(ScoreType.NINE, scoreType);
    }

    @Test
    public void shouldParseSlashToSlash() {
        ScoreType scoreType = ScoreType.parse('/');

        Assert.assertEquals(ScoreType.SLASH, scoreType);
    }

    @Test
    public void shouldParseXToX() {
        ScoreType scoreType = ScoreType.parse('X');

        Assert.assertEquals(ScoreType.X, scoreType);
    }

    @Test
    public void shouldParseOtherCharToNone() {
        ScoreType scoreType = ScoreType.parse('a');

        Assert.assertEquals(ScoreType.NONE, scoreType);
    }
}