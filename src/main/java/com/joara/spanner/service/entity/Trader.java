package com.joara.spanner.service.entity;

import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.NotMapped;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

@Table(name = "traders")
public class Trader {

  @PrimaryKey
  @Column(name = "trader_id")
  String traderId;

  String firstName;

  String lastName;

  @NotMapped
  Double temporaryNumber;
}
