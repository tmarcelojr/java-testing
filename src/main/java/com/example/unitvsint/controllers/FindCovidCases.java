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

        Map<String, Integer> casesMap = null;
        int totalCases = 0;

        // User can give empty input. isEmpty is method in Java that checks if String is empty
        if(countryName.isEmpty()) throw new NullPointerException("Input required.");

        casesMap = getCasesStatistic();

        // Input may not be in database. containsKey is Java method
        if(!casesMap.containsKey(countryName)) {
            throw new NullPointerException("Invalid input.");
        } else {
            totalCases = casesMap.get(countryName);
        }

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
