package com.teleflow.khulnasoft.api.events.pojos;

import com.teleflow.khulnasoft.api.events.requests.TriggerEventRequest;
import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

import java.util.List;

@Data
public class BulkTriggerEventRequest implements IRequest {
    private List<TriggerEventRequest> events;
}
