package com.teleflow.khulnasoft.api.changes;

import com.teleflow.khulnasoft.api.changes.request.ApplyChangesRequest;
import com.teleflow.khulnasoft.api.changes.responses.ApplyChangesResponse;
import com.teleflow.khulnasoft.api.changes.responses.ChangeCountResponse;
import com.teleflow.khulnasoft.api.changes.responses.GetChangesResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface ChangeApi {

    String ENDPOINT = "changes";

    @GET(ENDPOINT)
    Call<GetChangesResponse> getChanges(@QueryMap Map<String, Object> options);

    @GET(ENDPOINT + "/count")
    Call<ChangeCountResponse> getChangesCount();

    @POST(ENDPOINT + "/bulk/apply")
    Call<ApplyChangesResponse> applyChanges(@Body ApplyChangesRequest request);

    @POST(ENDPOINT + "/{changeId}/apply")
    Call<ApplyChangesResponse> applyChange(@Path("changeId") String changeId);

}
