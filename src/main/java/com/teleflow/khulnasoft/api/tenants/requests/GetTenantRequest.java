package com.teleflow.khulnasoft.api.tenants.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class GetTenantRequest implements IRequest {
    private Integer page;
    private Integer limit;
}