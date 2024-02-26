package com.teleflow.khulnasoft.api.subscribers.responses;

import com.teleflow.khulnasoft.api.subscribers.pojos.SubscriberPreference;
import lombok.Data;

import java.util.List;

@Data
public class SubscriberPreferenceResponse {
    private List<SubscriberPreference> data;
}