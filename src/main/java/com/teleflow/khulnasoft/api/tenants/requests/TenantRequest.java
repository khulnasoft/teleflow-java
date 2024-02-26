package com.teleflow.khulnasoft.api.tenants.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class TenantRequest implements IRequest {
    private String identifier;
    private String name;
    private Object data;
}