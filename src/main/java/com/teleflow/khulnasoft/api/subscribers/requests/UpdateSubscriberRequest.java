package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class UpdateSubscriberRequest implements IRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String avatar;
    private String locale;
    private Object data;
}