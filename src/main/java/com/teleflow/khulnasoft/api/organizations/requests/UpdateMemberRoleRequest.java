package com.teleflow.khulnasoft.api.organizations.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateMemberRoleRequest implements IRequest {
    private String role;
}
