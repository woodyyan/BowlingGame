package com.woodystudio;

public class RoundScore {
    private ScoreType firstScore;
    private ScoreType secondScore;
    private int totalScore;
    private RoundScore previous;
    private RoundScore next;

    public RoundScore() {
        this.firstScore = ScoreType.NONE;
        this.secondScore = ScoreType.NONE;
    }

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

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public RoundScore getPrevious() {
        return previous;
    }

    public void setPrevious(RoundScore previous) {
        this.previous = previous;
    }

    public RoundScore getNext() {
        return next;
    }

    public void setNext(RoundScore next) {
        this.next = next;
    }
}
