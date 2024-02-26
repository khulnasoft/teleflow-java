package com.teleflow.api.workflowoverride;

import com.teleflow.api.common.PreferenceSettings;
import com.teleflow.api.workflowoverrides.WorkflowOverrideHandler;
import com.teleflow.api.workflowoverrides.pojos.WorkflowOverride;
import com.teleflow.api.workflowoverrides.request.CreateWorkflowOverrideRequest;
import com.teleflow.api.workflowoverrides.request.GetWorkflowOverrideRequest;
import com.teleflow.api.workflowoverrides.request.UpdateWorkflowOverrideRequest;
import com.teleflow.api.workflowoverrides.response.BulkWorkflowOverridesResponse;
import com.teleflow.api.workflowoverrides.response.DeleteWorkflowOverrideResponse;
import com.teleflow.api.workflowoverrides.response.WorkflowOverrideResponse;
import com.teleflow.common.base.TeleflowConfig;
import com.teleflow.common.rest.TeleflowNetworkException;
import com.teleflow.common.rest.RestHandler;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import com.google.gson.Gson;

public class WorkflowOverrideHandlerTest extends TestCase {

    private WorkflowOverrideHandler workflowOverrideHandler;

    private MockWebServer mockWebServer;

    @Override
    protected void setUp() {
        mockWebServer = new MockWebServer();
        TeleflowConfig teleflowConfig = new TeleflowConfig("1234");
        teleflowConfig.setBaseUrl(mockWebServer.url("").toString());
        RestHandler restHandler = new RestHandler(teleflowConfig);
        workflowOverrideHandler = new WorkflowOverrideHandler(restHandler);
    }

    public void test_createWorkflowOverrideHandler() throws IOException, TeleflowNetworkException, InterruptedException {
        WorkflowOverrideResponse workflowOverrideResponse = getWorkflowOverrideResponse();
        Gson gson = new Gson();
        mockWebServer.enqueue(new MockResponse().setResponseCode(201).setBody(gson.toJson(workflowOverrideResponse)));
        CreateWorkflowOverrideRequest createWorkflowOverrideRequest = getCreateWorkflowOverrideRequest();
        WorkflowOverrideResponse response = workflowOverrideHandler.createWorkflowOverride(createWorkflowOverrideRequest);
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("/workflow-overrides", request.getPath());
        assertEquals("POST", request.getMethod());
        assertEquals(gson.toJson(workflowOverrideResponse), gson.toJson(response));
    }

