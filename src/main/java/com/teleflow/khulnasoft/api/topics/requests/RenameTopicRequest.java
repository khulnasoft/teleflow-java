package com.teleflow.khulnasoft.api.topics.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class RenameTopicRequest implements IRequest {
    private String name;
}
