package com.teleflow.khulnasoft.api.feeds;

import java.io.IOException;

import com.teleflow.khulnasoft.api.feeds.request.FeedRequest;
import com.teleflow.khulnasoft.api.feeds.response.BulkFeedsResponse;
import com.teleflow.khulnasoft.api.feeds.response.FeedResponse;
import com.teleflow.khulnasoft.commmon.rest.TeleflowNetworkException;
import com.teleflow.khulnasoft.commmon.rest.RestHandler;
import retrofit2.Response;

public class FeedsHandler {

    private final RestHandler restHandler;
    
    private final FeedsApi feedsApi;
    
    public FeedsHandler(RestHandler restHandler) {
    	this.restHandler = restHandler;
    	this.feedsApi = restHandler.buildRetrofit().create(FeedsApi.class);
    }

    public FeedResponse createFeed(FeedRequest request) throws IOException, TeleflowNetworkException {
    	Response<FeedResponse> response = feedsApi.createFeed(request).execute();
        return restHandler.extractResponse(response);
    }

    public BulkFeedsResponse getFeeds() throws IOException, TeleflowNetworkException {
    	Response<BulkFeedsResponse> response = feedsApi.getFeeds().execute();
    	return restHandler.extractResponse(response);
    }


    public BulkFeedsResponse deleteFeed(String feedId) throws IOException, TeleflowNetworkException {
    	Response<BulkFeedsResponse> response = feedsApi.deleteFeed(feedId).execute();
    	return restHandler.extractResponse(response);
    }

}
