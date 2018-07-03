package com.sanoujam.wunderlist.operations;

import com.sanoujam.wunderlist.model.WLList;
import java.util.List;

public interface WLListOperations {

  List<WLList> getAllLists();

  WLList getList(long id);
}
