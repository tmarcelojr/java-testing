package com.example.unitvsint.model;

public class PokemonResponseData {
    public final String name;
    public final int oder;
    public final String weight;
    public Abilities ability;
    public PokemonResponseData(String name, int oder, String weight, Abilities ability) {
        this.name = name;
        this.oder = oder;
        this.weight = weight;
        this.ability = ability;
    }
}
