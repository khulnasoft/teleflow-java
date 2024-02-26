package com.teleflow.khulnasoft.api.subscribers.responses;

import com.teleflow.khulnasoft.api.subscribers.pojos.SubscriberPreference;
import lombok.Data;

@Data
public class SingleSubscriberPrefResponse {
    private SubscriberPreference data;
}