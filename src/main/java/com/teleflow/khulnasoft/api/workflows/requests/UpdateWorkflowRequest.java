package com.teleflow.khulnasoft.api.workflows.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateWorkflowRequest extends BaseWorkflowRequest implements IRequest {
    private String identifier;
}