package com.sanoujam.wunderlist.impl;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import java.io.IOException;

class HTTPClientProvider {

  static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
  static final JsonFactory JSON_FACTORY = new GsonFactory();

  private final HttpRequestFactory requestFactory;

  HTTPClientProvider() {
    requestFactory =
        HTTP_TRANSPORT.createRequestFactory(
            request -> request.setParser(new JsonObjectParser(JSON_FACTORY)));
  }

  HttpRequest createGetRequest(Auth auth, GenericUrl url) throws IOException {
    HttpRequest request = requestFactory.buildGetRequest(url);
    HttpHeaders headers = new HttpHeaders();
    headers.set("X-Client-ID", auth.getClientId());
    headers.set("X-Access-Token", auth.getAccessToken());
    request.setHeaders(headers);
    return request;
  }
}
