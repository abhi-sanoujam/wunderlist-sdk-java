package com.sanoujam.wunderlist.impl;

public class Auth {

  private final String clientId;
  private final String accessToken;

  public Auth(String clientId, String accessToken) {
    this.clientId = clientId;
    this.accessToken = accessToken;
  }

  public String getClientId() {
    return clientId;
  }

  public String getAccessToken() {
    return accessToken;
  }
}
