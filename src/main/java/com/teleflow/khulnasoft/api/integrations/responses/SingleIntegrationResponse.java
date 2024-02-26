package com.teleflow.khulnasoft.api.integrations.responses;

import com.teleflow.khulnasoft.api.integrations.pojo.Integration;
import lombok.Data;

@Data
public class SingleIntegrationResponse {
    private Integration data;
}