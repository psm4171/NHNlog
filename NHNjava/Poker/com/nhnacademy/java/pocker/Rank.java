package com.nhnacademy.java.pocker;

public enum Rank {

    Top(1),
    OnePair(2),
    TwoPairs(3),

    ThreeOfKind(4);

    private int rank;

    private Rank(int rank){
        this.rank = rank;
    }

    public static int size() {
        return Rank.size();
    }
}





