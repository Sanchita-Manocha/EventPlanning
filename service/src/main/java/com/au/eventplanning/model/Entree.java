package com.au.eventplanning.model;

import java.util.List;

public class Entree {
    private long id;
    private String name;
    private String dietType;
    private List<String> ingredients;

    public Entree() {
    }

    private Entree(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.dietType = builder.dietType;
        this.ingredients = builder.ingredients;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDietType() {
        return dietType;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class Builder{
        private long id;
        private String name;
        private String dietType;
        private List<String> ingredients;

        private Builder() {
        }

        public Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDietType(String dietType) {
            this.dietType = dietType;
            return this;
        }

        public Builder setIngredients(List<String> ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Entree build(){
            return new Entree(this);
        }
    }

}
