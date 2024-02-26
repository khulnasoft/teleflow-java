package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.api.common.SubscriberRequest;
import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

import java.util.List;

@Data
public class BulkSubscriberRequest implements IRequest {
    private List<SubscriberRequest> subscribers;
}