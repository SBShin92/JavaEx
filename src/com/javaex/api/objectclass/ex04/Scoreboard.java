package com.javaex.api.objectclass.ex04;

import java.util.Arrays;

public class Scoreboard implements Cloneable{
    private int scores[];

    public Scoreboard() {
    }

    public Scoreboard(int[] scores) {
        this.scores = scores;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Scoreboard{" +
                "scores=" + Arrays.toString(scores) +
                '}';
    }

    /* 얕은 복사 */
    public Scoreboard getClone() {
        Scoreboard clone = null;
        try {
            clone = (Scoreboard)super.clone();
        } catch (CloneNotSupportedException e) {}
        return clone;
    }

    /* 깊은 복사 */
    /* 오버라이딩 시 예외는 여기서 처리하고 다음으로 안넘겨도 된다. */
    @Override
    protected Object clone() { // throw 생략 후 이 메서드에서 처리
        Scoreboard clone = null;
        try {
            clone = (Scoreboard)super.clone();
            clone.scores = Arrays.copyOf(scores, scores.length);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
