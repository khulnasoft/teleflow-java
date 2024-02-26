package com.teleflow.khulnasoft.api.layouts.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

@Data
public class FilterLayoutRequest implements IRequest {
    private Integer page;
    private Integer pageSize;
    private String sortBy;
    private String orderBy;
}
