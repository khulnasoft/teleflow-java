package com.teleflow.khulnasoft.api.layouts.requests;

import com.teleflow.khulnasoft.commmon.contracts.IRequest;
import lombok.Data;

@Data
public class FilterLayoutRequest implements IRequest {
    private Integer page;
    private Integer pageSize;
    private String sortBy;
    private String orderBy;
}
