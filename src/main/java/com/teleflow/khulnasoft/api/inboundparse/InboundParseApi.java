package com.teleflow.khulnasoft.api.inboundparse;

import com.teleflow.khulnasoft.api.inboundparse.responses.ValidateMxRecordResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface InboundParseApi {
	
	String ENDPOINT = "inbound-parse";
	
	@GET(ENDPOINT + "/mx/status")
	Call<ValidateMxRecordResponse> validateMxRecordSetupForInboundParse();

}
