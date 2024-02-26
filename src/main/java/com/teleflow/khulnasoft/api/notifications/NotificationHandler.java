package com.teleflow.khulnasoft.api.notifications;

import com.teleflow.khulnasoft.api.layouts.LayoutApi;
import com.teleflow.khulnasoft.api.layouts.responses.CreateLayoutResponse;
import com.teleflow.khulnasoft.api.notifications.requests.NotificationRequest;
import com.teleflow.khulnasoft.api.notifications.responses.NotificationGraphStatsResponse;
import com.teleflow.khulnasoft.api.notifications.responses.NotificationResponse;
import com.teleflow.khulnasoft.api.notifications.responses.NotificationStatsResponse;
import com.teleflow.khulnasoft.api.notifications.responses.NotificationsResponse;
import com.teleflow.khulnasoft.common.base.TeleflowConfig;
import com.teleflow.khulnasoft.common.rest.TeleflowNetworkException;
import com.teleflow.khulnasoft.common.rest.RestHandler;
import lombok.RequiredArgsConstructor;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class NotificationHandler {

    private final RestHandler restHandler;
    private final NotificationApi notificationApi;

    public NotificationHandler(RestHandler restHandler) {
        this.restHandler = restHandler;
        this.notificationApi = restHandler.buildRetrofit().create(NotificationApi.class);
    }

    public NotificationsResponse getNotifications(NotificationRequest request) throws IOException, TeleflowNetworkException {
        Map<String, Object> params = new HashMap<>();
        if (request.getChannels() != null) params.put("channels", request.getChannels());
        if (request.getTemplates() != null)params.put("templates", request.getTemplates());
        if (request.getEmails() != null)params.put("emails", request.getEmails());
        if (request.getSearch() != null)params.put("search", request.getSearch());
        if (request.getPage() != null) params.put("page", request.getPage());
        if (request.getTransactionId() != null) params.put("transactionId", request.getTransactionId());
        return restHandler.extractResponse(notificationApi.getNotifications(params).execute());
    }

    public NotificationStatsResponse getNotificationsStats() throws IOException, TeleflowNetworkException {
        return restHandler.extractResponse(notificationApi.getNotificationsStats().execute());
    }

    public NotificationGraphStatsResponse getNotificationGraphStats() throws IOException, TeleflowNetworkException {
        return restHandler.extractResponse(notificationApi.getNotificationGraphStats().execute());
    }

    public NotificationResponse getNotification(String notificationId) throws IOException, TeleflowNetworkException {
        return restHandler.extractResponse(notificationApi.getNotification(notificationId).execute());
    }
}