package com.sanoujam.wunderlist.impl;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Throwables;
import com.google.common.reflect.TypeToken;
import com.sanoujam.wunderlist.model.WLList;
import com.sanoujam.wunderlist.operations.WLListOperations;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WLListOperationsImpl implements WLListOperations {

  private static final Type listType = new TypeToken<ArrayList<WLList>>() {}.getType();

  private final Auth auth;
  private final HTTPClientProvider httpClientProvider;

  public WLListOperationsImpl(Auth auth, HTTPClientProvider httpClientProvider) {
    this.auth = auth;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public List<WLList> getAllLists() {
    try {
      return (List<WLList>)
          httpClientProvider.createGetRequest(auth, new GenericUrl("http://a.wunderlist.com/api/v1/lists")).execute().parseAs(listType);
    } catch (IOException e) {
      throw Throwables.propagate(e);
    }
  }

  @Override
  public WLList getList(long id) {
    try {
      return httpClientProvider
          .createGetRequest(auth, new GenericUrl("http://a.wunderlist.com/api/v1/lists/" + id))
          .execute()
          .parseAs(WLList.class);
    } catch (IOException e) {
      throw Throwables.propagate(e);
    }
  }
}
