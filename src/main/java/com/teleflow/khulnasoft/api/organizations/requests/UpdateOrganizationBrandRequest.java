package com.teleflow.khulnasoft.api.organizations.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateOrganizationBrandRequest implements IRequest {
    private String logo;
    private String color;
    private String fontColor;
    private String contentBackground;
    private String fontFamily;
}
