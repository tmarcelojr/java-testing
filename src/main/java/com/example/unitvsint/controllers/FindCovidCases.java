package com.example.unitvsint.controllers;

import java.util.HashMap;
import java.util.Map;

public class FindCovidCases {
    // Use case:
    // Write a service where based on country we can find the total covid cases
    // Input parameter: country name
    // Expected output: cases count (int)

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int getCases(String countryName) {
        // Typically if we're working with an API we would do our service call here
        // Return 0 first to fail our first test.Change return after getting/creating data

        // User can give empty input
        if(countryName.isEmpty()) throw new NullPointerException("Input required.");

        // Input may not be in database

        Map<String, Integer> casesMap = getCasesStatistic();
        int totalCases = casesMap.get(countryName);
        return totalCases;
    }

    private Map<String, Integer> getCasesStatistic() {
        // In Java Map is an object that maps keys and values
        // Map has three implementations but we can use HashMap
        // to store key value pairs
        Map<String, Integer> casesMap = new HashMap<>();
        // In HashMap we can use the method put() to store key value pairs
        casesMap.put("Argentina", 1000000);
        casesMap.put("United States", 2345678);
        casesMap.put("Brazil", 999999);
        return casesMap;
    }

}
