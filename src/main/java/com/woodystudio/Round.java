package com.woodystudio;

public abstract class Round {
    private ScoreType firstScore;
    private ScoreType secondScore;
    private Round previous;
    private Round next;

    public ScoreType getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(ScoreType firstScore) {
        this.firstScore = firstScore;
    }

    public ScoreType getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(ScoreType secondScore) {
        this.secondScore = secondScore;
    }

    public Round getPrevious() {
        return previous;
    }

    public void setPrevious(Round previous) {
        this.previous = previous;
    }

    public Round getNext() {
        return next;
    }

    public void setNext(Round next) {
        this.next = next;
    }

    public int calculateTotalScore() {
        return firstScore.ordinal() + secondScore.ordinal();
    }
}
