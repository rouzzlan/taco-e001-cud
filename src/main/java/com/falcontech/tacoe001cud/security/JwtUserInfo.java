package com.falcontech.tacoe001cud.security;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class JwtUserInfo {
  private String uid;
  private String name;
  private String email;
}
