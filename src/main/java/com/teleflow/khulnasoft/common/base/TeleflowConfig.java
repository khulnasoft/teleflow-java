package com.teleflow.khulnasoft.common.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeleflowConfig {
  
    public TeleflowConfig(String apiKey) {
        this.apiKey = apiKey;
    }

    private String apiKey;
    private String baseUrl = "https://api.teleflow.khulnasoft.com/v1/";

}