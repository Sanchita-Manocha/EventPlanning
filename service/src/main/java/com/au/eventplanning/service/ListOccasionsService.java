package com.au.eventplanning.service;


import com.au.grpc.generated.eventPlanning.occasions.ListOccasionsRequest;
import com.au.grpc.generated.eventPlanning.occasions.ListOccasionsResponse;
import com.au.grpc.generated.eventPlanning.occasions.ListOccasionsServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.util.Arrays;
import java.util.List;

public class ListOccasionsService extends ListOccasionsServiceGrpc.ListOccasionsServiceImplBase {

    @Override
    public void listOccasions(ListOccasionsRequest request, StreamObserver<ListOccasionsResponse> responseObserver) {

        List<String> list = Arrays.asList("Birthday", "Anniversary");

        ListOccasionsResponse response = ListOccasionsResponse.newBuilder()
                .addAllOccasions(list)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
