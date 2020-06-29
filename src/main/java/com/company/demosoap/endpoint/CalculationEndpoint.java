package com.company.demosoap.endpoint;

import io.spring.guides.gs_producing_web_service.CalculationRequest;
import io.spring.guides.gs_producing_web_service.CalculationResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculationEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "calculationRequest")
    @ResponsePayload
    public CalculationResponse calculationResponse(@RequestPayload CalculationRequest calculationRequest) {
        CalculationResponse calculationResponse = new CalculationResponse();
        calculationResponse.setTotal(calculationRequest.getA() + calculationRequest.getB());
        return calculationResponse;
    }
}
