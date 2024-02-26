package com.teleflow.khulnasoft.api.notifications.pojos;

import lombok.Data;

@Data
public class NotificationStats {
    private Long weeklySent;
    private Long monthlySent;
    private Long yearlySent;
}