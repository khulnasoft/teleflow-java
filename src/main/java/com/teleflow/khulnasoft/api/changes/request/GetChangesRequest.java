package com.teleflow.khulnasoft.api.changes.request;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class GetChangesRequest implements IRequest {
    private Integer page;
    private Integer limit;
    private String promoted;
}
