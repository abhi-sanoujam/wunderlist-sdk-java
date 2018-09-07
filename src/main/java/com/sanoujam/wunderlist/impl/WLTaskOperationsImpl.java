package com.sanoujam.wunderlist.impl;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;
import com.google.api.client.util.Throwables;
import com.google.common.reflect.TypeToken;
import com.sanoujam.wunderlist.model.WLTask;
import com.sanoujam.wunderlist.operations.WLTaskOperations;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WLTaskOperationsImpl implements WLTaskOperations {

  private static final Type listType = new TypeToken<ArrayList<WLTask>>() {}.getType();

  private final Auth auth;
  private final HTTPClientProvider httpClientProvider;

  public WLTaskOperationsImpl(Auth auth, HTTPClientProvider httpClientProvider) {
    this.auth = auth;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public List<WLTask> getTasksForList(long listId, boolean completed) {
    try {
      return (List<WLTask>)
          httpClientProvider
              .createGetRequest(auth, new GetTasksUrl(listId, completed))
              .execute()
              .parseAs(listType);
    } catch (IOException e) {
      throw Throwables.propagate(e);
    }
  }

  @Override
  public WLTask getTask(long taskId) {
    try {
      return httpClientProvider
          .createGetRequest(auth, new GenericUrl("http://a.wunderlist.com/api/v1/tasks/" + taskId))
          .execute()
          .parseAs(WLTask.class);
    } catch (IOException e) {
      throw Throwables.propagate(e);
    }
  }

  private static class GetTasksUrl extends GenericUrl {
    @Key("list_id")
    private final long listId;

    @Key("completed")
    private final boolean completed;

    public GetTasksUrl(long listId, boolean completed) {
      super("http://a.wunderlist.com/api/v1/tasks");
      this.listId = listId;
      this.completed = completed;
    }
  }
}
