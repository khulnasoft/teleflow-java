package com.teleflow.khulnasoft.api.notifications.responses;

import com.teleflow.khulnasoft.api.notifications.pojos.NotificationGraphStats;
import lombok.Data;

import java.util.List;

@Data
public class NotificationGraphStatsResponse {
    private List<NotificationGraphStats> data;
}