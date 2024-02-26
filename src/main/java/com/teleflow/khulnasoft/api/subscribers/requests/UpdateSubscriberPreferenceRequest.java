package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.api.subscribers.pojos.PreferenceChannel;
import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateSubscriberPreferenceRequest implements IRequest {
    private PreferenceChannel channel;
    private Boolean enabled;
}