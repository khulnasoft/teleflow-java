package com.teleflow.api.blueprints.pojos;

import lombok.Data;

import java.util.List;

@Data
public class General {
   private String name;
   private List<Blueprint> blueprints;
}