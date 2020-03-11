package com.au.eventplanning.ping;

import com.au.eventplanning.ping.grpc.generated.PingRequest;
import com.au.eventplanning.ping.grpc.generated.PingResponse;
import com.au.eventplanning.ping.grpc.generated.PingServiceGrpc;
import io.grpc.stub.StreamObserver;

public class PingService extends PingServiceGrpc.PingServiceImplBase {
    @Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        PingResponse response = PingResponse.newBuilder()
                                            .setValue("Pong!!")
                                            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
