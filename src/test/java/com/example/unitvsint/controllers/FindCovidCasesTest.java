package com.example.unitvsint.controllers;

public class FindCovidCasesTest {

    // Creating main method in able to run this file without using JUnit
    public static void main(String[] args) {
        findCases();
        findCasesWithEmptyInput();
    }

    // Calls getCases and checks to see if actual cases matches expected cases
    public static void findCases() {
        String countryName = "Argentina";
        int expectedTotalCases = 1000000;
        FindCovidCases country = new FindCovidCases();
        int count = country.getCases(countryName);

        if(expectedTotalCases == count) {
            System.out.println(String.format("findCases: test pass. expectedTotalCases: %s, count: %s",
                    expectedTotalCases, count ));
        } else {
            System.out.println(String.format("findCases: test fail. expectedTotalCases: %s, count: %s",
                    expectedTotalCases, count ));
        }
    }

    public static void findCasesWithEmptyInput() {
        String countryName = "";
        int expectedTotalCases = 0;
        FindCovidCases country = new FindCovidCases();
        int count = country.getCases(countryName);

        if(expectedTotalCases == count) {
            System.out.println(String.format("findCases: test pass. expectedTotalCases: %s, count: %s",
                    expectedTotalCases, count ));
        } else {
            System.out.println(String.format("findCases: test fail. expectedTotalCases: %s, count: %s",
                    expectedTotalCases, count ));
        }
    }
}
