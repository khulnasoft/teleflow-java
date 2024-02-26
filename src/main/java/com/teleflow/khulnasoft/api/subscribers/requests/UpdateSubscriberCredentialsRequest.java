package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.api.subscribers.pojos.ChannelCredentials;
import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateSubscriberCredentialsRequest implements IRequest {
    private String providerId;
    private ChannelCredentials credentials;
}