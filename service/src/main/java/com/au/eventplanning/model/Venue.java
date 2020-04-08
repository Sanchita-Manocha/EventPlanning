package com.au.eventplanning.model;

public class Venue {
    long id;
    long occasionId;
    String name;
    String budgetType;
    String location;
    int areaSize;

    public Venue() {
    }

    public Venue(Builder builder) {
        this.id = builder.id;
        this.occasionId = builder.occasionId;
        this.name = builder.name;
        this.budgetType = builder.budgetType;
        this.location = builder.location;
        this.areaSize = builder.areaSize;
    }

    public long getId() {
        return id;
    }

    public long getOccasionId() {
        return occasionId;
    }

    public String getName() {
        return name;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public String getLocation() {
        return location;
    }

    public int getAreaSize() {
        return areaSize;
    }

    public static class Builder{
        long id;
        long occasionId;
        String name;
        String budgetType;
        String location;
        int areaSize;

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

        public Builder setOccasionId(long occasionId) {
            this.occasionId = occasionId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBudgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setAreaSize(int areaSize) {
            this.areaSize = areaSize;
            return this;
        }

        public Venue build(){
            return new Venue(this);
        }
    }


}
