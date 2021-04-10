package com.example.unitvsint.controllers;

public class FindCovidCasesTest {

    // Creating main method in able to run this file without using JUnit
    public static void main(String[] args) {
        findCases();
        findCasesWithEmptyInput();
        findCasesWithInvalidInput();
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
        } catch(Exception e) {
            // In here we can use e to return the NullPointerException
            System.out.println("findCasesWithEmptyString: test pass. " + e);
        }
    }

    public static void findCasesWithInvalidInput() {
            String countryName = "ABC";
            int expectedTotalCases = 0;
            FindCovidCases country = new FindCovidCases();
            int count = country.getCases(countryName);
    }
}
