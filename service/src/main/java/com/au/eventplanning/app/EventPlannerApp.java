package com.au.eventplanning.app;

import com.au.eventplanning.grpc.GrpcServices;


public class EventPlannerApp {
    public static void main (String [] args){
        GrpcServices grpcServices = new GrpcServices();
        grpcServices.start();
    }
}
