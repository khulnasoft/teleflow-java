package com.teleflow.khulnasoft.api.integrations.requests;

import com.teleflow.khulnasoft.api.integrations.pojo.Credentials;
import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class IntegrationRequest implements IRequest {
    private String providerId;
    private String channel;
    private Credentials credentials;
    private Boolean active;
    private Boolean check;
}