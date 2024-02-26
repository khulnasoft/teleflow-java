package com.teleflow.khulnasoft.api.workflowoverrides.request;

import com.teleflow.khulnasoft.api.common.PreferenceSettings;

import lombok.Data;

@Data
public class UpdateWorkflowOverrideRequest {
    private Boolean active;
    private PreferenceSettings preferenceSettings;
}
