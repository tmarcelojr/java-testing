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
        PokemonResponseData mockData = new PokemonResponseData("Pikachu", 65, "75", mockAbility);
        // you would have to create getters and setters in PokemonResponseData class obj if you don't want to
        // put it inside the parenthesis. You would do this method if the class has field names in private

        // setup
        LookUpPokemon pokemon = new LookUpPokemon();

        // action
        PokemonResponseData response = pokemon.getPokemonStats();

        // outcome
        if(response != null) {
            if(mockData.name == response.name) { // Expected to be Pikachu
                System.out.println("name: test pass");
            } else {
                System.out.println("name: test fail");
            }

            // This will fail because you cannot compare two objects using == or equals() because
            // they are from different memory location. You would need to override equals().
            if(mockData.ability.ability.equals(response.ability.ability)) { // Expected to be lightning rod
                System.out.println("ability: test pass");
            } else {
                System.out.println("ability: test fail");
            }

        } else {
            System.out.println("fail, obj is empty");
        }
    }



}
