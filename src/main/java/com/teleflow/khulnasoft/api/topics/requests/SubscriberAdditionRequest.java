package com.teleflow.khulnasoft.api.topics.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import java.util.List;
import lombok.Data;

@Data
public class SubscriberAdditionRequest implements IRequest {

    private List<String> subscribers;
}
