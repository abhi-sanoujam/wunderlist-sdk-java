package com.sanoujam.wunderlist;

import com.sanoujam.wunderlist.impl.WunderlistClientImpl;

public class WunderlistClientFactory {

  /**
   * Refer to https://developer.wunderlist.com/documentation/concepts/authorization
   *
   * @param clientId client id of the app
   * @param accessToken user provided access token
   * @return WunderlistClient that will use the provided clientId and accessToken
   */
  public static WunderlistClient createClient(String clientId, String accessToken) {
    return new WunderlistClientImpl(clientId, accessToken);
  }
}
