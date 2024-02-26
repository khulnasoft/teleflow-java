package com.teleflow.khulnasoft.api.workflowoverrides.request;

import com.teleflow.khulnasoft.api.common.PreferenceSettings;
import com.teleflow.khulnasoft.commmon.contracts.IRequest;

import lombok.Data;

@Data
public class CreateWorkflowOverrideRequest implements IRequest {
    private PreferenceSettings preferenceSettings;
    private Boolean active;
    private String tenantId;
    private String workflowId;
}
