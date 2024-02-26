package com.teleflow.khulnasoft.api.workflowgroups.request;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class WorkflowGroupRequest implements IRequest {
    private String name;
}
