package com.teleflow.khulnasoft.api.changes.request;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

import java.util.List;

@Data
public class ApplyChangesRequest implements IRequest {
    private List<?> changeIds;
}
