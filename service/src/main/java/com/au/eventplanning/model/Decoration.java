package com.au.eventplanning.model;

public class Decoration {
    private long id;
    private long venueId;
    private String name;

    public Decoration() {
    }
    private Decoration(Builder builder){
        this.id=builder.id;
        this.venueId=builder.venueId;
        this.name=builder.name;
    }

    public static  class Builder{

        private long id;
        private long venueId;
        private String name;

        private Builder(){

        }

        public Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setVenueId(long venueId) {
            this.venueId = venueId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Decoration build(){
            return  new Decoration(this);
        }


    }
}
