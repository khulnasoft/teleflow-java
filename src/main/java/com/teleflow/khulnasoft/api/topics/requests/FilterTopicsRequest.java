package com.teleflow.khulnasoft.api.topics.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class FilterTopicsRequest implements IRequest {
    private Integer page;
    private Integer pageSize;
    private String key;
}
