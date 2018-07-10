package com.woodystudio;

public class SpareRound extends Round {
    @Override
    public int calculateTotalScore() {
        if (this.getNext() != null) {
            return this.getFirstScore().getValue() + this.getSecondScore().getValue() + this.getNext().getFirstScore().getValue();
        } else {
            return this.getFirstScore().getValue() + this.getSecondScore().getValue();
        }
    }
}
