package com.teleflow.khulnasoft.api.feeds.request;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class FeedRequest implements IRequest {
    private String name;

}
