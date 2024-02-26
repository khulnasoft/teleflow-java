package com.teleflow.api.workflows;

import java.util.Map;

import com.teleflow.api.workflows.requests.UpdateWorkflowRequest;
import com.teleflow.api.workflows.requests.UpdateWorkflowStatusRequest;
import com.teleflow.api.workflows.requests.WorkflowRequest;
import com.teleflow.api.workflows.responses.BulkWorkflowResponse;
import com.teleflow.api.workflows.responses.DeleteWorkflowResponse;
import com.teleflow.api.workflows.responses.SingleWorkflowResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface WorkflowApi {
	
	String ENDPOINT = "workflows";
	
	@GET(ENDPOINT)
	Call<BulkWorkflowResponse> getWorkflows(@QueryMap Map<String, Object> params);
	
	@POST(ENDPOINT)
	Call<SingleWorkflowResponse> createWorkflow(@Body WorkflowRequest request);
	
	@PUT(ENDPOINT + "/{workflowId}")
	Call<SingleWorkflowResponse> updateWorkflow(@Path("workflowId") String workflowId, @Body UpdateWorkflowRequest request);
	
	@DELETE(ENDPOINT + "/{workflowId}")
	Call<DeleteWorkflowResponse> deleteWorkflow(@Path("workflowId") String workflowId);
	
	@GET(ENDPOINT + "/{workflowId}")
	Call<SingleWorkflowResponse> getWorkflow(@Path("workflowId") String workflowId);
	
	@PUT(ENDPOINT + "/{workflowId}/status")
	Call<SingleWorkflowResponse> updateWorkflowStatus(@Path("workflowId") String workflowId , @Body UpdateWorkflowStatusRequest request);

}
