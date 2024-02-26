package com.teleflow.khulnasoft.api.environments.responses;

import com.teleflow.khulnasoft.api.environments.pojos.ApiKey;
import lombok.Data;

import java.util.List;

@Data
public class ApiKeyResponse {
    private List<ApiKey> data;
}