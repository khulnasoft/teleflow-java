package com.teleflow.khulnasoft.api.environments.requests;

import com.teleflow.khulnasoft.api.environments.pojos.Dns;
import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateEnvironmentRequest implements IRequest {
    private String name;
    private String identifier;
    private String parentId;
    private Dns dns;
}