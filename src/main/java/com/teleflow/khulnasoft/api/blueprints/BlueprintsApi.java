package com.teleflow.khulnasoft.api.blueprints;

import com.teleflow.khulnasoft.api.blueprints.pojos.Blueprint;
import com.teleflow.khulnasoft.api.blueprints.responses.BlueprintsByCategoryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BlueprintsApi {

    String ENDPOINT = "blueprints";

    @GET(ENDPOINT + "/group-by-category")
    Call<BlueprintsByCategoryResponse> getBlueprintsByCategory();

    @GET(ENDPOINT + "/{templateId}")
    Call<Blueprint> getBlueprint(@Path("templateId") String templateId);
}
