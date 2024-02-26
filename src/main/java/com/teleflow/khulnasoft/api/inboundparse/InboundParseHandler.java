package com.teleflow.khulnasoft.api.inboundparse;

import java.io.IOException;

import com.teleflow.khulnasoft.api.inboundparse.responses.ValidateMxRecordResponse;
import com.teleflow.khulnasoft.commmon.rest.TeleflowNetworkException;
import com.teleflow.khulnasoft.commmon.rest.RestHandler;
import retrofit2.Response;

public class InboundParseHandler {

    private final RestHandler restHandler;

    private final InboundParseApi inboundParseApi;

    public InboundParseHandler(RestHandler restHandler) {
		this.restHandler = restHandler;
		this.inboundParseApi = restHandler.buildRetrofit().create(InboundParseApi.class);
	}

	public ValidateMxRecordResponse validateMxRecordSetupForInboundParse() throws IOException, TeleflowNetworkException {
		Response<ValidateMxRecordResponse> response = inboundParseApi.validateMxRecordSetupForInboundParse().execute();
        return restHandler.extractResponse(response);
    }
}