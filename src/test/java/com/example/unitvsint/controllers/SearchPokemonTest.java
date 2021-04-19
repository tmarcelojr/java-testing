package com.example.unitvsint.controllers;

public class SearchPokemonTest {
    public static void main(String[] args) {
        getPokemonInfo_ReturnResponseObject();
    }

    public static void getPokemonInfo_ReturnResponseObject() {
        // mockup
        String mockPokemonData = "Pikachu";
        // setup
        SearchPokemon pokemon = new SearchPokemon();

        // action
        String result = pokemon.getPokemonInfo();

        // outcome
        if(result.length() != mockPokemonData.length()) {
            System.out.println(String.format("getPokemonInfo = Test pass. Expected: %s Actual: %s", mockPokemonData.length(),
                    result.length()));
        } else {
            System.out.println(String.format("getPokemonInfo = Test fail. Expected: %s Actual: %s",
                    mockPokemonData.length(),
                    result.length()));
        }
    }

}
