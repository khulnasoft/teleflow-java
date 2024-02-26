package com.teleflow.khulnasoft.api.environments;

import java.io.IOException;

import com.teleflow.khulnasoft.api.environments.requests.CreateEnvironmentRequest;
import com.teleflow.khulnasoft.api.environments.requests.UpdateEnvironmentRequest;
import com.teleflow.khulnasoft.api.environments.responses.ApiKeyResponse;
import com.teleflow.khulnasoft.api.environments.responses.BulkEnvironmentResponse;
import com.teleflow.khulnasoft.api.environments.responses.SingleEnvironmentResponse;
import com.teleflow.khulnasoft.commmon.rest.TeleflowNetworkException;
import com.teleflow.khulnasoft.commmon.rest.RestHandler;
import retrofit2.Response;

public class EnvironmentHandler {

    private final RestHandler restHandler;

    private final EnvironmentApi environmentApi;
    
    public EnvironmentHandler(RestHandler restHandler) {
    	this.restHandler = restHandler;
    	this.environmentApi = restHandler.buildRetrofit().create(EnvironmentApi.class);
    }

    public SingleEnvironmentResponse getCurrentEnvironment() throws IOException, TeleflowNetworkException {
    	Response<SingleEnvironmentResponse> response = environmentApi.getCurrentEnvironment().execute();
        return restHandler.extractResponse(response);
    }

    public SingleEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws IOException, TeleflowNetworkException {
    	Response<SingleEnvironmentResponse> response = environmentApi.createEnvironment(request).execute();
        return restHandler.extractResponse(response);
    }

    public BulkEnvironmentResponse getEnvironments() throws IOException, TeleflowNetworkException {
    	Response<BulkEnvironmentResponse> response = environmentApi.getEnvironments().execute();
        return restHandler.extractResponse(response);
    }

    public SingleEnvironmentResponse updateEnvironmentById(String environmentId, UpdateEnvironmentRequest request) throws IOException, TeleflowNetworkException {
    	Response<SingleEnvironmentResponse> response = environmentApi.updateEnvironmentById(environmentId, request).execute();
        return restHandler.extractResponse(response);
    }

    public ApiKeyResponse getApiKeys() throws IOException, TeleflowNetworkException {
    	Response<ApiKeyResponse> response = environmentApi.getApiKeys().execute();
        return restHandler.extractResponse(response);
    }

    public ApiKeyResponse regenerateApiKeys() throws IOException, TeleflowNetworkException {
    	Response<ApiKeyResponse> response = environmentApi.regenerateApiKeys().execute();
        return restHandler.extractResponse(response);
    }
}