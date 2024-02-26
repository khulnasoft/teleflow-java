package com.teleflow.khulnasoft.api.common;

import com.teleflow.khulnasoft.api.notifications.pojos.Children;
import lombok.Data;

import java.util.List;

@Data
public class Filters {
    private Boolean isNegated;
    private String type;
    private String value;
    private List<Children> children;
}