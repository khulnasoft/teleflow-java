package com.teleflow.khulnasoft.api.executivedetails.responses;

import com.teleflow.khulnasoft.api.notifications.pojos.ExecutionDetails;
import lombok.Data;

import java.util.List;

@Data
public class ExecutiveDetailsResponse {
    private List<ExecutionDetails> data;
}