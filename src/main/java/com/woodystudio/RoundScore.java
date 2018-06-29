package com.woodystudio;

public class RoundScore {
    private enum ScoreType {
        ONE(1), TWO(2), THREE(3), FOUR(), FIVE, SIX, SEVEN, EIGHT, NINE, SLASH, X;

        private final int value;

        ScoreType(int value) {
            this.value = value;
        }
    }
}
