package com.teleflow.khulnasoft.api.workflows.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateWorkflowStatusRequest implements IRequest {
    private Boolean active;
}