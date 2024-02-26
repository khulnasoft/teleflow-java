package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateSubscriberOnlineStatusRequest implements IRequest {
    private Boolean isOnline;
}