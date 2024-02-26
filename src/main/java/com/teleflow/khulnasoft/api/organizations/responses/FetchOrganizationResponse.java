package com.teleflow.khulnasoft.api.organizations.responses;

import lombok.Data;

import java.util.List;

@Data
public class FetchOrganizationResponse {
    private List<OrganizationResponseData> data;
}
