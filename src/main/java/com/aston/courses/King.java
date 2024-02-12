package com.aston.courses;

public class King implements Comparable<King> {

public String king;
    King(String king) {
        this.king = king;
    }
    public String name() {
        return king;
    }

    @Override
    public int compareTo(King king) {
        return this.king.compareTo(king.name());
    }
}
