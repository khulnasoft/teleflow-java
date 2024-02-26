package com.teleflow.khulnasoft.api.changes.request;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

import java.util.List;

@Data
public class ApplyChangesRequest implements IRequest {
    private List<?> changeIds;
}
