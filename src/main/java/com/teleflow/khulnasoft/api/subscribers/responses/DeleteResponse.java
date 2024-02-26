package com.teleflow.khulnasoft.api.subscribers.responses;

import lombok.Data;

@Data
public class DeleteResponse {
    private Boolean acknowledged;
    private String status;
}