package com.teleflow.khulnasoft.api.workflowoverrides.request;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;

import lombok.Data;

@Data
public class GetWorkflowOverrideRequest implements IRequest {
    private Integer page;
    private Integer limit;
}
