package com.teleflow.khulnasoft.api.organizations.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateOrganizationNameRequest implements IRequest {
    private String name;
}
