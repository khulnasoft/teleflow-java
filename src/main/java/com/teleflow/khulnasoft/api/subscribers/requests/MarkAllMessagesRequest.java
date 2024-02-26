package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class MarkAllMessagesRequest implements IRequest {
    private String feedIdentifier;
    private String markAs;
}