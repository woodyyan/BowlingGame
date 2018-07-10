package com.woodystudio;

public enum ScoreType {
    NONE(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), SLASH(0), X(10), DASH(0);

    private final int value;

    ScoreType(int value) {
        this.value = value;
    }

    public static ScoreType parse(Character character) {
        switch (character) {
            case '1':
                return ScoreType.ONE;
            case '2':
                return ScoreType.TWO;
            case '3':
                return ScoreType.THREE;
            case '4':
                return ScoreType.FOUR;
            case '5':
                return ScoreType.FIVE;
            case '6':
                return ScoreType.SIX;
            case '7':
                return ScoreType.SEVEN;
            case '8':
                return ScoreType.EIGHT;
            case '9':
                return ScoreType.NINE;
            case '-':
                return ScoreType.DASH;
            case '/':
                return ScoreType.SLASH;
            case 'X':
                return ScoreType.X;
            default:
                return ScoreType.NONE;

        }
    }

    public int getValue() {
        return value;
    }
}
