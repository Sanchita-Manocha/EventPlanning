package com.au.eventplanning.transformer;

import com.au.eventplanning.model.Occasion;

public class Transformer {

    public static com.au.eventplanning.grpc.generated.service.Occasion toGrpcOccasion(Occasion occasion){
        return com.au.eventplanning.grpc.generated.service.Occasion.newBuilder()
                .setId(occasion.getId())
                .setName(occasion.getName())
                .build();
    }
}
