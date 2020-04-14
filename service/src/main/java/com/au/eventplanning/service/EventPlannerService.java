package com.au.eventplanning.service;



import com.au.eventplanning.dao.OccasionDao;
import com.au.eventplanning.fakeDaoImpl.OccasionDaoImpl;
import com.au.eventplanning.grpc.generated.service.*;
import com.au.eventplanning.transformer.Transformer;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.stream.Collectors;

public class EventPlannerService  {

    private static OccasionDao occasionsDB = new OccasionDaoImpl();

    public List<ListOccasionsResponse> listOccasions(){
        ListOccasionsResponse.Builder responseBuilder = ListOccasionsResponse.newBuilder();
        return occasionsDB.getOccasions().stream()
                .map(occasion-> responseBuilder
                        .setOccasions(Transformer.toGrpcOccasion(occasion))
                        .build())
                .collect(Collectors.toList());

    }
    public AddOccasionResponse addOccasion(AddOccasionRequest request) {
        return AddOccasionResponse.newBuilder()
                .setResult(occasionsDB.insertOccasion(request.getId(), request.getName()))
                .build();

    }

}
