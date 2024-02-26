package com.teleflow.khulnasoft.api.workflows.pojos;

import lombok.Data;

@Data
public class WorkflowIntegrationStatus {
    private Boolean hasActiveIntegrations;
    private Channels channels;
}