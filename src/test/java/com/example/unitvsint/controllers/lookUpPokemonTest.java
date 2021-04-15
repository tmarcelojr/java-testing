package com.example.unitvsint.controllers;


import com.example.unitvsint.model.Abilities;
import com.example.unitvsint.model.PokemonResponseData;

public class lookUpPokemonTest {

    public static void main(String[] args) {
        findPokemon_returnSuccessResObj();
    }

    public static void findPokemon_returnSuccessResObj() {
        // mockup
        Abilities mockAbility = new Abilities("s");
        PokemonResponseData mockData = new PokemonResponseData();
        // you would have to create getters and setters in PokemonResponseData class obj if you don't want to
        // put it inside the parenthesis. You would do this method if the class has field names in private.
        mockData.setName("Pikachu");
        mockData.setAbility(mockAbility);
        mockData.setOrder(65);
        mockData.setWeight("75");

        // setup
        LookUpPokemon pokemon = new LookUpPokemon();

        // action
        PokemonResponseData response = pokemon.getPokemonStats();

        // outcome
        if(response != null) {
            if(mockData.getName() == response.getName()) { // Expected to be Pikachu
                System.out.println("name: test pass");
            } else {
                System.out.println("name: test fail");
            }

            // This will fail because you cannot compare two objects using == or equals() because
            // they are from different memory location. You would need to override equals(). 
            if(mockData.getAbility().equals(response.getAbility())) { // Expected to be lightning rod
                System.out.println("ability: test pass");
            } else {
                System.out.println("ability: test fail");
            }

        } else {
            System.out.println("fail, obj is empty");
        }
    }



}
