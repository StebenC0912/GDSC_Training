package org.hanu.judger.domain.model;

public class KB {
    private double value;
    public static KB max(KB a, KB b) {
        return a.value > b.value ? a : b;
    }
    public KB (double value) {
        this.value = value;
    }
    public KB (long value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "KB{" +
                "value=" + value +
                '}';
    }
}
