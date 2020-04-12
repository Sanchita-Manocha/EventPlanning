package com.au.eventplanning.app;

import com.au.eventplanning.grpc.GrpcServices;

public class EventPlannerModule implements AutoCloseable{
    GrpcServices grpcServices;

    public EventPlannerModule() {
        this.grpcServices = new GrpcServices(new Config());
    }

    public void start()
    {
        grpcServices.start();
    }
    @Override
    public void close() throws Exception {
        grpcServices.close();
    }
}