    public void test_getWorkflowOverrides() throws IOException, TeleflowNetworkException, InterruptedException {
        BulkWorkflowOverridesResponse workflowOverridesResponse = getWorkflowOverridesResponse();
        Gson gson = new Gson();
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(gson.toJson(workflowOverridesResponse)));
        GetWorkflowOverrideRequest getWorkflowOverrideRequest = new GetWorkflowOverrideRequest();
        getWorkflowOverrideRequest.setPage(1);
        getWorkflowOverrideRequest.setLimit(10);
        BulkWorkflowOverridesResponse response = workflowOverrideHandler.getWorkflowOverrides(getWorkflowOverrideRequest);
        assertNotNull(response);
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("/workflow-overrides?limit=10&page=1", request.getPath());
        assertEquals("GET", request.getMethod());
        assertEquals(gson.toJson(workflowOverridesResponse), gson.toJson(response));
    }

    public void test_getWorkflowOverrideById() throws IOException, TeleflowNetworkException, InterruptedException {
        WorkflowOverrideResponse workflowOverrideResponse = getWorkflowOverrideResponse();
        Gson gson = new Gson();
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(gson.toJson(workflowOverrideResponse)));
        WorkflowOverrideResponse response = workflowOverrideHandler.getWorkflowOverrideById("8329rufivdsnvs9u334");
        assertNotNull(response);
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("/workflow-overrides/8329rufivdsnvs9u334", request.getPath());
        assertEquals("GET", request.getMethod());
        assertEquals(gson.toJson(workflowOverrideResponse), gson.toJson(response));
    }

    public void test_getWorkflowOverride() throws IOException, TeleflowNetworkException, InterruptedException {
        WorkflowOverrideResponse workflowOverrideResponse = getWorkflowOverrideResponse();
        Gson gson = new Gson();
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(gson.toJson(workflowOverrideResponse)));
        WorkflowOverrideResponse response = workflowOverrideHandler.getWorkflowOverride("8329rufivdsnvs9u334", "wvnq340i2jfwqv392");
        assertNotNull(response);
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("/workflow-overrides/workflows/8329rufivdsnvs9u334/tenants/wvnq340i2jfwqv392", request.getPath());
        assertEquals("GET", request.getMethod());
        assertEquals(gson.toJson(workflowOverrideResponse), gson.toJson(response));
    }

    public void test_updateWorkflowOverrideById() throws IOException, TeleflowNetworkException, InterruptedException {
        WorkflowOverrideResponse workflowOverrideResponse = getWorkflowOverrideResponse();
        Gson gson = new Gson();
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(gson.toJson(workflowOverrideResponse)));
        UpdateWorkflowOverrideRequest updateRequest = getUpdateWorkflowOverrideRequest();
        WorkflowOverrideResponse response = workflowOverrideHandler.updateWorkflowOverrideById("8329rufivdsnvs9u334", updateRequest);
        assertNotNull(response);
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("/workflow-overrides/8329rufivdsnvs9u334", request.getPath());
        assertEquals("PUT", request.getMethod());
        assertEquals(gson.toJson(workflowOverrideResponse), gson.toJson(response));
    }

    public void test_updateWorkflowOverride() throws IOException, TeleflowNetworkException, InterruptedException {
        WorkflowOverrideResponse workflowOverrideResponse = getWorkflowOverrideResponse();
        Gson gson = new Gson();
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(gson.toJson(workflowOverrideResponse)));
        UpdateWorkflowOverrideRequest updateRequest = getUpdateWorkflowOverrideRequest();
        WorkflowOverrideResponse response = workflowOverrideHandler.updateWorkflowOverride("8329rufivdsnvs9u334", "wvnq340i2jfwqv392",
            updateRequest);
        assertNotNull(response);
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("/workflow-overrides/workflows/8329rufivdsnvs9u334/tenants/wvnq340i2jfwqv392", request.getPath());
        assertEquals("PUT", request.getMethod());
        assertEquals(gson.toJson(workflowOverrideResponse), gson.toJson(response));
    }

    public void test_deleteWorkflowOverride() throws IOException, TeleflowNetworkException, InterruptedException {
        DeleteWorkflowOverrideResponse deleteResponse = new DeleteWorkflowOverrideResponse();
        deleteResponse.setData(true);
        Gson gson = new Gson();
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(gson.toJson(deleteResponse)));
        DeleteWorkflowOverrideResponse response = workflowOverrideHandler.deleteWorkflowOverride("8329rufivdsnvs9u334");
        assertNotNull(response);
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("/workflow-overrides/8329rufivdsnvs9u334", request.getPath());
        assertEquals("DELETE", request.getMethod());
        assertEquals(gson.toJson(deleteResponse), gson.toJson(response));
    }

    private PreferenceSettings getPreferenceSettings() {
        PreferenceSettings preferenceSettings = new PreferenceSettings();
        preferenceSettings.setChat(true);
        preferenceSettings.setSms(true);
        preferenceSettings.setPush(true);
        preferenceSettings.setEmail(true);
        preferenceSettings.setInApp(true);
        return preferenceSettings;
    }

    private WorkflowOverrideResponse getWorkflowOverrideResponse() {
        WorkflowOverrideResponse workflowOverrideResponse = new WorkflowOverrideResponse();
        workflowOverrideResponse.setData(getWorkflowOverride());
        return workflowOverrideResponse;
    }

    private WorkflowOverride getWorkflowOverride() {
        WorkflowOverride workflowOverride = new WorkflowOverride();
        workflowOverride.setId("_id");
        workflowOverride.setWorkflowId("workflowId(_id");
        workflowOverride.setEnvironmentId("environmentId_id");
        workflowOverride.setTenantId("tenantId_id");
        workflowOverride.setTenantId("tenantId_id");
        workflowOverride.setPreferenceSettings(getPreferenceSettings());
        return workflowOverride;
    }

    private CreateWorkflowOverrideRequest getCreateWorkflowOverrideRequest() {
        CreateWorkflowOverrideRequest createWorkflowOverrideRequest = new CreateWorkflowOverrideRequest();
        createWorkflowOverrideRequest.setPreferenceSettings(getPreferenceSettings());
        createWorkflowOverrideRequest.setActive(true);
        createWorkflowOverrideRequest.setTenantId("8329rufivdsnvs9u334");
        createWorkflowOverrideRequest.setWorkflowId("wvnq340i2jfwqv392");
        return createWorkflowOverrideRequest;
    }

    private BulkWorkflowOverridesResponse getWorkflowOverridesResponse() {
        BulkWorkflowOverridesResponse bulkWorkflowOverridesResponse = new BulkWorkflowOverridesResponse();
        bulkWorkflowOverridesResponse.setData(List.of(getWorkflowOverride(), getWorkflowOverride()));
        bulkWorkflowOverridesResponse.setHasMore(true);
        bulkWorkflowOverridesResponse.setPageSize(10L);
        bulkWorkflowOverridesResponse.setPage(1L);
        return bulkWorkflowOverridesResponse;
    }

    private UpdateWorkflowOverrideRequest getUpdateWorkflowOverrideRequest() {
        UpdateWorkflowOverrideRequest updateWorkflowOverrideRequest = new UpdateWorkflowOverrideRequest();
        updateWorkflowOverrideRequest.setActive(true);
        updateWorkflowOverrideRequest.setPreferenceSettings(getPreferenceSettings());
        return updateWorkflowOverrideRequest;
    }

}
