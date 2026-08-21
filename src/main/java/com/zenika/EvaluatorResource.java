package com.zenika;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import io.smallrye.reactive.messaging.kafka.Record;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/evaluator")
public class EvaluatorResource {

    @Inject
    ProductImpactService productImpactService;

    @POST
    @Path("/{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductImpact evaluate(String productId) {
        ProductImpact impact = productImpactService.evaluate(productId);
        return impact;
    }
}
