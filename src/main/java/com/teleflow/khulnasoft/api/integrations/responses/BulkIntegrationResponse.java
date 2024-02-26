package com.teleflow.khulnasoft.api.integrations.responses;

import com.teleflow.khulnasoft.api.integrations.pojo.Integration;
import lombok.Data;

import java.util.List;

@Data
public class BulkIntegrationResponse {
    private List<Integration> data;
}