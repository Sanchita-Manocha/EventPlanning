package com.au.eventplanning.app;

import com.au.eventplanning.grpc.GrpcServices;


public class EventPlannerApp {
    public static void main (String [] args){
        GrpcServices grpcServices = new GrpcServices(new Config());
        try {
            grpcServices.start();
        }
        catch (Exception exception)
        {
            System.out.println("Not able to start application");
        }
        finally {
            grpcServices.close();
        }
    }
}
