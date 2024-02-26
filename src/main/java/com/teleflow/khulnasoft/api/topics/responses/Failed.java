package com.teleflow.khulnasoft.api.topics.responses;

import lombok.Data;

import java.util.List;

@Data
public class Failed {
    private List<String> notFound;

}
