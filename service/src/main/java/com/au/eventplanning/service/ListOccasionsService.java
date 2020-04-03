package com.au.eventplanning.service;



import com.au.eventplanning.grpc.generated.service.ListOccasionsRequest;
import com.au.eventplanning.grpc.generated.service.ListOccasionsResponse;
import com.au.eventplanning.grpc.generated.service.ListOccasionsServiceGrpc;
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
