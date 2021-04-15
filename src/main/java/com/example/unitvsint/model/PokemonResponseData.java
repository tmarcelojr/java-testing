package com.example.unitvsint.model;

public class PokemonResponseData {
    private String name;
    private int oder;
    private String weight;
    private Abilities ability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOder() {
        return oder;
    }

    public void setOrder(int oder) {
        this.oder = oder;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Abilities getAbility() {
        return ability;
    }

    public void setAbility(Abilities ability) {
        this.ability = ability;
    }

    // public PokemonResponseData(String name, int oder, String weight, Abilities ability) {
    //     this.name = name;
    //     this.oder = oder;
    //     this.weight = weight;
    //     this.ability = ability;
    // }
}
