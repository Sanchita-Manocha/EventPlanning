package com.au.eventplanning.grpc;

import com.au.eventplanning.ping.PingService;
import com.linecorp.armeria.common.grpc.GrpcSerializationFormats;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.grpc.GrpcService;

public class GrpcServices {

    private Server server;

    public GrpcServices() {
        this.server = newServer();
    }

    public Server newServer(){
        return Server.builder().service(GrpcService.builder()
                                .addService(new PingService())
                                .enableUnframedRequests(true)
                                .supportedSerializationFormats(GrpcSerializationFormats.PROTO, GrpcSerializationFormats.JSON)
                                .build()).build();
    }

    public void start() {
        server.start();
    }


}