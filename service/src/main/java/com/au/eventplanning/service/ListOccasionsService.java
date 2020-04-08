package com.au.eventplanning.service;



import com.au.eventplanning.fakeDaoImpl.OccasionDaoImpl;
import com.au.eventplanning.grpc.generated.service.*;
import com.au.eventplanning.transformer.Transformer;
import io.grpc.stub.StreamObserver;

public class ListOccasionsService extends ListOccasionsServiceGrpc.ListOccasionsServiceImplBase {

    private OccasionDaoImpl occasions = new OccasionDaoImpl();

    @Override
    public void listOccasions(ListOccasionsRequest request, StreamObserver<ListOccasionsResponse> responseObserver) {

        ListOccasionsResponse response = ListOccasionsResponse.newBuilder().build();


        occasions.getOccasions().stream()
                    .forEach(occasion->  { response.toBuilder()
                                            .setOccasions(Transformer.toGrpcOccasion(occasion));
                                           responseObserver.onNext(response); });
        responseObserver.onCompleted();
    }

    @Override
    public void addOccasion(AddOccasionRequest request, StreamObserver<AddOccasionResponse> responseObserver) {

        AddOccasionResponse response = AddOccasionResponse.newBuilder()
                .setResult(occasions.insertOccasion(request.getId(), request.getName()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
