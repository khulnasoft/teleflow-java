package com.teleflow.khulnasoft.api.messages.responses;

import com.teleflow.khulnasoft.api.messages.pojos.Message;
import lombok.Data;

import java.util.List;

@Data
public class MessageResponse {
    private Long page;
    private Long totalCount;
    private Long pageSize;
    private List<Message> data;
}