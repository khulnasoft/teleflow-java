package com.teleflow.api.events.responses;

import lombok.Data;

import java.util.List;

@Data
public class BulkTriggerEventResponse {
    private List<TriggerEventResponseData> data;
}
