package com.au.eventplanning.model;



public class Catering {
    private  long id;
    private  long venueId;
    private  String name;
    private  String budgetType;

    public Catering() {
    }

    private Catering(Builder builder) {
        this.id=builder.id;
        this.venueId=builder.venueId;
        this.name=builder.name;
    }

    public long getId() {
        return id;
    }

    public long getVenueId() {
        return venueId;
    }

    public String getName() {
        return name;
    }

    public String getBudgetType() {
        return budgetType;
    }


    public static class Builder{
        private  long id;
        private  long venueId;
        private   String name;
        private  String budgetType;

        private Builder(){
        }

        public Builder(long id, String name){
            this.id=id;
            this.name=name;
        }

        public Builder setVenueId(long venueId) {
            this.venueId = venueId;
            return  this;
        }

        public Builder setBudgetType(String budgetType) {
            this.budgetType = budgetType;
            return  this;
        }

        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public Catering build() {
            return new Catering(this);
        }
    }

}
