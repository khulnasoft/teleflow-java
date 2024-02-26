package com.teleflow.khulnasoft.api.subscribers.requests;

import com.teleflow.khulnasoft.api.subscribers.pojos.Mark;
import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class MarkSubscriberFeedAsRequest implements IRequest {
    private Object messageId;
    private Mark mark;
}