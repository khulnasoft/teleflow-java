package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateSubscriberOnlineStatusRequest implements IRequest {
    private Boolean isOnline;
}