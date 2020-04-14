package com.au.eventplanning.grpc;

import com.au.eventplanning.grpc.generated.service.*;
import com.au.eventplanning.service.EventPlannerService;
import com.au.eventplanning.transformer.Transformer;
import io.grpc.stub.StreamObserver;

public class EventPlannerServiceGrpcWrapper extends EventPlanningServiceGrpc.EventPlanningServiceImplBase {
    EventPlannerService eventPlannerService = new EventPlannerService();
    @Override
    public void listOccasions(ListOccasionsRequest request, StreamObserver<ListOccasionsResponse> responseObserver) {
        eventPlannerService.listOccasions().stream()
                .forEach(response->responseObserver.onNext(response));
        responseObserver.onCompleted();

    }

    @Override
    public void addOccasion(AddOccasionRequest request, StreamObserver<AddOccasionResponse> responseObserver) {
        responseObserver.onNext(eventPlannerService.addOccasion(request));
        responseObserver.onCompleted();

    }
}
