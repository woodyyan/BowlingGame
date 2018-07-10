package com.woodystudio;

public class StrikeRound extends Round {
    @Override
    public int calculateTotalScore() {
        if (this.getNext() != null) {
            return this.getFirstScore().getValue() + this.getSecondScore().getValue() + this.getNext().getFirstScore().getValue()
                    + this.getNext().getSecondScore().getValue();
        } else {
            return this.getFirstScore().getValue() + this.getSecondScore().getValue();
        }
    }
}
