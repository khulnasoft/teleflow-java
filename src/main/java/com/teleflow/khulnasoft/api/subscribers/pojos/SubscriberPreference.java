package com.teleflow.khulnasoft.api.subscribers.pojos;

import com.teleflow.khulnasoft.api.common.Template;
import lombok.Data;

@Data
public class SubscriberPreference {
    private Template template;
    private Preference preference;
}