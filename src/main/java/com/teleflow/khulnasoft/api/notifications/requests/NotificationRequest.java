package com.teleflow.khulnasoft.api.notifications.requests;

import com.teleflow.khulnasoft.common.contracts.IRequest;
import lombok.Data;

import java.util.List;

@Data
public class NotificationRequest implements IRequest {
    private List<String> channels;
    private List<String> templates;
    private List<String> emails;
    private String search;
    private Integer page;
    private String transactionId;
}