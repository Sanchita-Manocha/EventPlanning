package com.au.eventplanning.grpc;


import com.au.eventplanning.app.Config;
import com.au.eventplanning.ping.PingService;
import com.au.eventplanning.service.EventPlannerService;
import com.linecorp.armeria.common.grpc.GrpcSerializationFormats;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.grpc.GrpcService;

public class GrpcServices {

    private Server server;
    private Config config;

    public GrpcServices(Config config) {
        this.server = newServer(config.getPORT());
    }

    public Server newServer(Integer port){
        return Server.builder().http(port)
                .service(GrpcService.builder()
                                .addService(new PingService())
                                .addService(new EventPlannerServiceGrpcWrapper())
                                .enableUnframedRequests(true)
                                .supportedSerializationFormats(GrpcSerializationFormats.PROTO, GrpcSerializationFormats.JSON)
                                .build()).build();
    }

    public void start() {
        server.start();
    }

    public void close() {
        server.close();
    }


}
