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

    // Will get a java.lang NullPointerException error when you try to reference that
    // points to no location in memory. In JUnit we would pass this on as an argument when
    // calling @Test. To fix this issue from scratch, we fix it by using a try catch passing
    // on Exception e 

    public static void findCasesWithEmptyInput() {
        try {
            String countryName = "";
            int expectedTotalCases = 0;
            FindCovidCases country = new FindCovidCases();
            int count = country.getCases(countryName);

            if (expectedTotalCases != 0) {
                System.out.println(String.format("findCases: test pass. Input not empty."));
            } else {
                System.out.println(String.format("findCases: test fail. Input cannot be empty."));
            }
        } catch(Exception e) {
            System.out.println("Null pointer exception");
        }
    }
}
