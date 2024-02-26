package com.teleflow.khulnasoft.api.environments.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class CreateEnvironmentRequest implements IRequest {
    private String name;
    private String parentId;
}