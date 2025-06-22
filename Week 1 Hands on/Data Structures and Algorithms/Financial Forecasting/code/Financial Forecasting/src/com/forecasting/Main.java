package com.forecasting;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Forecaster
        Forecaster forecaster = new Forecaster();

        // Input values
        double principal = 1000.0;  // Initial investment
        double rate = 0.05;         // 5% annual interest rate
        int years = 10;             // Investment duration in years

        // Call the recursive method
        double result = forecaster.futureValue(principal, rate, years);

        // Output the result
        System.out.printf("Future Value after %d years: Rs.%.2f%n", years, result);
    }
}
