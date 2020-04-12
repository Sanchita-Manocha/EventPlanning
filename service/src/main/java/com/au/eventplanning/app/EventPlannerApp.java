package com.au.eventplanning.app;




public class EventPlannerApp {
    public static void main (String [] args){

        try {
            EventPlannerModule eventPlannerModule = new EventPlannerModule();
            eventPlannerModule.start();
        }
        catch (Exception exception)
        {
            System.out.println("Not able to start application");
        }

    }


}
