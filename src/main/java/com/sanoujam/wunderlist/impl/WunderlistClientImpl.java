package com.sanoujam.wunderlist.impl;

import com.sanoujam.wunderlist.WunderlistClient;
import com.sanoujam.wunderlist.operations.WLListOperations;
import com.sanoujam.wunderlist.operations.WLTaskOperations;

public class WunderlistClientImpl implements WunderlistClient {

  private final Auth auth;
  private final HTTPClientProvider httpClientProvider;
  private final WLListOperationsImpl wlListOperations;
  private final WLTaskOperationsImpl wlTaskOperations;

  public WunderlistClientImpl(String clientId, String accessToken) {
    this.auth = new Auth(clientId, accessToken);
    this.httpClientProvider = new HTTPClientProvider();
    wlListOperations = new WLListOperationsImpl(auth, httpClientProvider);
    wlTaskOperations = new WLTaskOperationsImpl(auth, httpClientProvider);
  }

  @Override
  public WLListOperations listOperations() {
    return wlListOperations;
  }

  @Override
  public WLTaskOperations taskOperations() {
    return wlTaskOperations;
  }
}
