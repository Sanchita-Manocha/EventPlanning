package com.au.eventplanning.model;

public class DecorationService {
    private long id;
    private long decorationID;
    private String name;
    private double costAsPerArea;

    public DecorationService() {
    }

    private DecorationService(Builder builder) {
        this.id = id;
        this.decorationID = decorationID;
        this.name = name;
        this.costAsPerArea = costAsPerArea;
    }

    public long getId() {
        return id;
    }

    public long getDecorationID() {
        return decorationID;
    }

    public String getName() {
        return name;
    }

    public double getCostAsPerArea() {
        return costAsPerArea;
    }

    public static class Builder{
        private long id;
        private long decorationID;
        private String name;
        private double costAsPerArea;

        private Builder() {
        }

        public Builder(long id, String name)
        {
            this.id=id;
            this.name=name;
        }
        public Builder setId(long id) {
            this.id = id;
            return  this;
        }

        public Builder setDecorationID(long decorationID) {
            this.decorationID = decorationID;
            return  this;
        }

        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public Builder setCostAsPerArea(double costAsPerArea) {
            this.costAsPerArea = costAsPerArea;
            return  this;
        }

        public DecorationService build(){
            return new DecorationService(this);
        }
    }
}
