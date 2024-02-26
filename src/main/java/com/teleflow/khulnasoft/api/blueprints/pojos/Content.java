package com.teleflow.khulnasoft.api.blueprints.pojos;

import lombok.Data;

@Data
public class Content {
    private String type;
    private String content;
    private Styles styles;
}