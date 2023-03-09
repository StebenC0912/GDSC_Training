package org.hanu.judger.domain.model;

public class Millisecond {
    private float value;
    public static Millisecond max(Millisecond a, Millisecond b) {
        return a.value > b.value ? a : b;
    }
    public Millisecond (float value) {
        this.value = value;
    }
    public Millisecond (long value) {
        this.value = value;
    }
    public static Millisecond fromSecond(Float val) {
        long m = Math.round(val * 1000);
        return new Millisecond(m);
    }
}
