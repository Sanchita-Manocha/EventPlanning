package com.au.eventplanning.ping;


import com.au.eventplanning.grpc.generated.ping.PingRequest;
import com.au.eventplanning.grpc.generated.ping.PingResponse;
import com.au.eventplanning.grpc.generated.ping.PingServiceGrpc;
import com.linecorp.armeria.server.docs.DocServiceBuilder;
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

//    public void applyDocs(DocServiceBuilder builder) {
//        builder.exampleRequestForMethod(LIST_OCCASION_SERVICE, "List_Occasions",
//                PingRequest.newBuilder().setValue("ping").build());
//    }
}
