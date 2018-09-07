package com.sanoujam.wunderlist.operations;

import com.sanoujam.wunderlist.model.WLTask;
import java.util.List;

public interface WLTaskOperations {

  List<WLTask> getTasksForList(long listId, boolean completed);

  WLTask getTask(long taskId);
}
