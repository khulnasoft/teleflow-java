package com.teleflow.khulnasoft.api.organizations.responses;

import com.teleflow.khulnasoft.api.organizations.pojos.InviteDetails;
import com.teleflow.khulnasoft.api.organizations.pojos.UserDetails;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class MemberResponseData {
    @SerializedName("_id")
    private String id;
    @SerializedName("_userId")
    private String userId;
    private UserDetails user;
    private List<String> roles;
    private InviteDetails invite;
    private String memberStatus;
    @SerializedName("_organizationId")
    private String organizationId;

}


