package com.au.eventplanning.service;



import com.au.eventplanning.fakeDaoImpl.OccasionDaoImpl;
import com.au.eventplanning.grpc.generated.service.*;
import com.au.eventplanning.transformer.Transformer;
import io.grpc.stub.StreamObserver;

public class EventPlanningService extends EventPlanningServiceGrpc.EventPlanningServiceImplBase {

    private static OccasionDaoImpl occasionsDB = new OccasionDaoImpl();

    @Override
    public void listOccasions(ListOccasionsRequest request, StreamObserver<ListOccasionsResponse> responseObserver) {

        ListOccasionsResponse.Builder responseBuilder = ListOccasionsResponse.newBuilder();
//        ListOccasionsResponse response = ListOccasionsResponse.newBuilder()
//                .setOccasions(Occasion.newBuilder()
//                        .setId(1)
//                        .setName("sanch")
//                        .build())
//                .build();
//        responseObserver.onNext(response);


        occasionsDB.getOccasions().stream()
                    .forEach(occasion->  { responseBuilder
                                            .setOccasions(Transformer.toGrpcOccasion(occasion));
                                           responseObserver.onNext(responseBuilder.build()); });

        responseObserver.onCompleted();
    }

    @Override
    public void addOccasion(AddOccasionRequest request, StreamObserver<AddOccasionResponse> responseObserver) {

        AddOccasionResponse response = AddOccasionResponse.newBuilder()
                .setResult(occasionsDB.insertOccasion(request.getId(), request.getName()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
