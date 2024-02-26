package com.teleflow.khulnasoft.api.workflows.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateWorkflowRequest extends BaseWorkflowRequest implements IRequest {
    private String identifier;
}