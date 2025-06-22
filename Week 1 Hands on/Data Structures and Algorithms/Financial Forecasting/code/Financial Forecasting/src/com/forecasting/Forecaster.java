package com.forecasting;

public class Forecaster {

    // Recursive method to calculate future value
    public double futureValue(double principal, double rate, int years) {
        // Base case: 0 years means return the principal
        if (years == 0) {
            return principal;
        }
        // Recursive case: compute value for previous year and multiply
        return (1 + rate) * futureValue(principal, rate, years - 1);
    }
}
