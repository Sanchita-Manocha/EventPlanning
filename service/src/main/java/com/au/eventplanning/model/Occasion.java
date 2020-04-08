package com.au.eventplanning.model;

public class Occasion {

    long id;
    String name;

    public Occasion() {
    }

    public Occasion(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Occasion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
