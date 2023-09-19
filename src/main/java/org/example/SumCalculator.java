package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}

