package com.example.unitvsint.controllers;

import com.example.unitvsint.model.Abilities;
import com.example.unitvsint.model.PokemonResponseData;

public class LookUpPokemon {
    // Use case: user can input a pokemon name and returns info about pokemon
    // method: input(pokemon_name)

    // we want to put the name of whatever we want to return before method name
    public PokemonResponseData getPokemonStats() {
    //     // service call or mock data
        Abilities pokemonAbilities = new Abilities("s");
        PokemonResponseData pokemonInfo = new PokemonResponseData();
        pokemonInfo.setName("Pikachu");
        pokemonInfo.setAbility(pokemonAbilities);
        pokemonInfo.setOrder(65);
        pokemonInfo.setWeight("75");
        return pokemonInfo;
    }

}
