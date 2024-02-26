package com.teleflow.khulnasoft.api.tenants.responses;

import com.teleflow.khulnasoft.api.tenants.pojos.Tenant;
import lombok.Data;

@Data
public class TenantResponse {
    private Tenant data;
}