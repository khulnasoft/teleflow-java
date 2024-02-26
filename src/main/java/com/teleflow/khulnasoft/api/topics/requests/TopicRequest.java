package com.teleflow.khulnasoft.api.topics.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class TopicRequest implements IRequest {
    private String key;
    private String name;
}
