package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class MarkMessageActionAsSeenRequest implements IRequest {
    private String status;
    private Object payload;
}