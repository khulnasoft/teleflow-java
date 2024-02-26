package com.teleflow.khulnasoft.api.blueprints.responses;
import com.teleflow.khulnasoft.api.blueprints.pojos.General;
import com.teleflow.khulnasoft.api.blueprints.pojos.Popular;
import lombok.Data;

import java.util.List;

@Data
public class BlueprintsResponseData {
   private List<General> general;
   private Popular popular;
}