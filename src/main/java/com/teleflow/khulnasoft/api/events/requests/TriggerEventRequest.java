package com.teleflow.khulnasoft.api.events.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

import java.util.Map;


@Data
public class TriggerEventRequest implements IRequest {
    private String name;
    private Object to;// Possible types this field accepts are; SubscriberRequest, List<SubscriberRequest>, Topic or List<Topic>
    private Map<String, Object> payload;
    private Map<String, Object> overrides;
    private String transactionId;
}